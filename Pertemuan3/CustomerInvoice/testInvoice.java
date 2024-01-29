public class testInvoice {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Wahyu Satrio Widodo", 10);

        Invoice invoice1 = new Invoice(1001, customer, 100.0);
        Invoice invoice2 = new Invoice(1002, customer, 150.0);

        System.out.println("Customer Information:");
        System.out.println(customer);

        System.out.println("\nInvoice Information:");
        System.out.println(invoice1);
        System.out.println(invoice2);

        customer.setDiscount(15);
        System.out.println("\nUpdated Customer Information:");
        System.out.println(customer);

        System.out.println("\nUpdated Invoice Information:");
        System.out.println(invoice1);
        System.out.println(invoice2);

        System.out.println("\nAmount After Discount for Invoice 1: $" + invoice1.getAmountAfterDiscount());
        System.out.println("Amount After Discount for Invoice 2: $" + invoice2.getAmountAfterDiscount());
    }
}
