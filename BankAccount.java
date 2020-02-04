public class BankAccount {

    private double accountBalance = 10_000; 
    private Address address;
    private AccountType accountType;
    private long accountId;
    private static long INITAL_ACCOUNT_ID_VALUE = 10_000;

    public BankAccount(AccountType accountType, double initalDepositAmount,  Address address){
        if(initalDepositAmount > 10_000){
            this.accountBalance = initalDepositAmount;
        }
        this.accountType = accountType;
        this.address = address;
        this.accountId  = ++ INITAL_ACCOUNT_ID_VALUE;
    }

    public BankAccount( AccountType accountType, Address address){
        this.accountType = accountType;
        this.address = address;
        this.accountId  = ++ INITAL_ACCOUNT_ID_VALUE;
    }


    public void deposit(double amount ){
        this.accountBalance += amount;
    }

    public double withdraw(double amount ) {

        switch(this.accountType){
            case CURRENT_ACCOUNT:
                break;
            case SALARIED_ACCOUNT:
                break;
            case SAVINGS_ACCOUNT:
                break;        
        }
        if( (this.accountBalance - amount) > 10_000){
            this.accountBalance  = this.accountBalance - amount;
            return amount;
        } 
        return 0;
   }

   public double checkAccountBalance(){
       return this.accountBalance;
   }

   public void updateAddress(Address address){
       this.address = address;
   }

   public AccountType getAccountType(){
       return this.accountType;
   }

   public long getAccountId(){
       return this.accountId;
   }

   public static long getAccountIdValue(){
       return INITAL_ACCOUNT_ID_VALUE;
   }

}