
/** Required package class namespace */ 
package computerscience30s;


/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). 
 * 
 * @author Mr. Wachs
 * @since December 2025
 */
public class Person 
{
    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;        // Represents this person's full name
    int age;            // Represents this person's age in years
    String gender;      // Represents this person's identified gender
    boolean alive;      // Represents whether this person is alive or not
    
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    void born() {
        name   = "undefined";
        gender = "undefined";
        age    = 0;
        alive  = true;
    }
    
    void die() {
        alive = false;
    }
    
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooooo!!!");
        }
    }
    
    void birthday() {
        age++;
    }
    
}