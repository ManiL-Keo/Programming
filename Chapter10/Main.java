import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // PaperBook p1 = new PaperBook("abc", "123", 1200, 200);
        // EBook e1 = new EBook("C言語", "gilbert", 3000, 120);
        // p1.display();
        // System.out.println();
        // e1.display();

        ArrayList<Book> books = new ArrayList<>();

        books.add(new PaperBook("Java入門", "山田太郎", 2800, 300));
        books.add(new EBook("c言語", "gilbert", 3000, 120));
        books.add(new AudioBook("論理回路", "金田", 2500, 180));

        for (Book book : books) {
            book.display();
            System.out.println();
        }
    }
}