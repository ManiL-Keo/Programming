package chapter05;

public class Sample09 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0; i<args.length; i++){
            int score = Integer.parseInt(args[i]);
            sum += score;
        }

        double average = (double) sum / args.length;
        System.out.println("平均点: " + average);
    }
}
