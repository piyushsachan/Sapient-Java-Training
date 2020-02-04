public class CalculatorClient {
    public static void main(String[] args) {
        //data-type variable-name = new Data-Type();

        Calculator calculator = new Calculator();
        System.out.println("Result of sum is "+ calculator.add(34, 45));
        System.out.println("Result of difference is "+ calculator.substract(877, 45));
        System.out.println("Result of product  is "+ calculator.substract(877, 455));
        System.out.println("Result of division  is "+ calculator.division(877, 455));
        System.out.println("Result of modulo  is "+ calculator.modulo(877, 7));
    }
}