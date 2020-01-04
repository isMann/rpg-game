package items;

import characters.FightingCharacter;

public abstract class Weapon extends Item {
    
    @Override
    public void use(FightingCharacter user) {
        user.equipWeapon(this);
    }
}
