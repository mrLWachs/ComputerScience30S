
package computerscience30s;

import javax.swing.JOptionPane;

public class ComputerScience30S 
{

    public static void main(String[] args) {
        // TODO code application logic here
        // This is a comment 
        
        // This is a comment all typing after "//" until the line ends        
        // Commments are not code, so you can write what you want        
        // Curly brackets (braces, parenthesis) { and } are important        
        // All code right now goes between these two brackets. Comments are 
        // not code, so you can write what you want
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // A basic output
        System.out.print("Hello World"); // Comments can be on code lines
        
        System.out.print(" I'm in ");
        // Spaces, you have to add them inside the quotes
        
        System.out.println("The world!");
        
        // There are "shortcuts" to coding (see the tips below)        
        System.out.println("Good-bye World");
        
        // Additional output tips... (these are "special" characters)
        
        System.out.println("Make a quote \" ");         //  \" Makes quote
        System.out.println("Make a slash \\ ");         //  \\ Makes slash
        System.out.println("Make a \t tab ");           //  \t Make "tab" 
        System.out.println("Make a \n new line break"); // \n Makes break
        
        // In all these, the key is to use the "\" backslash
        // which is called an "escape character"
        
        // Make a "fancier" output with a dialog box ("Message box")
        
        JOptionPane.showMessageDialog(null, "Hi");
        
        // Above line of code is the ONLY one needed for assignment, final 
        // project, etc.
        
        // However, these OPTIONS (not needed, but cool) for other
        // dialog output message boxes below...
        
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


