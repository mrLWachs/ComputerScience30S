
/**
 * Required package class namespace - the line below is put in automatically,
 * and connects this file to the project
 */  
package computerscience30s;

/**
 * Required imports for the project - the lines below are added when your code
 * needs to connect to another library (API) of code
 */
import javax.swing.JOptionPane;

public class ComputerScience30S {

    public static void main(String[] args) { 
        
        // This is a comment
        
        // All typing after "//" until the line ends is called a comment        
        // Commments are not code, so you can write what you want   
        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output...
        System.out.print("Hello World");
        
        System.out.print(" I'm in the World");
        // Spaces, you have to add them inside the quotes
        
        // There are "shortcuts" to coding a IDE like NetBeans (see tips below)        
        System.out.println("Good-bye World!");
        
        // Additional output tips... (these are "special" characters)
        // (possibly never need to use these)
        
        System.out.println("Make a quote \" appear");
        System.out.println("Make a slash \\ appear");
        System.out.println("Make a tab   \t appear");
        System.out.println("Make a new line \n appear");
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Dialog types of input and outputs, and are little tiny "windows", 
        // "forms", "graphical rectangles" and are somewhat "fancier" ways to
        // do an input/output with a dialog box (in C# it was "Message box")
        
        JOptionPane.showMessageDialog(null, "Hello World");
        
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
        
        // For inputs (meaning the user is involved in giving us data)...
        // An "input" dialog box
        
        JOptionPane.showInputDialog("Enter something");
        
        // The simpliest version (is the one you will need to know)
        
        // However.............................................................
        
        // Optionally (not required) now some examples of other things you can
        // do with these message/input dialog boxes...
        
        // Code could span multiple lines until it reaches a semi colon ";"
        // The light red line on the far right -------------------------------->
        // can be thought of as a "barrier" and you should try not to code too
        // much past this line
        
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
                "Error icon is X",
                "Error Title",
                JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
                null, 
                "Plain icon (no icon)",
                "Plain Title",
                JOptionPane.PLAIN_MESSAGE
        );
        
        // Some other optional input dialogs...
        
        // NOTE: There is a little more to using this input dialog that we will 
        // cover after learning variables
        
        JOptionPane.showInputDialog(
                null, 
                "Information icon is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Question icon is i",
                "Question title",
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Warning icon is i",
                "Warning title",
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Error icon is x",
                "Error title",
                JOptionPane.ERROR_MESSAGE
        );
        
        JOptionPane.showInputDialog(
                null, 
                "Plain icon is i",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE
        );   
        
        // More different (and optional) dialogs...
        
        JOptionPane.showConfirmDialog(null, "confirm");
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 2",
                "Information",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 3",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 4",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 5",
                "Error",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE
        );
                
        JOptionPane.showConfirmDialog(
                null, 
                "Confirm Example 6",
                "Plain",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to
        // store (or "remember") information (or "data"). Variables are also
        // used when the user gives us information, and for 
        // calculations / formulas. You write a line of code to create 
        // (declare) a variable...
        
        // This is an example of the simpliest variable type:
        boolean a = true;
        
        // type name = value ;
        int b = 0;
        double c = 0.0;
        
        // Variables can change ("vary")
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        
        
        
        
        
        
    }
    
}


// TIPS - for using NetBeans, Java, and Mr. Wachs' Computer Science course:
// ========================================================================
//
// UNIT 1: Introduction To Java.................................................
//
// (1)  To build a new Java coding project in NetBeans, start Netbeans
//      then click "File -> New Project..." and choose "Java with Ant" 
//      and "Java Application", then click "Next >" give your project
//      a name that makes sense and in a location you can remember
//      then click "Finish" ... start coding!
// (2)  To zoom in and out on the code, hold ALT and roll the mouse
// (3)  Double click the top of a tab to hide side windows or show them
// (4)  The curly brackets (braces, parenthesis) are important "{" and "}" so
//      do not remove them or an error may occur
// (5)  Click the green triangle on the top toolbar to run code
// (6)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (7)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (8)  When on a GitHub webpage, click on the line numbers on the left and then
//      when you refresh the page, it will automatically scroll to that line
// (9)  The word "null" means "nothing" and can often act as a placeholder for 
//      code you often do not need (right now)
// (10) To "comment out" chunks of code, select the code with your mouse or 
//      your keyboard, then click on one of the two buttons under the code tab
//      (on the right)
// (11) To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (12) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
