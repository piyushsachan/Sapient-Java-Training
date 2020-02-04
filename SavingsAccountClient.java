public class SavingsAccountClient {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount();
        SavingsAccount savingsAccount2 = new SavingsAccount();

        System.out.println("Account balance for savings account 1 is "+savingsAccount1.checkAccountBalance());
        System.out.println("Account balance for savings account 2 is "+savingsAccount2.checkAccountBalance());

        savingsAccount1.deposit(40_000);
        savingsAccount2.deposit(50_000);

        System.out.println("Account balance for savings account 1 is "+savingsAccount1.checkAccountBalance());
        System.out.println("Account balance for savings account 2 is "+savingsAccount2.checkAccountBalance());

    }
}