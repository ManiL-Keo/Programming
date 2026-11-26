package chapter05;

public class Sample05 {

    public static int calcTax(int price){
        return (int)(price * 1.1);
    }
    public static void main(String[] args) {
        int cost = calcTax(1000);
        System.out.println(cost);
    }
}
