
/**
 * Balrog is a demon who attacks twice
 * 
 * @author Colin P. Goss 
 * @version 13.11.2015
 */

public class Balrog extends Demon
{
    /**
     * No-arg constructor
     * Generates random strength between 5 and 18 and HP between 5 and 20
     */
    public Balrog()
    {
        super();
        this.randomizeStats(18,20);
    }

    /**
     * Constructor
     * @param newHp starting HP
     * @param newStrength starting strength
     */
    public Balrog(int newHp, int newStrength)
    {
        super(newHp, newStrength);
    }

    /**
    * Demon deals damage to its enemies with two attacks
    * @return the amount of damage dealt
    */   
    
    public int dealDamage()
    {
        int totalDamage = 0;
        System.out.print("'s first attack");
        totalDamage += super.dealDamage();
        System.out.print("Its second attack");
        totalDamage += super.dealDamage();
        return totalDamage;
    }
}