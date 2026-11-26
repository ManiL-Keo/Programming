public class Sample02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            System.out.println("before division");

            int result = a / b;
            System.out.println("Result is " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }
        System.out.println("operation finished.");

        // catch (ArithmeticException error){
        //     System.out.println("you cannot divide by zero");
        // }
        // System.out.println(error.getMessage());
    }   
}


// 1. enter the try block
// 2. print before division
// 3. attempt to calculate a/b, which throws an arithmeticException
// 4. skip the rest of the try block
// 5. excecute the matching catch
// 6. continue after the try-catch

// java does not return tp the failed line or automatically retry it