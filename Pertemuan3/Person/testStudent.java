public class testStudent {

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Wahyu Widodo", "Jakarta Timur", "DIV Komputasi Statistik", 2023, 5000.0);

        // Display the initial information
        System.out.println("Initial Student Information:");
        System.out.println(student);

        // Update student information
        student.setProgram("Sains Data");
        student.setYear(2024);
        student.setFee(5500.0);

        // Display updated information
        System.out.println("\nUpdated Student Information:");
        System.out.println(student);
    }
}
