public class testComposeCircle {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, "Red", 10.0);

        System.out.println("Volume of the Cylinder: " + cylinder.calculateVolume());
        System.out.println("Color of the Circle: " + cylinder.getColor());
        System.out.println("Height of the Cylinder: " + cylinder.getHeight());
    }
}
