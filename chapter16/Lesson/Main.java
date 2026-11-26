package Lesson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<Hero>();

        heroes.add(new Hero("鈴木"));
        heroes.add(new Hero("田中"));

        for(Hero hero : heroes){
            System.out.println(hero.getName());
        }
    }
}
