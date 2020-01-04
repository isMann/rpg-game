package items;

import characters.FightingCharacter;

public abstract class Armour extends Item {
    
    @Override
    public void use(FightingCharacter user) {
        user.equipArmour(this);
    }
}
