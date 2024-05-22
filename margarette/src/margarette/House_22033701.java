package margarette;


import java.util.ArrayList;

public class House_22033701 {
    private String address;
    private ArrayList<Room_22033701> rooms;

    public House_22033701(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();
    }

  
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public ArrayList<Room_22033701> getRooms() { return rooms; }
    public void addRoom(Room_22033701 room) { this.rooms.add(room); }

    public double calculateTotalPaintCost() {
        double totalCost = 0;
        for (Room_22033701 room : rooms) {
            totalCost += room.calculatePaintNeeded() * room.getPaint().getPricePerLitre();
        }
        return totalCost;
    }

    public double calculateTotalPaintTime() {
        double totalTime = 0;
        for (Room_22033701 room : rooms) {
            totalTime += room.calculateSurfaceArea() * room.getCoats();
        }
        return totalTime / 10; // assuming 10 square meters per hour
    }

    @Override
    public String toString() {
        return "House [address=" + address + ", rooms=" + rooms + "]";
    }
}
