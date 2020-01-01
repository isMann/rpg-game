package main;

import characters.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        
        player.initStats();
        player.printStats();
    
        System.out.println("taking damage no temp hp");
        player.damage(5);
        player.printStats();
        System.out.println("healing not to full");
        player.heal(2);
        player.printStats();
        System.out.println("healing past full");
        player.heal(5);
        player.printStats();
        System.out.println("adding temp hp");
        player.addTempHP(5);
        player.printStats();
        System.out.println("adding more temp hp");
        player.addTempHP(10);
        player.printStats();
        System.out.println("adding not enough temp hp");
        player.addTempHP(7);
        player.printStats();
        System.out.println("damaging not enough to remove all temp hp");
        player.damage(3);
        player.printStats();
        System.out.println("damaging more than temp hp");
        player.damage(10);
        player.printStats();
    }
}
