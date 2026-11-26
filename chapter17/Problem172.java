public class Problem172 {
    public static void main(String[] args) {
        String s = null;
        try {
             System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("The string is null!");
        }
        System.out.println("finished");
    }
}
