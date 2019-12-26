package main;

import characters.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        
        player.initStats();
        player.printStats();
    }
}
