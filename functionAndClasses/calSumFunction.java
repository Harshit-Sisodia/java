import java.util.*;

// making a function to calculate the sum of two integer

public class calSumFunction {
    
    public static int calSum(int a,int b)
    {
        int c;
         c = a+b;
         return c;
    }

    public static void main(String[] args) {
        int a,b;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a= sc.nextInt();
        System.out.println("Enter the value of b:");
        b= sc.nextInt();

        int c = calSum(a, b);

        System.out.println("The sum of a and b is :"+ c);



    }
}
