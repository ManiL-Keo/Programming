package chapter03;

import java.util.Scanner;


public class Sample7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        while(true){
            // System.out.println("数字入力してください: ");
            n = input.nextInt();

            switch (n){
                case 1:
                    System.out.println("sword");
                    break;
                case 2:
                    System.out.println("shield");
                    break;
                case 3:
                    System.out.println("potion");
                    break;
                case 0:
                    System.out.println("finish");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Option");
            }

        }

    }
}
