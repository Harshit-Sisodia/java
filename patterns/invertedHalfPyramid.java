import java.util.*;

public class invertedHalfPyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines:");
        int n = sc.nextInt();
        int temp=n;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<temp; j++)
            {
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }

}
