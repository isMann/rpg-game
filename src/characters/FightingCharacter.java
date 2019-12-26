package characters;

import items.Item;

import java.util.ArrayList;

public class FightingCharacter {

    //General Stats
    private int HP, str, def, mag, mDef, spd;
    
    private ArrayList<Item> items;
    
    private String name;
    
    public FightingCharacter(){
        items = new ArrayList<>();
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void setStr(int str) {
        this.str = str;
    }
    
    public void setDef(int def) {
        this.def = def;
    }
    
    public void setMag(int mag) {
        this.mag = mag;
    }
    
    public void setMDef(int mDef) {
        this.mDef = mDef;
    }
    
    public void setSpd(int spd) {
        this.spd = spd;
    }
    
    public int getHP() {
        return spd;
    }
    
    public int getStr() {
        return str;
    }
    
    public int getDef() {
        return def;
    }
    
    public int getMag() {
        return mag;
    }
    
    public int getMDef() {
        return mDef;
    }
    
    public int getSpd() {
        return spd;
    }
    
    public void addItem(Item toAdd) {
        items.add(toAdd);
    }
}
