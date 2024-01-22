public class testAccount {
    public static void main(String[] args) {
        Account account1 = new Account("A001", "Wahyu SW");
        Account account2 = new Account("A002", "SW Wahyu", 500);
n
        System.out.println("Initial Account Information:");
        displayAccountInfo(account1);
        displayAccountInfo(account2);

        account1.credit(100);
        account2.debit(50);

        System.out.println("\nUpdated Account Information:");
        displayAccountInfo(account1);
        displayAccountInfo(account2);

        account1.transferTo(account2, 30);

        System.out.println("\nFinal Account Information:");
        displayAccountInfo(account1);
        displayAccountInfo(account2);
    }

    private static void displayAccountInfo(Account account) {
        System.out.println(account.toString());
    }
}
