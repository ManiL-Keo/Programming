package chapter04;

public class Sample07 {
    public static void main(String[] args) {
        int[][] scores = {
                { 80, 90, 70 }, 
                { 60, 85, 75 }, 
                { 90, 95, 88 } 
        };

        int sum = 0;
        for (int i=0; i<scores.length; i++){
            sum += scores[i][0];
        }

        double average =  (double) sum / scores.length;
        System.out.println("国語の平均は " + average);


        sum = 0;
        for (int i=0; i<scores.length; i++){
            sum += scores[i][1];
        }

        average =  (double) sum / scores.length;
        System.out.println("数学の平均は " + average);


        sum = 0;
        for (int i=0; i<scores.length; i++){
            sum += scores[i][2];
        }

        average =  (double) sum / scores.length;
        System.out.println("英語の平均は " + average);
        
    }
}
