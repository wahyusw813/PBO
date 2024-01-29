public class Cylinder {
    private Circle base;  // Komposisi satu-ke-banyak dengan Circle
    private double height;

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double calculateVolume() {
        return base.Area() * height;
    }

    public String getColor() {
        return base.getColor();
    }

    public double getHeight() {
        return height;
    }
}
