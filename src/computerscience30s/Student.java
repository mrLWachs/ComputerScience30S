/** Required package class namespace */
package computerscience30s;
 
/**
 * Student.java - represents a student. This class uses inheritance to inherit
 * the properties and methods from the Person class. This means the Student
 * class is the child (sub-class) of the parent class Person (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs
 * @since May 2025
 */
public class Student extends Person
{

    /**
     * Represents a book object (this object "has a" relationship (association)
     * or "usage" with the student class
     */
    private Book book;
    
    private int number;
    
    private double average;
    
    public Student() {
        
    }
    
    /**
     * Studying raises the student's average
     */
    public void study() {
        average += 1.25;
        // or "average = average + 1.25;"
    }
    
    /**
     * Slacking off lowers the student's average
     */
    public void slackOff() {
        average -= 0.33;
    }
    
    /**
     * Cramming is intense studying
     */
    public void cram() {
        for (int i = 0; i < 10; i++) {
            study();
        }
    }
    
}