package characters;

import java.util.Scanner;

public class Player extends FightingCharacter{
    
    Scanner in;
    public Player(){
        in = new Scanner(System.in);
    }
    
    public void initStats(){
        String input;
        int budget = 27, sum;
        int str, def, mag, mDef, spd;
        setPlayerName();
        do {
            do {
                str = def = mag = mDef = spd = 0;
                sum = str + def + mag + mDef + spd;
                str = setStat("strength", budget, sum);
                sum = str + def + mag + mDef + spd;
                def = setStat("defence", budget, sum);
                sum = str + def + mag + mDef + spd;
                mag = setStat("magic", budget, sum);
                sum = str + def + mag + mDef + spd;
                mDef = setStat("magic defence", budget, sum);
                sum = str + def + mag + mDef + spd;
                spd = setStat("speed", budget, sum);
                sum = str + def + mag + mDef + spd;
                if (sum != budget) {
                    System.out.println("Invalid stats restarting.");
                }
            } while (sum != budget);
            setStats(20, str, def, mag, mDef, spd);
            printStats();
            System.out.println("Are you satisfied with these stats? (y/n)");
            do {
                input = in.next();
                if (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))){
                    System.out.println("Invalid Input");
                }
            } while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")));
        } while (input.equalsIgnoreCase("n"));
        rest();
    }
    
    private void setPlayerName() {
        String input;
        do {
            System.out.println("Enter your character's name:");
            setName(in.nextLine());
            System.out.println("Your name is " + getName() + " are you happy with it? (y/n)");
            do {
                input = in.nextLine();
                if (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n"))) {
                    System.out.println("Invalid Input");
                }
            } while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")));
        } while(input.equalsIgnoreCase("n"));
    }
    
    public void printStats() {
        System.out.println(getName() +"'s current stats are:");
        System.out.println("Maximum Hit Points:\t\t" + getMaxHP());
        System.out.println("Current Hit Points:\t\t" + getCurrHP());
        System.out.println("Temporary Hit points:\t" + getTempHP());
        System.out.println("Strength:\t\t\t\t" + getStr());
        System.out.println("Defence:\t\t\t\t" + getDef());
        System.out.println("Magic\t\t\t\t\t" + getMag());
        System.out.println("Magic Defence:\t\t\t" + getMDef());
        System.out.println("Speed:\t\t\t\t\t" + getSpd());
    }
    
    private void setStats(int HP, int str, int def, int mag, int mDef, int spd) {
        setMaxHP(HP);
        setStr(str);
        setDef(def);
        setMag(mag);
        setMDef(mDef);
        setSpd(spd);
    }
    
    private int setStat(String stat, int budget, int sum) {
        System.out.println("Your current number of stats is " + sum + ".");
        System.out.println("Your budget is " + budget + ".");
        System.out.println("You have " + (budget - sum) + " points remaining.");
        System.out.println("What value would you like " + stat + " to be?");
        return in.nextInt();
    }
}
