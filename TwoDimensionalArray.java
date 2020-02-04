public class TwoDimensionalArray {
    static  int rowCount = 4;
    static int colCount = 4;
    static int value = 10;
    public static void main(String[] args) {
        int twoDimensionalArray[][] = new int[rowCount][colCount];

        populateArray(twoDimensionalArray);
        printArrayValues(twoDimensionalArray);

    }

    private static void populateArray(int[][] twoDimensionalArray) {
        //populate items in the array
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                twoDimensionalArray[row][col] = value++;
            }
        }
    }

    private static void printArrayValues(int[][] twoDimensionalArray){
        //print the array
        for (int row = 0; row < rowCount; row++) {
            //print the columns
            for (int col = 0; col < colCount; col++) {
                System.out.print(twoDimensionalArray[row][col]+ "\t");
            }
            //break to next line to display the row
            System.out.println();
        }
    }
    
}