/**
 * MultidimensionArray
 */
public class MultidimensionArray {

    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] array = {{11,22,33},{55,77},{55,32,43,42,42}};
        MultidimensionArray obj= new MultidimensionArray();
        obj.printArray(array);
    }
}