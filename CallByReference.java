public class CallByReference{
    public static void main(String[] args) {
        int primitiveValue = 100;
        int[] intArray = new int[10];
        callByValue(primitiveValue);
        System.out.println("The value of primitiveValue afer execution is: " + primitiveValue);
        callByReference(intArray);
        System.out.println("The value of array element afer execution is: " + intArray[0]);
    }

    public static void callByValue(int value){
        ++value;
    }

    public static void callByReference(int[] array){
        System.out.println("Within the callByRefence method the value of array is : " + array[0]);
        array[0] = 15;
        System.out.println("Within the callByRefence method, after setting the value of array is : " + array[0]);
    }
}