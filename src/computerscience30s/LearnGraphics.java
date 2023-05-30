
/** Required package class namespace */
package computerscience30s;

 
/**
 * LearnGraphics.java - a class object (instance) to launch a constructor to
 * learn about graphics and graphical user interfaces (GUI) by instantiating
 * other objects
 *
 * @author Mr. Wachs
 * @since May 29, 2024
 */
public class LearnGraphics 
{

    /**
     * Constructor method for when an object of this class is instantiated
     */
    public LearnGraphics() {
        System.out.println("Start Learning Graphics and User Interfaces (UI)");
        // Create class objects for different examples
        Graphics1 graphics1 = new Graphics1();  // Using the WYSIWYG editor
        Graphics2 graphics2 = new Graphics2();  // Using just code (copy #1)
        Graphics3 graphics3 = new Graphics3();  // Use a mix (hybrid)
        System.out.println("Completed Learning Graphics and UI!");
    }

}