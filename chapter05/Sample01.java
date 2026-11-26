package chapter05;

public class Sample01 {
    public static void main(String[] args) {
        String text = "Hello";
        int length = getLength(text);
        System.out.println(length);
    }

    public static  int getLength(String text) {
        // int length = 0;
        // for(int i : text.toCharArray()){
        //     length++;
        // }
        // return length;
        int length = text.length();
        return length;
    }


}
