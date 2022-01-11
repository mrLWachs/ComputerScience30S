
/** Required package class namespace */
package computerscience30s;

/** Required imports */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 
/**
 * Graphics1.java - the beginning of making a container (the frame) and 
 * various controls inside of it. This class uses inheritance to inherit
 * the properties and methods from the JFrame class. This means this
 * class is the child (sub-class) of the parent class (super class, 
 * base class). This is sometimes simplified to a "is a" relationship
 *
 * @author Mr. Wachs 
 * @since May 19, 2020 
 */
public class Graphics1 extends JFrame
{

    // controls for the container (which is the JFrame/Graphics2), also means: 
    // properties or "global variables" of this class
    
    private JLabel     text;        // labels can be for text, images, or both
    private JLabel     picture;
    private JTextField textbox;     // a text box area
    private JButton    button;      // a command button
    
    
    /**
     * Default class constructor, sets class properties - this method will be
     * called when a "Graphics1" object is created (instantiated) - which is 
     * done in the "LearnGraphics" class constructor method
     */
    public Graphics1() {
        // To have NetBeans automate writing a method for you, select the code
        // you want in the method with your mouse first, then press:
        // ALT + SHIFT + M and name the method
        
        setContainer();
        setControls(); 
        setActions();
        
        // Reveal design to user (this should be done last in constructor)
        this.setVisible(true);          // Make the frame (container) visible
    }

    /**
     * Setup the frame's (form) properties:
     */
    private void setContainer() {
        // Use a reference to the object that will be created in the future
        // and use all the properties and call (invoke) all the methods
        // we inherited from the super-class (JFrame)
        
        this.setSize(680, 830);         // Sets the width and height
        this.setTitle("Graphics 1");    // Sets the title at top of form (frame)
        this.setResizable(false);       // Makes it so the user cannot resize
        this.setLocationRelativeTo(null);   // Centers the form on screen
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close the program
    }

    /**
     * Setup all the controls to go in the container
     */
    private void setControls() {
        // create (instantiate) the objects (controls)
        text    = new JLabel();
        picture = new JLabel();
        textbox = new JTextField(20);
        button  = new JButton("Exit");
        
        // change any properties of the controls
        text.setText("Hello World");
        // with images, little more code, so why not "take" (copy/paste) the 
        // code from a designer and then adapt it as you like
        final String FILE = "/computerscience30s/source.gif";
        picture.setIcon(new ImageIcon(getClass().getResource(FILE)));
        
        // set the container's layout manager to position all the controls
        Container container = this.getContentPane();
        container.setLayout(null);          // null means you position yourself
        
        // add the controls into the container
        container.add(text);
        container.add(picture);
        container.add(textbox);
        container.add(button);
        
        // position all controls using: x,y,width,height        
        text.setBounds(10, 10, 650, 20);
        picture.setBounds(10, 50, 650, 650);
        textbox.setBounds(10, 710, 650, 20);
        button.setBounds(10, 740, 650, 40);
                
    }

    /**
     * Adds the actions to the various controls using an action listener. 
     * Action "listener" means it "listens" for specific actions to occur
     */
    private void setActions() {            
        // create an action listener for the click of the button        
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };        
        // then connect ("add") that listener to the control
        button.addActionListener(buttonListener);
        
        // do this again, but in one step, we create and add the action 
        // listener in that one step (not two) for textbox        
        textbox.addKeyListener( new KeyListener() {
            public void keyTyped(KeyEvent e) { }
            public void keyPressed(KeyEvent e) {
                text.setText("Key pressed " + e.getKeyCode()); 
            }
            public void keyReleased(KeyEvent e) { }
        } );
        
        // now the mouse and the picture, add action listener specifically for
        // mouse action, and call an "outside" method for the action        
        picture.addMouseMotionListener( new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {  }
            public void mouseMoved(MouseEvent e) {
                mouseMove(e);
            }
        });        
    }
    
    /**
     * When the mouse moves over the picture, it updates the label with 
     * information about where (coordinates) the mouse is
     * 
     * @param event the mouse event information from the mouse
     */
    private void mouseMove(MouseEvent event) {
        text.setText("Mouse " + event.getX() + "," + event.getY());  
    }    

}