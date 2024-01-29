public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        double discount = (double) getCustomerDiscount() / 100;
        return amount - (amount * discount);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                ", customerID=" + getCustomerID() +
                ", customerName='" + getCustomerName() + '\'' +
                ", customerDiscount=" + getCustomerDiscount() +
                ", amountAfterDiscount=" + getAmountAfterDiscount() +
                '}';
    }
}
