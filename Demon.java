
/**
 * Demon creature with a chance to do extra damage
 * 
 * @author Colin P. Goss 
 * @version 13.11.2015
 */

public class Demon extends Creature
{
    /**
     * No-arg constructor
     * Generates random strength between 5 and 18 and HP between 5 and 25
     */
    public Demon()
    {
        super();
        this.randomizeStats(18,25);
    }

    /**
     * Constructor
     * @param newHp starting HP
     * @param newStrength starting strength
     */
    public Demon(int newHp, int newStrength)
    {
        super(newHp, newStrength);
    }
    
    /**
    * Amount of damage to be dealt to enemy
    * @return the amount of damage dealt
    */   
    public int dealDamage()
    {
        int damageDealt = baseDamage();
        System.out.print(" deals " + damageDealt + " damage");
        if  (nextInt(20)==1){
            System.out.println(" and 50 magic damage!");
            damageDealt +=50;
        }else{
            System.out.println(".");
        }
        return damageDealt;
    }
}
