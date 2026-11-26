public class Sample03 {
    public static void main(String[] args) {
        String[] values = {"10", "hello"};

        try {
            int number = Integer.parseInt(values[1]); //converts to integer
            System.out.println(100 / number);   // since values[1] = string of hello, fails.
        }
        catch (NumberFormatException e){
            System.out.println("The text is not a valid integer");
        }
        catch (ArrayIndexOutOfBoundsException  e){
            System.out.println("That array position does not exist.");
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e){
            System.out.println("Another problem occured: " + e.getMessage());
        }

        System.out.println("finished");
    }
}


