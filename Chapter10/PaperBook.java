public class PaperBook extends Book {
    int pageCount;

    public PaperBook(String title, String author, int price, int pageCount) {
        super(title, author, price);   // 親クラスのコンストラクタを呼び出す
        this.pageCount = pageCount;
    }

    @Override                          // ① オーバーライドであることを明示
    public void display() {            // ② 親と同じ名前・同じ引数
        super.display();               // ③ 親クラスの display() を呼び出す
        System.out.println("ページ数：" + pageCount);  // ④ 子クラス独自の処理を追加
    }
}



// A mechanism where a child class adopts variables and methods from a parent class.
// Main benefit: • Code reusability—avoids rewriting the same logic across multiple classes.
//  Key Features:
// 	• Can use parent behaviors automatically.
// 	• Can extend functionality by adding brand new variables and methods.
// 	• Can modify parent behaviors via polymorphism (overriding).
//  The Link (super): It creates a live link to the parent rather than copy-pasting code, allowing updates to sync instantly.


// When you combine Inheritance and Polymorphism, you are doing three things:
// 1. extends: You connect the child to the parent.
// 2. Inherit: The child automatically gains access to the parent's attributes and methods (via a live link, not a copy).
// 3. Override: You change the method's action to fit the child's specific purpose.
// By calling super.method() inside your overridden function, you get the best of both worlds:
//  you inherit the parent's original action so you don't have to rewrite code, 
//  and then you add your own custom behavior right after it.

// 1. extends (The Keyword): This is the Java syntax you use to connect the classes.
// 2. Inherit (The Setup): The child class automatically gets access to the parent's variables and methods.
// 3. Override (The Polymorphism): The child class rewrites the parent's method to perform its own specific action.