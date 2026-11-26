package chapter03;

import java.util.Scanner;


public class Sample6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int n = input.nextInt();

        switch (n){
            case 1:
                System.out.println("attack");
                break;
            case 2:
                System.out.println("heal");
                break;
            case 3:
                System.out.println("escape");
                break;
            default:
                System.out.println("error");
        }
        input.close();
    }
}
