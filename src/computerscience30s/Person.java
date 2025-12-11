
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
    Person() {
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
     * Another overloaded (which means multiple methods with the same name, but
     * different parameters) constructor method
     * 
     * @param newName the 'new' name to assign this person object
     */
    Person(String newName) {
        name   = newName;
        gender = "undefined";
        age    = 0;
        alive  = true;
    }
        
    /**
     * A third overloaded constructor method, sets the class properties. 
     * Constructor methods with NO parameters are called default constructors
     * 
     * @param name the name of this person
     * @param age the age of this person
     * @param gender the identified gender of this person
     */
    Person(String name, int age, String gender) {
        // Assign the parameter to the property (global variable of this class)
        // To do this, we use the keyword "this" which acts as a placeholder
        // for the name of the object (which will be created at a later time)
        this.name   = name;
        this.gender = gender;
        this.age    = age;
        alive  = true;
    }
    
    void die() {
        alive = false;
    }
    
    void birthday() {
        age++;
    }
    
    void talk() {
        if (alive == true) {
            System.out.println(name + " is " + age + " identifies " + gender);
        }
        else {
            System.out.println("Boooooo!!!");
        }
    }
    
}