
/**
 * Basic human creature
 * 
 * @author Colin P. Goss
 * @version 13.11.2015
 */
public class Human extends Creature
{
    /**
     * No-arg constructor
     * Generates random strength between 5 and 18 and HP between 5 and 30
     */
    public Human()
    {
        super();
        this.randomizeStats(18,30);
    }//end constructor
    
    /**
     * Constructor
     * @param newHp starting HP
     * @param newStrength starting strength
     */
    public Human(int newHp, int newStrength)
    {
        super(newHp, newStrength);
    }
}
