public class testEmployee {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Wahyu", "Widodo", 2000);

        System.out.println("Informasi Awal:");
        System.out.println(employee1);

        System.out.println("\nInformasi menggunakan getter:");
        System.out.println("ID: " + employee1.getID());
        System.out.println("First Name: " + employee1.getFirstName());
        System.out.println("Last Name: " + employee1.getLastName());
        System.out.println("Full Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Annual Salary: " + employee1.getAnnualSalary());

        int raiseAmount = employee1.raiseSalary(10);
        System.out.println("\nGaji dinaikkan sebesar 10%");
        System.out.println("Raise Amount: " + raiseAmount);
        System.out.println("Informasi setelah kenaikan gaji:");
        System.out.println(employee1);

        employee1.setSalary(2000);
        System.out.println("\nGaji diubah secara langsung menjadi 2000");
        System.out.println("Informasi setelah perubahan gaji:");
        System.out.println(employee1);
    }
}
