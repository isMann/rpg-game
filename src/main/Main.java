package main;

import characters.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        
        player.initStats();
        player.printStats();
    
        System.out.println("taking damage no temp hp");
        System.out.println("dead " + player.damage(5));
        player.printStats();
        System.out.println("healing not to full");
        System.out.println("overflow " + player.heal(2));
        player.printStats();
        System.out.println("healing past full");
        System.out.println("overflow " + player.heal(5));
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
        System.out.println("dead " + player.damage(3));
        player.printStats();
        System.out.println("damaging more than temp hp");
        System.out.println("dead " + player.damage(10));
        player.printStats();
        System.out.println("killing player");
        System.out.println("dead " + player.damage(20));
        player.printStats();
    }
}
