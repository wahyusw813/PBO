public class testShape {

    public static void main(String[] args) {
        // Create a default Shape
        Shape defaultShape = new Shape();
        System.out.println("Default Shape: " + defaultShape);

        // Create a Shape with custom color and filled status
        Shape customShape = new Shape("blue", false);
        System.out.println("Custom Shape: " + customShape);

        // Get and set color and filled status
        defaultShape.setColor("green");
        defaultShape.setFilled(true);

        System.out.println("Updated Default Shape: " + defaultShape);

        // Display color and filled status using accessor methods
        System.out.println("Color of Custom Shape: " + customShape.getColor());
        System.out.println("Is Custom Shape filled? " + customShape.isFilled());
    }
}
