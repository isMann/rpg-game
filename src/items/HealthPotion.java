package items;

import characters.FightingCharacter;

public class HealthPotion extends Item {
    
    @Override
    public void use(FightingCharacter user) {
        user.heal(20);
    }
    
    @Override
    public String getDescription() {
        return "Heals 20 HP";
    }
    
    @Override
    public String getName() {
        return "Health Potion";
    }
}
