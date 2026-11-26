public class Main {
    public static void main(String[] args) {
        // Book book1 = new Book("Java入門", 3000, "中田");
        // System.out.println(book1.getTitle());
        // System.out.println(book1.getPrice());
        // System.out.println(book1.getAuthor());
        // book1.displayInfo();
        // System.out.println();

        // Drink drink1 = new Drink(167, 300, "Dazz");
        // drink1.displayInfo();
        // System.out.println();

        // drink1.drink(100);
        // drink1.showAmount();
        // System.out.println();

        // drink1.drink(200);
        // drink1.showAmount();
        // System.out.println();

        // Drink drink2 = new Drink(100, 500, "Fuji");
        // drink2.displayInfo();
        // System.out.println();

        // drink2.drink(100);
        // drink2.showAmount();
        // System.out.println();

        // drink2.drink(50);
        // drink2.showAmount();

        Phone phone1 = new Phone();
        phone1.displayInfo();
        System.out.println();

        phone1.Use(55);
        phone1.showCurrentCapacity();
        System.out.println();

        phone1.Charge(10);
        phone1.showCurrentCapacity();

    }
}
