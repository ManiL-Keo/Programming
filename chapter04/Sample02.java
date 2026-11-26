package chapter04;

public class Sample02 {
    public static void main(String[] args) {
        int values[] = new int[5];
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);

        int num = values.length;
        System.out.println("intの要素数= " + num);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;
        values[4] = 50;
        

        System.out.println("10を代入=" + values[0]);
        System.out.println("20を代入=" + values[1]);
        System.out.println("30を代入=" + values[2]);
        System.out.println("40を代入=" + values[3]);
        System.out.println("50を代入=" + values[4]);

        // boolean answers[] = new boolean[3];
        // System.out.println(answers[0]);
        // System.out.println(answers[1]);
        // System.out.println(answers[2]);

        // System.err.println("answersの要素数= " + answers.length);

        // double weights[] = new double[2];
        // System.out.println(weights[0]);
        // System.out.println(weights[1]);

        // System.out.println("weightsの要素数= " + weights.length);

        // String names[] = new String[2];
        // System.out.println(names[0]);
        // System.out.println(names[1]);

        // System.out.println("namesの要素数= " + names.length);


        // char chars[] = new char[2];
        // System.out.println(chars[0]);
        // System.out.println(chars[1]);

        // System.out.println("charsの要素数= " + chars.length);

    }
}
