package chapter05;

public class Sample06 {

    public static int sum(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int sum = sum(numbers);
        System.out.println(sum);
    }
}
