public class testCustomer {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Wahyu Satrio Widodo", 10);
        Customer customer2 = new Customer(2, "Widodo", 5);

        // Getter
        System.out.println("Customer 1 Details:");
        System.out.println("ID: " + customer1.getId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Discount: " + customer1.getDiscount());
        System.out.println("ToString: " + customer1.toString());
        System.out.println();

        System.out.println("Customer 2 Details:");
        System.out.println("ID: " + customer2.getId());
        System.out.println("Name: " + customer2.getName());
        System.out.println("Discount: " + customer2.getDiscount());
        System.out.println("ToString: " + customer2.toString());
        System.out.println();

        // Setter
        System.out.println("Set for Customer 1");
        customer1.setDiscount(15);
        System.out.println("Updated Customer 1 Details:");
        System.out.println("ID: " + customer1.getId());
        System.out.println("Name: " + customer1.getName());
        System.out.println("Discount: " + customer1.getDiscount());
        System.out.println("ToString: " + customer1.toString());
    }
}

