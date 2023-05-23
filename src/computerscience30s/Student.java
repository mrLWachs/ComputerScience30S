/** Required package class namespace */
package computerscience30s;

/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since May 19, 2023
 */
public class Student extends Person
{

    // The keyword "extends" is how Java initiates inheritance (or "is a")
    // and the Student class inherits all "public" properties and methods
    // from the "Person" class ("private" properties and methods are inherited,
    // but they are still private or encapsulated)
    
    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    public Book book;
    
    // private (encapsulated) property (global variable) identified (named)
    // "number" that is of type "integer"
    private int number;
    
    private double gpa;
    
    
    /**
     * Constructor for the class, sets the class properties (including the
     * properties it inherited form the super or parent class)
     * 
     * @param name the name for this student person
     * @param age the age for this student person
     * @param gender the gender for this student person
     * @param number the student number for this student
     */
    public Student(String name, int age, String gender, int number) {
        // You can call the contructor methods of the super class (the parent 
        // class) from this class (the child or subclass) by agaiin using the
        // keyword super and round brackets
        super(name, age, gender);
        
        // These lines of code are no longer needed...
        /*
        // The keyword "super" in java means "the super class" or the name
        // of the class that this class inherts from (in this case "Person")
        super.name = name;
        super.gender = gender;
        // super.age = age;
        // Still cannot access private/encapsulated properties (or methods)
        */
                
        this.number = number;
        gpa  = 0.0;
        book = new Book();
        // The "Book" object must still be instantiated (so it is not "null")
    }
    
    
}