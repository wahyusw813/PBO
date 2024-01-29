import java.util.Date;
class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" + "customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
                + ", productExpense=" + productExpense + '}';
    }
}
