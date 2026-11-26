package chapter05;

public class Sample02 {
    public static boolean isAdult(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean checkadult = isAdult(20);
        System.out.println(checkadult);
    }
}
