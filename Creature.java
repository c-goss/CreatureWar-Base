import java.util.Random;
/**
 * Generic creature for creature war
 * 
 * @author Colin P. Goss 
 * @version 12.11.2015
 */
public class Creature
{
   private int hp;
   private int strength;
   protected Random rand = new Random();
   
   /**
    * No-arg constructor
    */
   public Creature()
   {
       hp = 10;
       strength = 10;
   }//end constructor
   
   /**
    * Constructor
    * @param newHp the creature's HP
    * @param newStrength the creature's strength
    */
   public Creature(int newHp, int newStrength){
       hp = newHp;
       strength = newStrength;
   }//end constructor
  
   
   /**
    * Changes the character's strength
    */
   public void setStrength(int newStrength)
   {
       strength = newStrength;
   }//end setStrength
   
   /**
    * Sets the character's HP
    * @param newHp the character's new HP value
    */
   public void setHp(int newHp)
   {
       hp = newHp;
   }//end setHp
   
   /**
    * Deals damage to the character
    * @param the amount of damage the character takes
    */
   public void takeWound(int damage)
   {
       hp -= damage;
   }//end takeWound
   
   /**
    * Heals the character
    * @param the amount of healing to be given t
    */
   public void heal(int healing)
   {
       hp += healing;
   }//end heal
   
   /**
    * Returns the creature's HP
    * @return the amount of HP remaining
    */
   public int getHp()
   {
       return hp;
   }
   
   /**
    * Returns the amount of strength the creature has
    * @return the creature's strength
    */
   public int getStrength()
   {
       return strength;
   }
     /**
    * Accessor for the random integer generator
    * @param The max number for the roll
    */
   public int nextInt(int maxRoll)
   {
       return rand.nextInt(maxRoll);
   } 
   /**
    * Determines base damage
    * @return the base damage
    */
   public int baseDamage(){
       return rand.nextInt(strength - 1) + 1;
   }//end damage
   
   /**
    * The amount of damage the creature deals
    * @return the damage to be dealt
    */
   public int dealDamage()
   { 
       int damageDealt = baseDamage();
       System.out.println(" deals " + damageDealt + " damage.");
       return damageDealt;
   }
   
   /**
    * Randomizes stats
    * @param maxStrength the maximum strength
    * @param maxHp the maximum Hp
    */
   public void randomizeStats(int maxStrength, int maxHp)
   {
        this.setStrength(rand.nextInt(maxStrength-5)+5);
        this.setHp(rand.nextInt(maxHp-5)+5);
   }//end randomizeStats
}//end Creature
