public class ClientAccount{
       public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Remaining balance : " + bankAccount.deposit(200));
        System.out.println(bankAccount.checkBalance());
        System.out.println("Remaining balance : " + bankAccount.withdraw(300));
    }
}