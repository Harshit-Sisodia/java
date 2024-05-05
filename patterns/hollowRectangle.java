import java.util.*;

public class hollowRectangle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of rectangle(col):");
        int col = sc.nextInt();

        System.out.println("Enter the breadth of rectangle(row):");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= col; j++)
                {
                    if (i==row || j==col || i== 1 || j== 1) {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                
            }
            
        }
    }

