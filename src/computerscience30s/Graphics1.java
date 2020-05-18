
/** required package class namespace */
package computerscience30s;

/** required imports */
import javax.swing.JFrame;


/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since December 19, 2019 
 */
public class Graphics1 extends JFrame
{

    /**
     * Default class constructor, sets class properties
     */
    public Graphics1() {
        setContainer();
        // reveal design to user (this should be done last in constructor)
        this.setVisible(true);                          // makes frame visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setContainer() {
        this.setSize(294, 440);                         // set width and height
        this.setTitle("Graphics 1");                    // title at the top
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

}
