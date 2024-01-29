public class testMyPoint {
    public static void main(String[] args) {
        // Create instances of MyPoint
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(6, 8);

        // Test getX and getY methods
        System.out.println("Titik ke-1 = (X: " + point1.getX() + ", Y: " + point1.getY() + ")");

        // Test setX and setY methods
        point1.setX(1);
        point1.setY(2);
        System.out.println("Titik ke-1 (X: " + point1.getX() + ", Updated Y: )" + point1.getY());

        int[] xy = point2.getXY();
        System.out.println("Titik ke-2 = (" + xy[0] + "," + xy[1] + ")");
        point2.setXY(10, 12);
        System.out.println("Titik ke-2 = " + point2);

        System.out.println("Titik ke-1 toString: " + point1.toString());
        System.out.println("Titik ke-2 toString: " + point2.toString());

        System.out.println("Jarak anrata titik 1 dengan titik 2: " + point1.distance(point2));
        System.out.println("Jarak titik asal ke titik 1: " + point1.distance());
        System.out.println("Jarak dari titik (1, 1) ke titik 2: " + point2.distance(1, 1));
    }
}
