public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super(); // Memanggil konstruktor default dari superclass Shape
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super(); // Memanggil konstruktor default dari superclass Shape
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Memanggil konstruktor parameterized dari superclass Shape
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        // Menggunakan super.toString() untuk mendapatkan representasi String dari superclass Shape
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}