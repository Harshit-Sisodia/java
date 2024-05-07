public class jaggedArray {
    
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        
        // Initialize each row with different lengths
        jaggedArray[0] = new int[] {1, 2, 3};
        jaggedArray[1] = new int[] {4, 5};
        jaggedArray[2] = new int[] {6, 7, 8, 9};
        
        // Print the elements of the jagged array
        System.out.println("Elements of the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // // Calculate and print the sum of each row
        // System.out.println("\nSum of each row:");
        // for (int i = 0; i < jaggedArray.length; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < jaggedArray[i].length; j++) {
        //         sum += jaggedArray[i][j];
        //     }
        //     System.out.println("Row " + i + ": " + sum);
        // }
    }
}
