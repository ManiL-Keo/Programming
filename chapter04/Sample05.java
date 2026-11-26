package chapter04;

public class Sample05 {
    public static void main(String[] args) {
        // int[] scores = {20,30,30,40,40,30,20};
        // for (int score : scores){
        //     System.out.println(score);
        // }

        // for (int i = 0; i < scores.length; i++) {
        //     System.out.println("Index: " + i + ", Score: " + scores[i]);
        // }



        // String [] names = {"aaa", "bbb", "ccc"};
        // for(String s : names){
        //     System.out.println(s);
        // }

        // Double[] weights = {11.0, 12.3, 8.0};
        // for(Double weight : weights){
        //     System.out.println(weight);
        // }

        // char[] mojis = {'a', 'b', 'c'};
        // for(char moji : mojis){
        //     System.out.println(moji);
        // }

        // int[] arrayA = { 1, 2, 3 };
        // int[] arrayB;
        // arrayB = arrayA;
        // arrayB[0] = 100;
        // System.out.println(arrayA[0]);

        int[] scores = {60, 85, 90, 70, 80, 55, 100};
        int count = 0;
        for (int i = 0; i <scores.length; i++){
            if(scores[i] >= 80){
                count++;
            }
        }
        System.out.println("80点以上の人数は"+ count + "です。");

     
    }
    
}
