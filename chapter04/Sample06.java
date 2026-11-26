package chapter04;

public class Sample06 {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        
        scores[0][0] = 40;
        scores[0][1] = 50;
        scores[0][2] = 60;
        scores[1][0] = 80;
        scores[1][1] = 60;
        scores[1][2] = 70;

        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[1][0]);
        System.out.println(scores[1][1]);
        System.out.println(scores[1][2]);

        int[][] scores2 = {{40, 50, 60}, {80, 60, 70}};
        for (int i = 0; i < scores2.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                System.out.println(scores2[i][j]);
            }
        }

    }
}
