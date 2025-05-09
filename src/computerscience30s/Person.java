/** Required package class namespace */
package computerscience30s;
 
/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since May 2025
 */
public class Person {

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    void born() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";        
    }
    
    /**
     * The person dies (changing/modifying) the property (alive) through 
     * this method
     */
    void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifes as " + gender);
        }
        else {
            System.out.println("Boooooooo!");
        }
    }
    
    /**
     * Gives the person a birthday
     */
    void birthday() {
        age++;
    }    
    
}