
import java.util.*;

public class sum {

    public static void main(String[] args) {
        // sum of N Natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();


        int sum =0;
        for( int i=0; i<=n; i++ )
        {
            sum = sum + i;
        }
        System.out.println("the sum of "+n+" natural numbers is "+sum);

    }
    
}
