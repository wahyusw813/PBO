public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double Area(){
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }
    
}
