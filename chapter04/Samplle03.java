package chapter04;

public class Samplle03 {
    public static void main(String[] args) {
        int[] scores = {20,30,30,40,40,30,20};
        // int sum = 0;
        int count = 0;
        for(int i = 0; i<scores.length; i++){
            if (scores[i] == 30){
                System.out.println(scores[i]);
                // sum += scores[i];
                count++;
            }
        }
        // System.out.println(sum);
        System.out.println("30点人は" + count + "人です");
        

        

    }
}
