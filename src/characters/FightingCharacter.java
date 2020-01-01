package characters;

import items.Item;

import java.util.ArrayList;

public class FightingCharacter {

    //General Stats
    private int maxHP, currHP, tempHP, str, def, mag, mDef, spd;
    
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
    
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
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
    
    public void setCurrHP(int currHP) {
        this.currHP = currHP;
    }
    
    public void setTempHP(int tempHP) {
        this.tempHP = tempHP;
    }
    
    public int getMaxHP() {
        return maxHP;
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
    
    public int getCurrHP() {
        return currHP;
    }
    
    public int getTempHP() {
        return tempHP;
    }
    
    public void addTempHP(int amount) {
        tempHP = Math.max(amount, tempHP);
    }
    
    public int heal(int amount){
        int overflow;
        overflow = (amount + currHP) - maxHP;
        currHP = Math.min(amount + currHP, maxHP);
        if (overflow < 0) overflow = 0;
        return overflow;
    }
    
    public boolean damage(int amount){
        boolean dead;
        amount -= tempHP;
        if (amount < 0) {
            tempHP = -amount;
        }
        else {
            tempHP = 0;
            currHP -= amount;
        }
        
        dead = currHP > 0;
        return dead;
    }
    
    public void rest(){
        currHP = maxHP;
        tempHP = 0;
    }
    
    public void addItem(Item toAdd) {
        items.add(toAdd);
    }
}
