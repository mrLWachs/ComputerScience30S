
/** Required package class namespace */
package computerscience30s;
 
/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since December 2025
 */
public class Student extends Person
{
    
    /**
     * This property of the Student class represents a Book object (this object 
     * "has a" relationship (association) or "usage" with the Student class
     */
    public Book book;
  
    
}