public class Thief{
    // String name;
    // int hp;
    // int mp;

    // public Thief(String name, int hp, int mp){
    //     this.name = name;
    //     this.hp = hp;
    //     this.mp = mp;
    // }

    // public Thief(String name, int hp){
    //     this(name, hp, 5);
    // }

    // public Thief(String name){
    //     this(name, 40);
    // }

    // public void displayInfo(){
    //    System.out.println("名前: " + this.name);
    //    System.out.println("HP: " + this.hp);
    //    System.out.println("MP: " + this.mp);
    // }



    private String name;
    private int hp;
    private int mp;

    // new Thief("アサカ", 40, 5)
    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // new Thief("アサカ", 35)
    public Thief(String name, int hp) {
        // this.name = name;
        // this.hp = hp;
        // this.mp = 5;

        this(name, hp, 5);
    }

    // new Thief("アサカ")
    public Thief(String name) {
        this.name = name;
        this.hp = 40;
        this.mp = 5;

        this(name, 40, 5);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // 名前が5文字以上だったら、名前を変更できないようにしたい
        if (name.length() >= 5) {
            return;
        }
        this.name = name;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getMp(){
        return this.mp;
    }

    public void setMp(int mp){
        this.mp = mp;
    }
    // これを書かない
    // public Thief() {

    // }
}
