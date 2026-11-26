package chapter03;

import java.util.Scanner;
import java.util.Random;

public class Sample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int fortune = random.nextInt(4)+1;
        System.out.println("Fortune = " + fortune);

        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("区");
                break;
        }
        input.close();



        // int month = 12;
        // switch (month) {　//method 1
        //     case 12:
        //         System.out.println("年来です");
        //         break;
        //     case 1:
        //         System.out.println("年始です");
        //         break;
        //     default:
        //         System.out.println("普通の月です");
        // }

        
    }
}
