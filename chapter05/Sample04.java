package chapter05;

public class Sample04 {

    public static String judge(int score) {
        if (score >= 80) {
            return "合格";
        } else {
            return "不合格";
        }
    }

    public static void main(String[] args) {
        String result = judge(75);
        System.out.println(result);
    }
}
