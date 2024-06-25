package java_programs;

class calculate {

    public int add(int a, int b)     // method for adding
    {
        int result = a + b;

        // System.out.println("add the value "+result);
        System.out.println("we are in add");
        return result;
    }
}

static int add2(int a, int b)
{
    int result  = a + b;
    System.out.println("we are in add 2");
    return result;
}

public class classes {

    public static void main(String[] args) {

        int a = 54;
        int b = 34;

        // int result = a+b;

        // System.out.println(result);

        // making an object

        int result;


        calculate calc = new calculate();
        result = calc.add(a,b);

        System.out.println("The value of add is "+result);

        int result2;
        result = add2(a, b);
        
    }
    
}
