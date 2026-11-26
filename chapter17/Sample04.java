public class Sample04 {

    static void divide(int a, int b){
        try {
            System.out.println("result: " + (a/b));
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally {                               //run cleanup whether the operation succeeds or fails
            System.out.println("Cleanup runs");
        }
        System.out.println("Continue.");
    }
    public static void main(String[] args) {
        divide(10, 2);
        System.out.println();
        divide(10, 0);
    }
}
