
import java.util.*;


public class count {

    public static void main(String[] args) {

        int n, pos = 0, neg = 0, non = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of arr[" + i + "]:");
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                non++;
            }
        }

        System.out.println("positive numbers in array: " + pos);
        System.out.println("negative numbers in array: " + pos);
        System.out.println("other numbers in array: " + non);

    }



}
