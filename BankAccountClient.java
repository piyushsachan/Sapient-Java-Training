public class BankAccountClient {
    public static void main(String[] args) {
        Address address = new Address("202", "4thBlock, 18th Cross, Jayanagar", "Bangalore", 577142);

        for (int i = 0; i < 10; i++) {
            
            BankAccount bankAccount1 = new BankAccount(AccountType.SAVINGS_ACCOUNT, 20000, address);
            BankAccount bankAccount2 = new BankAccount(AccountType.SALARIED_ACCOUNT,address );
            
        }
        System.out.println(BankAccount.getAccountIdValue());
    }
}