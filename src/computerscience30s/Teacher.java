/** Required package class namespace */
package computerscience30s;
 
/**
 * Teacher.java - represents a Teacher. This class uses inheritance to inherit
 * the properties and methods from the Person class. This class also 
 * "associates" with the Student class by making a reference to them within 
 * the class. This is sometimes simplified as a "has a" relationship.
 *
 * @author Mr. Wachs
 * @since May 2025
 */
public class Teacher extends Person
{

    // public property, association ("has a") relationship to the 
    // Student class, an array
    public Student[] students;
    
    
    /**
     * Constructor for the class sets class properties
     * 
     * @param name the name for this Teacher Person
     */
    public Teacher(String name) {
        
    }
    
    /**
     * This method outputs the teacher information (with the inherited talk 
     * method) and then loops through all (active) students and makes them
     * study and talk...
     */
    public void teach() {
        
    }
    
}