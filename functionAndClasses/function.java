import java.util.*;
public class function {

    public static void printMyName(String name)    //function declaration and definition
    {
        System.out.println(name);
        // we can write return if we want.
    }
    
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        String name = sc.next();
        printMyName(name);    // function call

    }
}
