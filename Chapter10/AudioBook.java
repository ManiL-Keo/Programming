public class AudioBook extends Book {
    int duration;

    public AudioBook(String title, String author, int price, int duration){
        super(title, author, price);
        this.duration = duration;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("再生時間: " + duration + "分");
    }
}
