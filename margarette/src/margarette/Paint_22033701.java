package margarette;

public class Paint_22033701 {
    private String barcode;
    private String brand;
    private String color;
    private String sheen;
    private double pricePerLitre;

    public Paint_22033701(String barcode, String brand, String color, String sheen, double pricePerLitre) {
        this.barcode = barcode;
        this.brand = brand;
        this.color = color;
        this.sheen = sheen;
        this.pricePerLitre = pricePerLitre;
    }

    // Getters and Setters
    public String getBarcode() { return barcode; }
    public void setBarcode(String barcode) { this.barcode = barcode; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getSheen() { return sheen; }
    public void setSheen(String sheen) { this.sheen = sheen; }
    public double getPricePerLitre() { return pricePerLitre; }
    public void setPricePerLitre(double pricePerLitre) { this.pricePerLitre = pricePerLitre; }

    @Override
    public String toString() {
        return "Barcode: " + barcode + ", Brand: " + brand + ", Color: " + color + ", Sheen: " + sheen + ", Price per Litre: $" + pricePerLitre;
    }
}
