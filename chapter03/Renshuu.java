package chapter03;

public class Renshuu {
    public static void main(String[] args) {
        int fizz = 0;
        int buzz = 0;
        int fizzbuzz = 0;
        for (int i=1; i<=100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
                fizzbuzz += 1;
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
                fizz += 1;
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
                buzz += 1;
            }
  
        }
        System.out.println("Fizz: " + fizz + "回");
        System.out.println("Buzz: " + buzz + "回");
        System.out.println("FizzBuzz: " + fizzbuzz + "回");



        // 1～1000の数字について調べる。

// 3の倍数なら「Fizz」
// 5の倍数なら「Buzz」
// 3と5の両方の倍数なら「FizzBuzz」
// それ以外は数字を表示

// さらに、
// Fizzが何回出たか
// Buzzが何回出たか
// FizzBuzzが何回出たかを最後に表示してください。
 
    }
}
