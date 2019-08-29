
/** required package class namespace */
package year2018to2019semster2.game;

/** required imports */
import year2018to2019semster2.game.tools.GameObject;
import java.awt.Color;
import javax.swing.JLabel;


/**
 * Background.java - representation of a background in a game 
 *
 * @author Mr. Wachs 
 * @since 15-May-2019 
 */
public class Background extends GameObject
{

    /**
     * Constructor for the class, sets class property data
     * 
     * @param label the label associated with the image for the game object
     */
    public Background(JLabel label) {
        super(label);
        sprite.setColor(Color.black);
    }
    
}
