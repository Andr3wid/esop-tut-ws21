public class Basic2DArrOperations {
    public static void main(String[] args) {
        // int[][] arr = new int[3][5]; // first index is the number of rows, second the number of elements / cols per row
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        arr[0][0] = 0;
        System.out.println("First column in the first row: " + arr[0][0]);
        System.out.println("First column in the second row: " + arr[1][0]);

        // printing the whole 2d array
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
