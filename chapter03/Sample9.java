package chapter03;

import java.util.Scanner;

public class Sample9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.print("名前を入力してください（空のままEnterで終了）: ");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            }
            System.out.println("こんにちは、" + name + "さん！");
        }

        System.out.println("プログラムを終了します");
        input.close();     
    }
}
