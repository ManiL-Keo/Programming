public class Product {
    String name;
    int price;
    Category category;

    public Product(String name, int price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.category.name);
    }
}