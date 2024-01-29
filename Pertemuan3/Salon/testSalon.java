import java.util.Date;
public class testSalon {

    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Wahyu", true, "premium");
        Customer customer2 = new Customer("Widodo", false, "");

        // Create visits
        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(50.0);
        visit1.setProductExpense(20.0);

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(30.0);
        visit2.setProductExpense(15.0);

        // Display visits
        System.out.println("Visit 1: " + visit1);
        System.out.println("Visit 2: " + visit2);

        // Calculate and display total expenses with discounts
        System.out.println("Total Pengeluaran Visit 1 setelah diskon: $" + calculateTotalExpenseWithDiscount(visit1));
        System.out.println("Total Pengeluaran Visit 2 setelah diskon: $" + calculateTotalExpenseWithDiscount(visit2));
    }

    private static double calculateTotalExpenseWithDiscount(Visit visit) {
        double serviceDiscount = DiscountRate.getServiceDiscountRate(visit.getCustomer().getMemberType());
        double productDiscount = DiscountRate.getProductDiscountRate(visit.getCustomer().getMemberType());

        double totalServiceExpense = visit.getServiceExpense() - (visit.getServiceExpense() * serviceDiscount);
        double totalProductExpense = visit.getProductExpense() - (visit.getProductExpense() * productDiscount);

        return totalServiceExpense + totalProductExpense;
    }
}
