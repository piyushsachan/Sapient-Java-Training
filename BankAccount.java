public class BankAccount{
    double accountBalance = 0;

    

    public double checkBalance(){
        return this.accountBalance;
    }
    public double deposit(int depositAmount){
        System.out.println(depositAmount + " is the amount Deposited");
        this.accountBalance =  this.accountBalance + depositAmount;
        return this.accountBalance;
    }
    public double withdraw( double withdrawAmount){
        if(withdrawAmount > this.accountBalance){
            System.out.println("Not sufficient balance");
            return this.accountBalance;
        }
        System.out.println(withdrawAmount + " is the amount Withdrawn");
        this.accountBalance =  this.accountBalance - withdrawAmount;
        return this.accountBalance;
        
    }
}