
/**
 * A creature that can do bonus damage but has lower base health
 * 
 * @author Colin P. Goss
 * @version 13.11.2015
 */
public class Elf extends Creature
{
    /**
     * No-arg constructor
     * Generates random strength between 5 and 18 and HP between 15 and 25
     */
    public Elf()
    {
        super();
        this.randomizeStats(18,25);
    }

    /**
     * Constructor
     * @param newHp starting HP
     * @param newStrength starting strength
     */
    public Elf(int newHp, int newStrength)
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
        if (nextInt(10) == 9){
            System.out.println(" and "+ damageDealt +" magic damage!");
            damageDealt *= 2;
        }else{
            System.out.println(".");
        }
        return damageDealt;
    }//end damage
}
