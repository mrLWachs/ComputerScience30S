package computerscience30s;

import javax.swing.JOptionPane;


public class ComputerScience30S {

    public static void main(String[] args) {   
//        
//        // =====================================================================
//        // (1) COMMENTS (various types)
//        // =====================================================================
//             
//        // This is a comment
//        
//        // All typing after "//" until the line ends is called a in-line comment        
//        // Commments are not code, so you can write what you want   
//        
//        /*  
//            This is for multiple line comments, as it covers as many lines as
//            you want starting with "slash star" until it sees the closing 
//            "star slash"
//        */
//        
//        // Brackets (braces, parenthesis) and specifically the "curly" braces
//        // the { and } are important to the structure of code. All code right 
//        // now goes between these two brackets.
//            
//        // =====================================================================
//        // (2) INPUTS/OUTPUTS (simple, dialogs, and options)
//        // =====================================================================
//         
//        // A basic output...
//        System.out.print("Hello World");
//        
//        // Tips for typing (so you don't have to type)
//            // Autocomplete ("Intellisense")
//            // Keyboard shortcuts ("hot keys")
//            // see the notes at the bottom of this java file...
//        
//        System.out.println("I'm in the world");
//        
//        System.out.println("Good-bye world!");
//        
//        // Additional output tips... (these are "special" characters)
//        // (possibly never need to use these) 
//        
//        System.out.println("Make a quote:     \" appear");
//        System.out.println("Make a backslash: \\ appear");
//        System.out.println("Make a tab:       \t appear");
//        System.out.println("Make a new line:  \n appear");
//        
//        // In all these, the key is to use the "\" backslash
//        // which is called an "escape character"
//        
//        // Dialog types of input and outputs, and are little tiny "windows", 
//        // "forms", "graphical rectangles" and are somewhat "fancier" ways to
//        // do an input/output with a dialog box (in C# it was "Message box")
//        
//        JOptionPane.showMessageDialog(null, "Hello World");
//        
//        // Above line of code is the ONLY one needed for assignment, final 
//        // project, etc.
//        
//        // For inputs (meaning the user is involved in giving us data)...
//        // An "input" dialog box
//        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // The simpliest version (is the one you will need to know)
//        
//        // However.............................................................
//        
//        // Optionally (not required) now some examples of other things you can
//        // do with these message/input dialog boxes...
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
//        // Some other optional input dialogs...
//        
//        // NOTE: There is a little more to using this input dialog that we will 
//        // cover after learning variables
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
//        
//        // =====================================================================
//        // (3) VARIABLES (remembering data, int, double, string, etc)
//        // =====================================================================
//         
//        // A variable is a piece of code that tells the computer to store 
//        // (or "remember") information (or "data"). Variables are also used
//        // when the user gives us information, and for calculations / formulas.
//        // You write a line of code to create (declare) a variable...
//        
//        // This is an example of the simpliest variable type:
//        boolean a = true;
//        
//        // type name = value ;
//        
//        int b = 0;
//        double c = 0.0;
//        
//        // Output our variables (before we do anything to them) - when 
//        // outputting a variable it always displays the value stored in the 
//        // variable (not the name of the variable)
//        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        // Variables can change ("vary")
//        a = false;
//        b = 1;
//        c = 1.2;
//        
//        // Variables always go on the left hand side (LHS) of the equals
//        // sign (=) and the value going into the variable always goes on
//        // the right hand side (RHS)
//        
//        // Output them again - after they have been changed...
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        // The "char" is short for "character" it holds (remembers) ONE
//        // character   
//        
//        char d = 'A';
//        System.out.println("d = " + d);
//        
//        // The boolean ("bool" in C#), integer (int), double, and character
//        // (char) are all simple (primitive) data types, now a "complex" data
//        // type (the "String" with a capital "S")....       
//        
//        String e = "apple";
//        System.out.println("e = " + e);
//        
//        // Manipulate ("use") the varibles... 
//        
//        int x = 0;
//        System.out.println("x = " + x);
//        
//        x = 30;
//        System.out.println("x = " + x);
//        
//        int y = x + 10;
//        
//        // Optional ("you don't have to use this code") shorthand...
//        y++;    // Means the same as y = y + 1;
//        y--;    // Means the same as y = y - 1;
//        
//        // Even more shorthand (less recommended)  
//        y += 10;    // Means the same as y = y + 10;
//        y -= 10;    // Means the same as y = y - 10;
//        y *= 10;    // Means the same as y = y * 10;
//        y /= 10;    // Means the same as y = y / 10;
//        
//        System.out.println("y = " + y);
//        
//        // Modulus (mod) division gives you the remainder of a division
//        // (not the normal answer) - in Java it uses the percentage "%"
//        // symbol for this
//        
//        x = 28;
//        y = x / 5;
//        int z = x % 5;
//        
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        
//        // Constants are variables that don't change (they stay "constant"),
//        // and constants are written in ALL_CAPITAL_LETTERS with underscores
//        // to seperate words
//        
//        final double  PI               = 3.141592653589793;
//        final int     PROBLEMS         = 99;
//        final char    YES              = 'Y';
//        final boolean FOUND            = true;
//        final String  COMPUTER_TEACHER = "Wachs";
//        
//        System.out.println(PI       + ", " + 
//                           PROBLEMS + ", " + 
//                           YES      + ", " + 
//                           FOUND    + ", " + 
//                           COMPUTER_TEACHER);
//        
//        // In a line of code, one space or multiple spaces doesn't matter
//        // as seen above when declaring constants (it only matter when
//        // between quotation marks). You can hit enter in a line of code
//        // to break to a new line, because the computer will still consider
//        // it ONE line of code until we reach the semicolon.
//        
//        // Constants are used for things like: easier code to maintain,
//        // easier to read/understand (especially for other programmers)
//        
//        // Converting between variable data types...
//        
//        int f = 25;
//        double g = f;
//        
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        
//        g = 25.999999999999;
//        int h = (int) g;
//        
//        System.out.println("g = " + g);
//        System.out.println("h = " + h); 
//                
//        // When we use round brackets ( )  with a data type inside, this is
//        // called "casting" which means it converts (temporarily) to another
//        // data type - which meant it ignored the decimal part
//        
//        double k = 2.999999;
//        int    l = (int)k;
//        double m = (double)l;
//        
//        // Casting can also happen with other data types...
//        
//        char n = 'A';
//        int  o = (int)n;
//        char p = (char)70;
//        
//        System.out.println("k = " + k);
//        System.out.println("l = " + l); 
//        System.out.println("m = " + n);
//        System.out.println("n = " + n); 
//        System.out.println("o = " + o);
//        System.out.println("p = " + p); 
//        
//        // How to use dialog (JOptionPane) boxes (specifically the input)
//        // with variables...
//        
//        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
//        // at the front of the line that makes the input dialog (code above is
//        // wrong, always make a string variable then the input dialog)
//        
//        String q = JOptionPane.showInputDialog("Enter a string");
//        
//        JOptionPane.showMessageDialog(null, q);
//        
//        // The variable (always has to start as a string) stores what the 
//        // user types in the input dialog box
//        
//        // With numbers, you HAVE to start off with a string, and then convert
//        // it to a number. This is like Convert.ToInt32(text); in C#
//        
//        String r = JOptionPane.showInputDialog("Enter an int");
//        
//        // We convert it using code to "parse" (means to "read")
//        
//        int s = Integer.parseInt(r);
//        
//        JOptionPane.showMessageDialog(null, r + " as an int is " + s);
//        
//        // Always use a capital "I" and whole word "Integer" for this parsing
//        // the string into a number
//        
//        // Same type of example but with a double....
//        
//        String t = JOptionPane.showInputDialog("Enter a double");
//        double u = Double.parseDouble(t);
//        JOptionPane.showMessageDialog(null, "double is " + u);
//        
//        // Example with a char (single character)...
//        
//        String v = JOptionPane.showInputDialog("Enter a char");
//        char   w = v.charAt(0);
//        JOptionPane.showMessageDialog(null, "char is " + w);
//        
//        // Strings have built-in actions like "charAt" to pull out a character
//        // "at" location "0" which means the very first character (because 
//        // numbering in Computer Science usually starts at 0)
//        
//        // Strings have MANY built-in "actions" (function, methods)
//        
//        String word = "hippopotomonstrosesquippedaliophobia";
//        int length = word.length();
//        
//        System.out.println("word " + word + " is length " + length);
//        
//        String upper = word.toUpperCase();
//        System.out.println("word " + word + " in uppercase is " + upper);
//        
//        // Many more string functions can be explored
        
        // "Math" library of code is also "built-in" to java
        // which comes with it's own functions (actions, methods)

        double answer1 = Math.PI;
        double answer2 = Math.cos(0.5);
        double answer3 = Math.abs(-1);
        double answer4 = Math.pow(5, 3);
        double answer5 = Math.sqrt(9);
        double answer6 = Math.log(0.5);
        
        System.out.println("answer1 = " + answer1);
        System.out.println("answer2 = " + answer2);
        System.out.println("answer3 = " + answer3);
        System.out.println("answer4 = " + answer4);
        System.out.println("answer5 = " + answer5);
        System.out.println("answer6 = " + answer6);
        
        
            






        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}


// =============================================================================
// TIPS: for using NetBeans, Java, GitHub, and Mr. Wachs' course:
// =============================================================================
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
// (4)  All characters in code are color coded, black is the default and can
//      mean all different types of things (like variables, etc.), blue 
//      indicates "key" words that have special meaning, and grey indicates
//      comments (not code) - and code can be letters (a-z,A-Z), numbers (0-9),
//      and symbols ( {} () [] + - * / = etc)
// (5)  The curly brackets (braces, parenthesis) are important "{" and "}" so
//      do not remove them or an error may occur
// (6)  Click the green triangle on the top toolbar to run code
// (7)  Autocomplete (Intellisense) can appear if you press "CTRL + SPACE"
// (8)  Type "sout" and then press tab it fills (autocompletes) "System.out..."
// (9)  When on a GitHub webpage, click on the line numbers on the left and then
//      when you refresh the page, it will automatically scroll to that line
// (10) The word "null" means "nothing" and can often act as a placeholder for 
//      code you often do not need (right now)
// (11) To "comment out" chunks of code, select the code with your mouse or 
//      your keyboard, then click on one of the two buttons under the code tab
//      (on the right)
// (12) To stop a running program, click the red stop button on the left in the
//      output window, or the X in the bottom right of NetBeans
