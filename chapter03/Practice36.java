package chapter03;

import java.util.Scanner;
import java.util.Random;


public class Practice36 {
    public static void main(String[] args) {
        System.out.println("数あてゲーム");
        Scanner input = new Scanner(System.in);
        int ans = new Random().nextInt(10);

        for (int i = 0; i<5; i++){
            System.out.println("0~9の数字を入力してください");
            int num = input.nextInt();
            if (num == ans){
                System.out.println("アタリ");
                break;
            }
            else{
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
        input.close();

    }
}
