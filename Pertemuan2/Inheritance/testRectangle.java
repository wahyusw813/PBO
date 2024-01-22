public class testRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.toString()); // Output: Rectangle[Shape[color=red, filled=true], width=1.0, length=1.0]

        Rectangle rectangle2 = new Rectangle(2.5, 4.0, "blue", false);
        System.out.println(rectangle2.toString()); // Output: Rectangle[Shape[color=blue, filled=false], width=2.5, length=4.0]

        rectangle1.setWidth(3.0);
        rectangle1.setLength(5.0);
        rectangle1.setColor("green");
        rectangle1.setFilled(true);

        double area = rectangle1.getArea();
        double perimeter = rectangle1.getPerimeter();

        // Menampilkan hasil
        System.out.println("Width: " + rectangle1.getWidth()); // Output: Width: 3.0
        System.out.println("Length: " + rectangle1.getLength()); // Output: Length: 5.0
        System.out.println("Area: " + area); // Output: Area: 15.0
        System.out.println("Perimeter: " + perimeter); // Output: Perimeter: 16.0
        System.out.println(rectangle1.toString()); // Output: Rectangle[Shape[color=green, filled=true], width=3.0, length=5.0]
    }
}
