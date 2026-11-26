public class Book {
    String title;
    int price;
    String author;

    public Book(String title, int price, String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public String getAuthor(){
        return this.author;
    }

    public void displayInfo(){
        System.out.println("タイトル: " + this.title);
        System.out.println("価格: " + this.price + "円");
        System.out.println("作者: " + this.author);
    }
}