
package margarette;
import java.io.*;
import java.util.*;

public class Main_22033701 {
	 private static ArrayList<Paint_22033701> paints = new ArrayList<>();
	    private static ArrayList<House_22033701> houses = new ArrayList<>();


    public static void main(String[] args) {
        loadPaints("paints.txt");
        loadHouses("houses.txt");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    generatePaintPriceReport();
                    break;
                case 2:
                    addNewPaint(scanner);
                    break;
                case 3:
                    editPaintPrice(scanner);
                    break;
                case 4:
                    generateHousePaintingReport(scanner);
                    break;
                case 5:
                    addNewHouse(scanner);
                    break;
                case 6:
                    saveData();
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Generate Paint Price Report.");
        System.out.println("2. Add a New Paint.");
        System.out.println("3. Edit Paint Price.");
        System.out.println("4. Generate House Painting Report.");
        System.out.println("5. Add a New House for Painting.");
        System.out.println("6. Save Data.");
        System.out.println("7. Exit Program.");
        System.out.print("Enter your choice: ");
    }

    private static void loadPaints(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Paint_22033701 paint = new Paint_22033701(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]));
                paints.add(paint);
            }
        } catch (IOException e) {
            System.out.println("Error loading paints: " + e.getMessage());
        }
    }

    private static void loadHouses(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
            	House_22033701 house = new House_22033701(line);
                houses.add(house);
            }
        } catch (IOException e) {
            System.out.println("Error loading houses: " + e.getMessage());
        }
    }

    private static void generatePaintPriceReport() {
        System.out.println("Paint Price Report:");
        for (Paint_22033701 paint : paints) {
            System.out.println(paint);
        }
    }

    private static void addNewPaint(Scanner scanner) {
        System.out.print("Enter barcode: ");
        String barcode = scanner.nextLine();
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter sheen: ");
        String sheen = scanner.nextLine();
        System.out.print("Enter price per litre: ");
        double pricePerLitre = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Paint_22033701 paint = new Paint_22033701(barcode, brand, color, sheen, pricePerLitre);
        paints.add(paint);
        System.out.println("Paint added successfully.");
    }

    private static void editPaintPrice(Scanner scanner) {
        System.out.print("Enter the barcode of the paint to edit: ");
        String barcode = scanner.nextLine();

        for (Paint_22033701 paint : paints) {
            if (paint.getBarcode().equals(barcode)) {
                System.out.print("Enter new price per litre: ");
                double newPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                paint.setPricePerLitre(newPrice);
                System.out.println("Paint price updated successfully.");
                return;
            }
        }
        System.out.println("Paint with the given barcode not found.");
    }

    private static void generateHousePaintingReport(Scanner scanner) {
        System.out.print("Enter the address of the house: ");
        String address = scanner.nextLine();

        for (House_22033701 house : houses) {
            if (house.getAddress().equals(address)) {
                System.out.println("House Painting Report:");
                System.out.println("Address: " + house.getAddress());
                System.out.println("Total Paint Cost: $" + house.calculateTotalPaintCost());
                System.out.println("Total Paint Time: " + house.calculateTotalPaintTime() + " hours");
                return;
            }
        }
        System.out.println("House with the given address not found.");
    }

    private static void addNewHouse(Scanner scanner) {
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        House_22033701 house = new House_22033701(address);
        houses.add(house);
        System.out.println("House added successfully.");
    }

    private static void saveData() {
        try (PrintWriter paintWriter = new PrintWriter(new FileWriter("paints.txt"));
             PrintWriter houseWriter = new PrintWriter(new FileWriter("houses.txt"))) {
            for (Paint_22033701 paint : paints) {
                paintWriter.println(paint.getBarcode() + "," + paint.getBrand() + "," + paint.getColor() + "," + paint.getSheen() + "," + paint.getPricePerLitre());
            }
            for (House_22033701 house : houses) {
                houseWriter.println(house.getAddress());
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
        System.out.println("Data saved successfully.");
    }
}
