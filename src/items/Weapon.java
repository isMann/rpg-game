package items;

import characters.FightingCharacter;

public abstract class Weapon extends Item {
    
    public void remove(FightingCharacter user){
    
    }
    
    @Override
    public void use(FightingCharacter user) {
        user.equipWeapon(this);
    }
}
