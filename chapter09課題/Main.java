public class Main{
    public static void main(String[] args) {

        Category c1 = new Category("パソコン");
        Product p1 = new Product("ノートPC", 10000, c1);
        p1.displayInfo();

    }
}