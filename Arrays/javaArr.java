package Arrays;
import java.util.*; 

// input the elements of array with the help of loops and then printing their values

public class javaArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];


        // Direct insertion of elements of the array
        // arr[0]=4;     
        // arr[1]=5;
        // arr[2]=3;

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the value of arr["+i+"]: ");
           arr[i]= sc.nextInt();
        }

        System.out.println("The value of array is :");
        for(int i=0; i<3; i++)
        {
            System.out.print(" "+arr[i]);
        }

        
    }
    
}
