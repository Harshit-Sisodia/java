import java.util.*;
public class arrays {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Input number of rows and columns
            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = scanner.nextInt();
    
            // Create a 2D array with the specified dimensions
            int[][] matrix = new int[rows][columns];
    
            // Input elements into the matrix
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
    
            // Print the matrix
            System.out.println("The matrix is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
    
            scanner.close();
        }
    }
    
