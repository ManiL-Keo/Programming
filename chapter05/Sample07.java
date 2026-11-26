package chapter05;

public class Sample07 {

    //overload
    // public static void print(int number){
    //     System.out.println(number);
    // }

    // public static void print(String text){
    //     System.out.println(text);
    // }
    // public static void main(String[] args) {
    //     print("Hello my homie");
    //     print(67676767);
    // }

    // 
    
    public static double average(int[] scores){
        int sum = 0;
        double average = 0;
        for(int score : scores){
            sum += score;
        }
        return average = sum/scores.length;
    }

    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        double avg = average(scores);
        System.out.println(avg);
    }
}
