public class Main {
    public static void main(String[] args) {
        // Thief thief1 = new Thief("アサカ", 40, 5);
        // Thief thief2 = new Thief("アサカ", 35);
        // Thief thief3 = new Thief("アサカ");

        // thief1.displayInfo();
        // thief2.displayInfo();
        // thief3.displayInfo();

        Thief thief1 = new Thief("アサカ", 40);
        // System.out.println(thief1.name);
        // thief1.name = "イサカ";
        thief1.setName("イサカ123");
        System.out.println(thief1.getName());

        thief1.setHp(1000);
        System.out.println(thief1.getHp());

        thief1.setMp(300);
        System.out.println(thief1.getMp());

        // System.out.println(thief1.hp);
        // System.out.println(thief1.mp);

        // 配列を使うとインスタンスをたくさん管理できる
        // Thief[] thiefs = new Thief[10];
        // for(int i = 0; i < thiefs.length; i++) {
        // thiefs[i] = new Thief("アサカ", 40);
        // }

    }
}
