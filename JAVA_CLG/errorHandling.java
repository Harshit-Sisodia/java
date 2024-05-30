public class errorHandling {

    // public static void main(String[] args) {
    //     int[] myNumbers = {1, 2, 3};
    //     try {
    //         System.out.println(myNumbers[10]);
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Something went wrong.");
    //     }
    //     System.out.println("The 'try catch' is finished.");
        
    // }
    
        public static void main(String[] args) {
            try {
                int[] arr = {1, 2, 3};
                try {
                    System.out.println(arr[3]); 
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Caught ArrayIndexOutOfBoundsException in inner try-catch");
                }e
            } catch (Exception e) {
                System.out.println("Caught Exception in outer try-catch");
            }
        }
    }
