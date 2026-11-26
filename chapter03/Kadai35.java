package chapter03;
import java.util.Scanner;

public class Kadai35 {
    public static void main(String[] args) {
        System.out.println("[メニュー ] 1 : 検索 2 : 登録 3 : 削除 4 : 変更>");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n){
            case 1 -> {
                System.out.println("検索します");
            }
            case 2 -> {
                System.out.println("登録します");
            }
            case 3 -> {
                System.out.println("削除します");
            }
            case 4 -> {
                System.out.println("変更します");
            }
        }
        input.close();

    }
    
}
