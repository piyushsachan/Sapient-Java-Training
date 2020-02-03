public class TwoDimensionalArray{
    static int rowValue = 4;
    static int columnValue = 4 ;
    static int value = 0;
    public static void main(String[] args) {
        
        int twoDimensionalArray[][] = new int[rowValue][columnValue];
        populateArray(twoDimensionalArray);
        printArrayValues(twoDimensionalArray);
    }
    private static void populateArray(int[][] twoDimensionalArray){
        for (int row = 0; row < rowValue; row++) {
            for (int col = 0; col < columnValue; col++) {
                {
                    twoDimensionalArray[row][col] = value++;
                }
            }
            
        }
    }
    private static void printArrayValues(int[][] twoDimensionalArray){
        for (int row = 0; row < rowValue; row++) {
            for (int col = 0; col < columnValue; col++) {
                {
                    System.out.print(twoDimensionalArray[row][col] + "\t");
                }
            }
            System.out.println();
        }

    }
}