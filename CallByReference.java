public class CallByReference {
    public static void main(String[] args) {
        
        int primitiveValue = 100;
        int[] intArray = new int[10];
        callbyValue(primitiveValue);
        System.out.println("The value of primitiveValue after execution : "+primitiveValue);
        
        callByReference(intArray);
        System.out.println("The value of array element after execution : "+intArray[0]);
    }

    public static void callbyValue(int value){
            ++value;
    }

    public static void callByReference(int[] array){
        System.out.println("Withing the callByReference method the value of array is "+array[0]);
        array[0] = 15;
        System.out.println("Withing the callByReference method, after setting the value of array is "+array[0]);

    }
}