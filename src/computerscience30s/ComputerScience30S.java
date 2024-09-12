
package computerscience30s;

import javax.swing.JOptionPane;

public class ComputerScience30S 
{

    public static void main(String[] args) {     
        // TODO code application logic here
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
               
        // This is a comment 
        
        // All typing after "//" until the line ends is called a comment        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        // Clicking the green triange on the toolbar above will "run" or
        // "compile" your code and show you the running program in an output
        // window below...        
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output
        System.out.print("Hello World"); // Comments can be on code lines
        
//        System.out.print(" I'm in ");
//        // Spaces, you have to add them inside the quotes
//        
//        System.out.println("The world!");
//        
//        // There are "shortcuts" to coding (see the tips below)  
//        System.out.println("Good-bye World");
//        
//        // Additional output tips... (these are "special" characters)
//        
//        System.out.println("Make a quote \" ");         //  \" Makes quote
//        System.out.println("Make a slash \\ ");         //  \\ Makes slash
//        System.out.println("Make a \t tab ");           //  \t Make "tab" 
//        System.out.println("Make a \n new line break"); // \n Makes break
//        
//        // In all these, the key is to use the "\" backslash
//        // which is called an "escape character"
//        
//        // Make a "fancier" output with a dialog box ("Message box")
//        
//        JOptionPane.showMessageDialog(null, "Hi");
//        
//        // Above line of code is the ONLY one needed for assignment, final 
//        // project, etc.
//        
//        // However, these OPTIONS (not needed, but cool) for other
//        // dialog output message boxes below...
//        
//        // Code could span multiple lines until it reaches a semi colon ";"
//        // The light red line on the far right -------------------------------->
//        // can be thought of as a "barrier" and you should try not to code too
//        // much past this line
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Information icon is i",
//                "Information Title",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Question icon is ?",
//                "Question Title",
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Warning icon is !",
//                "Warning Title",
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Error icon is X",
//                "Error Title",
//                JOptionPane.ERROR_MESSAGE
//        );
//        
//        JOptionPane.showMessageDialog(
//                null, 
//                "Plain icon (no icon)",
//                "Plain Title",
//                JOptionPane.PLAIN_MESSAGE
//        );
//        
//        // Dialogs for inputs....
//        
//        // The simpliest version (is the one you will need to know):
//        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // There is a little more to using this input dialog that we will 
//        // cover after learning variables
//        
//        // Some other optional input dialogs...
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Information icon is i",
//                "Information title",
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Question icon is i",
//                "Question title",
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Warning icon is i",
//                "Warning title",
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Error icon is x",
//                "Error title",
//                JOptionPane.ERROR_MESSAGE
//        );
//        
//        JOptionPane.showInputDialog(
//                null, 
//                "Plain icon is i",
//                "Plain title",
//                JOptionPane.PLAIN_MESSAGE
//        );                
//        
//        // More different (and optional) dialogs...
//        
//        JOptionPane.showConfirmDialog(null, "confirm");
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 2",
//                "Information",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE
//        );
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 3",
//                "Question",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE
//        );
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 4",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE
//        );
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 5",
//                "Error",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.ERROR_MESSAGE
//        );
//                
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 6",
//                "Plain",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.PLAIN_MESSAGE
//        );
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////
        
        // A variable is a piece of code that tells the computer to
        // store (or "remember") information (or "data")
        
        // This is an example of the simpliest variable type:
        
        boolean a = true;
        
        // type name = value ;
        
        int b = 0;
        
        // When you write a line of code to create (declare) a variable
        
        double c = 0.0;
        
        
        
        
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
// (7)  The word "null" means "nothing" and can act as a placeholder for code
//      you often do not need (right now)
// (8) To "comment out" chunks of code, select the code with your mouse or 
//     your keyboard, then click on one of the two buttons under the code tab
//     (on the right)
// (9)  To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
// (10) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)