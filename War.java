import java.util.*;
/**
 * War between two armies
 * 
 * @author Colin P. Goss
 * @version 14.11.2015
 */
public class War
{
    public static void main(String[] args)
    {
    makeWar();
    }
    
    public static void makeWar(){
        ArrayList<Creature> firstArmy = new ArrayList<Creature>();
        ArrayList<Creature> secondArmy = new ArrayList<Creature>();
        Scanner scan = new Scanner(System.in);
        String firstArmyType;
        String secondArmyType;
        int firstArmyCasualties = 0;
        int secondArmyCasualties = 0;
        boolean someoneDefeated = false;
        
        System.out.println("Choose first army type: ");
        firstArmyType = armyCheck();
        System.out.println("Choose second army type: ");
        secondArmyType = armyCheck();
        populateArmy(firstArmy, firstArmyType);
        populateArmy(secondArmy, secondArmyType);
        //begin the war
        System.out.println("\nThe war begins!");
        System.out.println(firstArmy.size() + " " + firstArmyType + "s vs. " + secondArmy.size()+ " " + secondArmyType+ "s");
        while(firstArmyCasualties < (firstArmy.size() - 1) && secondArmyCasualties < (secondArmy.size()-1)){
            System.out.print(firstArmyType + " #" + (firstArmyCasualties + 1));
            //output ex: DEMON #1
            secondArmy.get(secondArmyCasualties).takeWound(
                firstArmy.get(firstArmyCasualties).dealDamage());
            //first army member deals damage to second army member
            
            System.out.print(secondArmyType + " #" + (secondArmyCasualties + 1));
            firstArmy.get(firstArmyCasualties).takeWound(
                secondArmy.get(secondArmyCasualties).dealDamage());
            
            if(firstArmy.get(firstArmyCasualties).getHp() > 0){
                System.out.println(firstArmyType + " #" + (firstArmyCasualties + 1) +
                    " has " + firstArmy.get(firstArmyCasualties).getHp() + " HP remaining.");
               
            } else {
                System.out.println(firstArmyType + " #" + (firstArmyCasualties + 1) 
                    +" has died!");
                firstArmyCasualties++;
            }//end first army if-else
            if(secondArmy.get(secondArmyCasualties).getHp() > 0 ){
                System.out.println(secondArmyType + " #" + (secondArmyCasualties + 1) +
                    " has " + secondArmy.get(secondArmyCasualties).getHp() + " HP remaining.");
            } else {
                System.out.println(secondArmyType + " #" + (secondArmyCasualties + 1) 
                    + " has died");
               secondArmyCasualties++;
            }//end second army if-else

        }//end while
        if (firstArmyCasualties < secondArmyCasualties){
            System.out.println("The " + firstArmyType + " army has been victorious!");
        } else if (secondArmyCasualties < firstArmyCasualties){
            System.out.println("The " + secondArmyType + " army has won the day!");
        } else {
            System.out.println("Both armies have been routed!");
        }
        
    }//end makeWar    
    
    public static String armyCheck()
    {
        Scanner scan = new Scanner(System.in);
        boolean inputValid = false;
        String[] types = {"HUMAN", "ELF", "DEMON", "BALROG"};
        String armyType = "HUMAN";  //defaults to human army
        while (!inputValid){
            for( String creature : types){
                System.out.print(creature + " ");
            }//end for
            System.out.print(": ");
            armyType = scan.nextLine().toUpperCase().trim();
            for( String creature : types){
                if (armyType.equals(creature)){
                    inputValid = true;
                }//end if
            }//end for
            if (!inputValid){
                System.out.println("That is not a valid choice! Please choose again: ");
            }
        }//end while
        
        return armyType;
    }
    
    public static void populateArmy(ArrayList<Creature> army, String armyType){
        switch (armyType){
            case "BALROG":  for(int i = 0; i < 20; i++){
                            Balrog balrog = new Balrog();
                            army.add(balrog);
                        }
                            break;
            case "DEMON": for(int i = 0; i < 20; i++){
                            Demon demon = new Demon();
                            army.add(demon);
                        }
                            break;
            case "ELF": for(int i = 0; i < 20; i++){
                            Elf elf = new Elf();
                            army.add(elf);
                        }
                            break;
            default:    for(int i = 0; i < 20; i++){
                            Human human = new Human();
                            army.add(human);
                        }
        }//end switch
    }

}//end main

