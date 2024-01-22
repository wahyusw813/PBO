public class testSquare {

    public static void main(String[] args) {
        Square square1 = new Square();
        
        Square square2 = new Square(5.0, "red", true);

        // Menampilkan informasi objek square1
        System.out.println("Square 1:");
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("Color: " + square1.getColor());
        System.out.println("Filled: " + square1.isFilled());
        System.out.println("Side: " + square1.getSide());
        System.out.println("String Representation: " + square1.toString());
        System.out.println();

        // Menampilkan informasi objek square2
        System.out.println("Square 2:");
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        System.out.println("Color: " + square2.getColor());
        System.out.println("Filled: " + square2.isFilled());
        System.out.println("Side: " + square2.getSide());
        System.out.println("String Representation: " + square2.toString());
    }
}

