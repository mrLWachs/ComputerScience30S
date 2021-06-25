
/** 
 * Required package class namespace - the line below is put in automatically,
 * and connects file to the project 
 */
package computerscience30s;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code 
 */
import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course.
 * 
 * @author Mr. Wachs
 * @since Feb. 5, 2020, 1:50:54 p.m.
 */
public class ComputerScience30S {       // Curly brackets DO NOT remove

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        // anything following 2 slashes is a comment, until the end of the line

        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
                
        // Basic output
        System.out.println("Hello World...");
        
        // Use print without the "ln", does not add a line break at the end
        System.out.print("I'm in ");
        System.out.println("the world");
        
        System.out.println("Good-bye world!");
                
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");
        System.out.println("Make a slash \\ ");
        System.out.println("Make a \t tab");
        System.out.println("Make a \n new line");
        
        // Make a dialog box appear
        JOptionPane.showMessageDialog(null, "Hello");
        
        // Above is the only one need for assignments, final projects, etc.
        // Optional (not needed, but cool) dialog boxes below:
        
        JOptionPane.showMessageDialog(
                null,
                "Information icon is i",
                "Information Title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Question icon is ?",
                "Question Title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Warning icon is !",
                "Warning Title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null,
                "Plain no no icon",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Dialogs for inputs....
        
        // The simpliest version is the one you have to use
        JOptionPane.showInputDialog("Enter something");
        
        // Some optional input dialogs below:
        JOptionPane.showInputDialog(
                null, 
                "Information dialog icon is i", 
                "Information Title", 
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog(
                null, 
                "Question dialog icon is ?", 
                "Question Title", 
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Warning dialog icon is !", 
                "Warning Title", 
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showInputDialog(
                null, 
                "Plain dialog no icon", 
                "Plain Title", 
                JOptionPane.PLAIN_MESSAGE);
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "Confirm");
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 1",
                "Information",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 2",
                "Question",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 3",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showConfirmDialog(
                null,
                "Example 4",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
                
        // this line terminates any running java program at any point
        //System.exit(0);
    }

}


// NETBEANS TIPS:
// ==============
// (1)  To zoom in and out on the code, hold ALT and roll the mouse
// (2)  Double click the top of a tab to hide side windows or show them
// (3)  The curly brackets (braces, parenthesis) are important "{" and "}"
// (4)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (5)  Click the green triangle on the top toolbar to run code
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  The word "null" means nothing and can act as a placeholder for code
//      you don't actually need (right now)
// (8)  To "comment out" chunks of code, select the code with your mouse or
//      keyboard, then click on the two buttons under the code tab
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) You can get more NetBeans tips and autocompletes by selecting 
//      Help -> Keyboard Shortcuts Card
// (11) A red squiggily line and/or a "lightbulb" in NetBeans means a potential 
//      error and a potential fix (if you click on the lightbulb)
