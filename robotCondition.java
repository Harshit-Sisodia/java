import java.util.*;

public class robotCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 or 2 or 3");
        int a = sc.nextInt() ;

        // method 1
        // if(a == 1){
        //     System.out.println("Hello!") ;
        // }
        // else if(a == 2){
        //     System.out.println("Namste!");
        // }
        // else if(a == 3){
        //     System.out.println("Hola!");
        // }
        // else{
        //     System.out.println("Invalid Input");
        // }




        // method of using switch case statements

        switch (a) {
            case 1:
            System.out.println("Namste!");
                break;
            case 2:
            System.out.println("hello");
                // break;
            case 3:
            System.out.println("hola");
                break;
        
            default:
            System.out.println("invalid key!");
                break;
        }

    }
}
