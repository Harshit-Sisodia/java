import java.util.*;

public class arrayInJava {
    
    public static void main(String[] args) {
        
        int a[][]={{1,2},{2,3,4,5},{5,6,7}};
        int i,j;

        Scanner sc = new Scanner(System.in);
        a[0]=new int[2];
        a[1]= new int[4];
        a[2]= new int[3];
        
        for(i=0; i<a.length;i++)
        {
            for(j=0;j<a[i].length;)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
