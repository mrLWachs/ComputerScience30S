
/** Required package class namespace */ 
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). 
 * 
 * @author Mr. Wachs
 * @since May 2026
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
     
    String name;        // Represents this person's full name    
    int age;           // Represents this person's age in years    
    String gender;      // Represents this person's identified gender    
    boolean alive;     // Represents whether this person is alive or not
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
      
    /**
     * Constructor method is a special method that has:
     *    (1) the same name as the class (including a capital letter)
     *    (2) it has NO return type (not even the word "void")
     * 
     * These methods are called when the class is used to build (construct, 
     * instantiate) an object. We previously had a "born()" method that did 
     * this, that we changed it into this constructor method. This method 
     * "brings the person to life" meaning it is used when the class is used to  
     * 'create' a Person object. The method sets all the class properties  
     * (global variables) to their starting values ("defaults").
     */
    public Person() {
        name   = "undefined";
        gender = "undefined";
        age    = 0;
        alive  = true;
    }
    
    // The method below was originally written and then deleted (commented out)
    // because the new constructor method above performs the same purpose....
    
    // void born() {
    //     name   = "undefined";
    //     gender = "undefined";
    //     age    = 0;
    //     alive  = true;        
    // }
    
    /**
     * The person dies (changing/modifying) the encapsulated (private) property
     * (alive) through this method
     */
    public void die() {
        alive = false;
    }
    
    /**
     * Gives the person a birthday, changes the encapsulated property (age)
     */
    public void birthday() {
        age++;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + 
                    " identifes " + gender);
        }
        else {
            System.out.println("Booo!!!");
        }
    }

}