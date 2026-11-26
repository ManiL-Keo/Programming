public class EBook extends Book{
    int fileSize;

    public EBook(String title, String author, int price, int fileSize){
        super(title, author, price);
        this.fileSize = fileSize;
    }

    @Override 
    public void display(){
        super.display();
        System.out.println("ファイルサイズ: " + fileSize + "MB");
    }
}
