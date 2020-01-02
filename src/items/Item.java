package items;

import characters.FightingCharacter;

public abstract class Item {
    public abstract void use(FightingCharacter user);
    public abstract String getDescription();
    public abstract String getName();
}
