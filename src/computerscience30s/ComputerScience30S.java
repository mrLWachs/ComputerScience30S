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
 * @since September 15, 2020, 1:50:54 p.m.
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
        System.out.print("Hello World...");

        // If you use println, it adds a line break at the end
        System.out.println("I'm in the world");

        // Additional output tips.... (these are "special" characters):
        // most likely not going to be used nuch (if at all)

        System.out.println("Quote \" ");
        System.out.println("Make a \t tab");
        System.out.println("Slash \\");
        System.out.println("New \n Line");

        // Make a "dialog" box appear

        JOptionPane.showMessageDialog(null, "Hi");

        // Optional (does not "need" to be in assignments) dialog boxes:

        JOptionPane.showMessageDialog(null,
                "Information dialog is i",
                "Information title",
                JOptionPane.INFORMATION_MESSAGE);
        // You can hit "enter" in some lines of code at certain places to
        // drop the code to the next line and save having too long of a line

        JOptionPane.showMessageDialog(
                null,
                "Question dialog is ?",
                "Question title",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(
                null,
                "Warning dialog is !",
                "Warning title",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(
                null,
                "Plain dialog",
                "Plain title",
                JOptionPane.PLAIN_MESSAGE);

        // Dialogs for inputs

        // The simpliest version is the one you have to use

        JOptionPane.showInputDialog("Enter something");

        // Some optional versions of input dialogs

        JOptionPane.showInputDialog(
                null,
                "Information",
                "Information",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showInputDialog(
                null,
                "Question",
                "Question",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showInputDialog(
                null,
                "Warning",
                "Warning",
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showInputDialog(
                null,
                "Plain",
                "Plain",
                JOptionPane.PLAIN_MESSAGE);

        // NOTE: these examples above are NOT being used properly if used in
        // a assignment, correct way comes up later in this code...

        // An optional type of dialog (may not be needed)

        JOptionPane.showConfirmDialog(null, "Confirm");

        JOptionPane.showConfirmDialog(
                null,
                "Confirm 1",
                "Information",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showConfirmDialog(
                null,
                "Confirm 2",
                "Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showConfirmDialog(
                null,
                "Confirm 3",
                "Warning",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        JOptionPane.showConfirmDialog(
                null,
                "Confirm 4",
                "Plain",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);
        
        ///////////////////////////////////////////////////////////////////////
        // VARIABLES:
        ///////////////////////////////////////////////////////////////////////

        // The simpliest of variable types
        
        boolean a = true;
        
        // type name = value ;        
        // This line creates (declares) a variable
        
        int b = 0;
        
        double c = 0.0;
        
        // Variables can change (vary)
        
        a = false;
        b = 1;
        c = 1.2;
        
        // A variable always goes on the LHS (left hand side) of the equals 
        // sign (=) and the value going into the variable always goes on the 
        // RHS (right hand side)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        char d = 'A';
        
        System.out.println("d = " + d);
        
        // The boolean, int, double and char are all simple (primitive) data 
        // type, now a complex data type....
        
        String e = "banana";
        
        System.out.println("e = " + e);
                
        // now manipulate the variables (change)
                
        int x = 10;
        
        System.out.println("x = " + x); // 10
        
        x = 20;
        
        System.out.println("x = " + x); // 20
        
        int y = x + 10;
        
        System.out.println("y = " + y); // 30
        
        // Optional shorthand...
        
        y++;    // means same as y = y + 1
        y--;    // means same as y = y - 1
        
        // More optional shorthand...
        
        y += 10;    // means y = y + 10
        y -= 10;    // means y = y - 10
        y *= 10;    // means y = y * 10
        y /= 10;    // means y = y / 10
        
        System.out.println("y = " + y);

        // Modulus (mod) gives you the remainder of a division, java 
        // uses the % symbol
        
        x = 28;
        y = x / 5;
        
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change, and constants are 
        // written ALL_CAPS with underscores separating words
        
        final double  PI           = 3.14159265;
        final int     PROBLEMS     = 99;
        final char    YES          = 'Y';
        final boolean FOUND        = true;
        final String  TEACHER_NAME = "Wachs";
        
        System.out.println(PI + " and " +
                           PROBLEMS + " and " +
                           YES + " and " +
                           FOUND + " and " +
                           TEACHER_NAME);
        
        // Convert one variable data type to another...
        
        int    f = 25;
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        // Now change the value of the double 
        
        g = 25.9;
        
        // Use casting, it "ignores" any decimal places        
        // it does not "round off" the number as shown:
        
        int h = (int)g;
        
        System.out.println("h = " + h);
        
        // Try it again
        
        double k = 2.999999999999;
        int    l = (int)k;
        double m = (double)l;
        
        // casting can happen with lots of types:
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)63;
                
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("o = " + o);
        System.out.println("p = " + p);
        
        // Using input dialog boxes with variables
        
        String q = JOptionPane.showInputDialog("Enter string");
        JOptionPane.showMessageDialog(null,q);
        
        // To use dialog input with numbers, you have to start off with a 
        // string and then convert it to a number
        
        String r = JOptionPane.showInputDialog("Enter int");
        
        // Now convert it, in a way like: Convert.toInt32().... in C#
        // it uses something called "parsing" (means "reading")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null,s);
        
        // Same example with doubles: 
        
        String t = JOptionPane.showInputDialog("Enter double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null,u);
                
        // Example with char:
        
        String v = JOptionPane.showInputDialog("Enter char");
        char w = v.charAt(0);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        JOptionPane.showMessageDialog(null,w);
        
        // Strings have many built-in actions (functions, methods)    
        
        String word = "hippopotomonsprosesquippedaiophobia";        
        int length = word.length();        
        System.out.println(word + " is length " + length);        
        word = word.toUpperCase();        
        System.out.println(word);        
        // many more can be explored
        
        // Also built-in to Java is a "Math" "library" of code
        
        double answer1 = Math.PI;
        double answer2 = Math.abs(-1);
        double answer3 = Math.cos(0.5);
        double answer4 = Math.log(0.5);
        double answer5 = Math.pow(5, 3);
        double answer6 = Math.sqrt(9);
        
        System.out.println("answer 1 = " + answer1);
        System.out.println("answer 2 = " + answer2);
        System.out.println("answer 3 = " + answer3);
        System.out.println("answer 4 = " + answer4);
        System.out.println("answer 5 = " + answer5);
        System.out.println("answer 6 = " + answer6);

        // The Math "library" does random numbers, like:
        // Random random = new Random();
        
        double seed = Math.random();
        System.out.println("seed = " + seed);
        
        // You can use a formula for generating random numbers in a range 
        // between a low and a high number:
        
        // E.g. between 1 and 10 and make it an int
        
        // Start with the constants defining the highest and lowest
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        // Now a formula to generate in that range
        double number = (HIGH - LOW + 1) * seed + LOW;
        // Now cast it to an integer
        int value = (int)number;
        // And display it
        System.out.println("random value = " + value);
        
        
        
        
        
        
        
        
        
        
        
        
        

        // this line terminates any running java program at any point
        //System.exit(0);

    }

}

// NETBEANS TIPS:
// ==============
// (1)  Hold Alt + scroll mouse to zoom in and out on code
// (2)  Double click the top of a tab of code to make bigger or smaller
// (3)  Type in lowercase "sout" and hit TAB to write System.out....
// (4)  Words in capital letters and in blue are IMPORTANT code words, the words
//      in captial letters are powerful, they are a "class"
// (5)  Intellisense (autocomplete) can appear if you press "CTRL + SPACE"
// (6)  The word "null" means "nothing" and can act as a placeholder for code
//      you don't actually want
// (7)  To "comment out" some code, select the code (with your mouse) and
//      click on the two buttons under the code tab (at the right end)
// (8)  A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
// (9)  You can get more NetBeans tips and autocompletes by selecting
//      Help -> Keyboard Shortcuts Card
// (10) To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans

