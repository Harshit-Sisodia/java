package java_programs;

class calculator {

    // Method overloading: multiple methods of same name but have different parameters.
    // like here there are three add methods having different parameters.
    
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int a = 34;
        int b = 65;
        double c=78.6 ;

        int sum = obj.add(a, b);
        System.out.println(sum);

        sum = obj.add(34, 45, 89);
        System.out.println(sum);
        
        double sum2;
        // a = 78.78;   cant convert int into double
        System.out.println("the value of a:"+a);
        sum2 = obj.add(34.8,89);
        System.out.println(sum);


    }

}
