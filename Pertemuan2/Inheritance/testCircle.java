public class testCircle {
    public static void main(String[] args) {
        // Test default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        System.out.println(defaultCircle);

        // Test parameterized constructor
        Circle parameterizedCircle = new Circle("blue", false, 5.0);
        System.out.println("\nParameterized Circle:");
        System.out.println(parameterizedCircle);

        // Test getters and setters
        System.out.println("\nTesting Getters and Setters:");
        System.out.println("Radius before setting: " + parameterizedCircle.getRadius());
        parameterizedCircle.setRadius(10.0);
        System.out.println("Radius after setting: " + parameterizedCircle.getRadius());

        // Test area and circumference calculation
        System.out.println("\nTesting Area and Circumference:");
        System.out.println("Area: " + parameterizedCircle.getArea());
        System.out.println("Circumference: " + parameterizedCircle.getCircumference());
    }
}
