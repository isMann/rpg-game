package main;

import characters.Player;
import items.ShortSword;
import items.Weapon;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        ShortSword sword = new ShortSword();
        
        player.initStats();
        player.printStats();
    
        player.addItem(sword);
        player.equipWeapon((Weapon)player.getItem().get(0));
        System.out.println(player.getEquippedWeapon().getName() + " " + player.getEquippedWeapon().getDescription());
        System.out.println(player.getEquippedArmour().getName());
    }
}
