public class PaymentGatewayClient{
    public static void main(String[] args) {
        PaymentGateway gateway = new GooglePay();
        if (args[0].equals("1")){
            gateway = new GooglePay();
        }
        else if(args[0].equals("2")){
            gateway = new Paytm();
        }
        gateway.pay("Kiran","Vinay",2000,"Transfer Money");
    }
}