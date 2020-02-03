/**
 * This class demonstrate the Data Types available in java
 * @author Piyush
 * @version 1.0
 * @since 1.0
 */
public class DataTypes{
    public static void main(String[] args){
        byte b1 = 33;
        int i1 = 1200;
        b1 = (byte)i1; //Type mismatch: cannot convert from int to byte so use explicit typecasting
        System.out.println("The value of B1 is : " + b1);

        //Primitive Data Types
        byte byteValue = 100;
        int intValue = 500;
        short shortValue = 400;
        boolean flag = true;
        char c = 'a';
        long numberOEmployees = 3_40_000;    //new feature in java 6 to allow readability
        float distanceFromOffice = 34.56F;
        double distanceFromHome = 300.345;
    }
}