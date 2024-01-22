public class testTime {
    public static void main(String[] args) {
        // Create a Time object with initial values
        Time currentTime = new Time(12, 30, 45);

        // Display the initial time
        System.out.println("Initial Time: " + currentTime);

        // Test nextSecond()
        currentTime.nextSecond();
        System.out.println("After nextSecond(): " + currentTime);

        // Test previousSecond()
        currentTime.previousSecond();
        System.out.println("After previousSecond(): " + currentTime);

        Time beforemidnight = new Time(23, 59, 59);
        beforemidnight.nextSecond();
        System.out.println("nextSecond after 23.59.59: " + beforemidnight);

        Time midnight = new Time(0, 0, 0);
        midnight.previousSecond();
        System.out.println("After previousSecond() on midnight(00.00.00): " + midnight);
        
    }
}
