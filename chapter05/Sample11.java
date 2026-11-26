package chapter05;

public class Sample11 {

    public static int[] makeArray(int size){
        int[] newArr = new int[size];
        for(int i=0; i < newArr.length; i++){
            newArr[i] = i;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for(int i :array){
            System.out.println(array[i]);
        }
    }
}
