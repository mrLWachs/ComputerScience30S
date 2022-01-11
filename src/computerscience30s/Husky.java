
/** required package class namespace */
package computerscience30s;

 
/**
 * Husky.java - represents a Husky. This class uses inheritance to inherit
 * the properties and methods from the Students class, which was already 
 * inheriting (extending) from the Person class. Therefore, this class 
 * inherits from both (a double inheritance).
 *
 * @author Mr. Wachs
 * @since 12-May-2020, 1:32:53 PM
 */
public class Husky extends Student
{

    private boolean pride;                          // encapsulated property
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Husky
     * @param age the age for this Husky
     * @param isMale the gender for this Husky
     */
    public Husky(String name, int age, boolean isMale) {
        super(name, age, isMale, 1);            // super constructor
        pride = true;                           // set internal properties
    }

    /**
     * Removes Husky pride
     */
    public void homework() {
        super.cram();
        pride = false;
    }
    
    /**
     * Restores Husky pride
     */
    public void pepRally() {
        super.slackOff();
        pride = true;
    }
    
    /**
     * Talking overrides the same talk method of the parent class
     * and outputs additional information to the screen
     */
    @Override
    public void talk() {
        super.talk();       // call to super talk(), it calls super talk() also
        System.out.println("\t Pride is " + pride);
    }
    
}