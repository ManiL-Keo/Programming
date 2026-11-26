package chapter03;

public class Sample {
    public static void main(String[] args) {
        // boolean tenki = true;
        // if (tenki == true) {
        //     System.out.println("散歩をする");
        //     System.err.println("SFSFSFS");
        // } else {
        //     System.out.println("映画をみる");
        // }


        // java.util.Scanner scanner =  new java.util.Scanner(System.in);
        // System.out.println("スコアを入力してください: ");
        // int score = scanner.nextInt();

        // if (score >= 80){
        //     System.out.println("合格");
        // }
        // else{
        //     System.out.println("不合格");
        // }
        // scanner.close();



        // String answer = "はい";

        // if (answer.equals("はい")) {
        //     System.out.println("OKが選ばれました");
        // } else {
        //     System.out.println("OK以外が選ばれました");
        // }




        // int hp = 16;
        // if (hp >= 80) {
        //     System.out.println("元気");
        // } else if (hp >= 30) {
        //     System.out.println("弱っている");
        // } else if (hp >= 15) {
        //     System.out.println("超弱ってる");
        // }else{
        //     System.out.println("危険");
        // }

        int age = 20;

        if (age >= 18 && age <= 64) {
        System.out.println("大人料金です");
        }

        int signal = 1;

        switch (signal) {
        case 1:
            System.out.println("進め");
        case 2:
            System.out.println("止まれ");
            break;
        case 3:
            System.out.println("注意");
            break;
        }        
        
    }
}
