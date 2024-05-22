package margarette;

public class Room_22033701 {
    private double length;
    private double width;
    private double height;
    private Paint_22033701 paint;
    private int coats;

    public Room_22033701(double length, double width, double height, Paint_22033701 paint, int coats) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.paint = paint;
        this.coats = coats;
    }

    // Getters and Setters
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public Paint_22033701 getPaint() { return paint; }
    public void setPaint(Paint_22033701 paint) { this.paint = paint; }
    public int getCoats() { return coats; }
    public void setCoats(int coats) { this.coats = coats; }

    public double calculateSurfaceArea() {
        return 2 * (length * height + width * height) + length * width;
    }

    public double calculatePaintNeeded() {
        return calculateSurfaceArea() * coats / 10; // 1 litre per 10 square meters
    }

    @Override
    public String toString() {
        return "Room [length=" + length + ", width=" + width + ", height=" + height + ", paint=" + paint + ", coats=" + coats + "]";
    }
}
