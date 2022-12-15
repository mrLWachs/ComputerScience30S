
/** Required package class namespace */
package computerscience30s;

/**
 * Person.java - represents a person. This is a class with properties (things 
 * about the class, adjectives, descriptors) and methods (things the class 
 * can do, verbs, actions). Classes can be created (instantiated) into 
 * objects (which are instances of that class).
 * 
 * @author Mr. Wachs
 * @since December 2022
 */
public class Person 
{

    // Properties: (things about it, adjectives, descriptors, variables, arrays)
    
    String name;
    int age;
    String gender;
    boolean alive;
    
    // Methods: (things it can do, verbs, actions, return, parameter(s))
    
    /**
     * Constructor method is a method that has (1) the same name as the class,
     * (2) the name starts with a capital letter, (3) it has NO return type 
     * (not even the word "void"). These methods are called when the class is
     * used to build (construct, instantiate) an object.
     */
    Person() {
        alive  = true;
        age    = 0;
        name   = "undefined";
        gender = "undefined";
    }
    
    // Previously, we had a method call "born" (seen below) that we changed 
    // into the constructor method (above)...
    //    void born() {
    //        alive  = true;
    //        age    = 0;
    //        name   = "undefined";
    //        gender = "undefined";
    //    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties from the parameters that 
     * we passed to the method (the arguments). Constructor methods with
     * NO parameters are called "default" constructors
     * 
     * @param newName the name of this person
     */
    Person(String newName) {
        alive  = true;
        name   = newName;
        age    = 0;
        gender = "undefined";
    }
    
    /**
     * Overloaded (methods with the same name, different parameters) 
     * constructor method, sets the class properties. Constructor methods with
     * NO parameters are called default constructors
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    Person(String name, int age, String gender) {
        alive       = true;
        this.name   = name;
        this.age    = age;
        this.gender = gender;
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (whcih will be created at a later time)
    }
    
    
    
    
    
    
    
    
        
    void die() {
        alive = false;
    }
    
    /**
     * Outputs information about the person to the screen
     */
    void talk() {
        if (alive) {
            System.out.println(name + " is " + age + " identifies as " + gender);
        }
        else {
            System.out.println("Booooooo!");
        }
    }
    
    /**
     * A person has a birthday (the age goes up by one)
     */
    void birthday() {
        age++;
    }
    
}