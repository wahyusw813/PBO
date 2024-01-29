public class testBall {
    public static void main(String[] args) {
        // x = 10, y = 15, r = 5, deltaX = 2, deltaY = -1.5
        Ball ball = new Ball(10.0f, 15.0f, 5, 2.0f, -1.5f);

        System.out.println("Informasi awal: " + ball);

        ball.move();
        
        System.out.println("Setelah bergerak: " + ball);

        ball.reflectHorizontal();
        System.out.println("Setelah dipantulkan secara horizontal: " + ball);

        ball.reflectVertical();
        System.out.println("Setelah dipantulkan secara vertikal: " + ball);

        ball.setX(5.0f);
        ball.setY(15.0f);
        ball.setxDelta(-1.0f);
        ball.setyDelta(2.5f);
        System.out.println("Setelah di set: " + ball);
    }
}
