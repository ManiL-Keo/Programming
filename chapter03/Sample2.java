package chapter03;

// import java.util.Scanner;
// import java.util.Random;

public class Sample2 {
    public static void main(String[] args) {
    
        int month = 12;
        switch (month){
            case 12 -> { //method 2
                System.out.println("年末です");
            }
            case 1 -> {
                System.out.println("年始です");
            }
            default -> {
                System.out.println("普通の月です");
            }
        }


    }
}
