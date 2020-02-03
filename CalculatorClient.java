public class CalculatorClient{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum is " + calculator.add(34,55));
        System.out.println("Difference is " + calculator.substract(100,55));
        System.out.println("Product is " + calculator.product(34,55));
        System.out.println("Quotient is " + calculator.division(408,55));
        System.out.println("Modulo is " + calculator.modulo(234,55));
    }
}