public class testStaff {

    public static void main(String[] args) {
        // Create a Staff object
        Staff staff1 = new Staff("Widodo", "Jakarta", "STIS", 50000.00);

        // Display information using toString method
        System.out.println("Staff Information:");
        System.out.println(staff1);

        // Accessing methods from the Person class
        System.out.println("\nPerson Information:");
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());

        // Accessing methods specific to the Staff class
        System.out.println("\nStaff Specific Information:");
        System.out.println("School: " + staff1.getSchool());
        System.out.println("Pay: $" + staff1.getPay());

        // Updating information
        staff1.setAddress("Jakarta Timur");
        staff1.setPay(55000.00);

        // Display updated information
        System.out.println("\nUpdated Staff Information:");
        System.out.println(staff1);
    }
}

