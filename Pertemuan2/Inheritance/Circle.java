public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super(); // Call the default constructor of Shape
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super(); // Call the default constructor of Shape
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled); // Call the parameterized constructor of Shape
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
