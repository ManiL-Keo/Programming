public class Drink {
    int price;
    int capacity;
    String name;
    int amount;

    public Drink(int price, int capacity, String name){
        this.price = price;
        this.capacity = capacity;
        this.name = name;
        this.amount = capacity;
    }


    public void drink(int ml){
        if (ml > this.amount){
            System.out.println("足りない");
            return;
        }
        this.amount -= ml;
    }

    public void displayInfo(){
        System.out.println("価格: " + this.price);
        System.out.println("量: " + this.capacity);
        System.out.println("名前: " + this.name);
    }

    public void showAmount(){
        System.out.println("残量: " + this.amount);
    }
}
