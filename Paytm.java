public class Paytm implements PaymentGateway{
    public void pay(String from,String to,double amount,String comments){
        System.out.println("Paid"+amount+"from"+from+"to"+to+"comments:"+comments+":using Paytm");
    }
    public void acceptPayment(String from, String to, double amount){
        System.out.println("Paid"+amount+"from"+from+"to"+to+"amount"+amount+":using Paytm");
    }

}