package computerscience30s;

import javax.swing.JOptionPane;


public class ComputerScience30S {

    public static void main(String[] args) {   
        
        // =====================================================================
        // (1) COMMENTS (various types)
        // =====================================================================
             
        // This is a comment
        
        // All typing after "//" until the line ends is called a in-line comment        
        // Commments are not code, so you can write what you want   
        
        /*  
            This is for multiple line comments, as it covers as many lines as
            you want starting with "slash star" until it sees the closing 
            "star slash"
        */
        
        // Brackets (braces, parenthesis) and specifically the "curly" braces
        // the { and } are important to the structure of code. All code right 
        // now goes between these two brackets.
            
        // =====================================================================
        // (2) INPUTS/OUTPUTS (simple, dialogs, and options)
        // =====================================================================
         
        // A basic output...
        System.out.print("Hello World");
        
        // Tips for typing (so you don't have to type)
            // Autocomplete ("Intellisense")
            // Keyboard shortcuts ("hot keys")
            // see the notes at the bottom of this java file...
        
        System.out.println("I'm in the world");
        
        System.out.println("Good-bye world!");
        
        // Additional output tips... (these are "special" characters)
        // (possibly never need to use these) 
        
        System.out.println("Make a quote:     \" appear");
        System.out.println("Make a backslash: \\ appear");
        System.out.println("Make a tab:       \t appear");
        System.out.println("Make a new line:  \n appear");
        
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
        
        // =====================================================================
        // (3) VARIABLES (remembering data, int, double, string, etc)
        // =====================================================================
         
        // A variable is a piece of code that tells the computer to store 
        // (or "remember") information (or "data"). Variables are also used
        // when the user gives us information, and for calculations / formulas.
        // You write a line of code to create (declare) a variable...
        
        // This is an example of the simpliest variable type:
        boolean a = true;
        
        // type name = value ;
        
        int b = 0;
        double c = 0.0;
        
        // Output our variables (before we do anything to them) - when 
        // outputting a variable it always displays the value stored in the 
        // variable (not the name of the variable)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        // Variables can change ("vary")
        a = false;
        b = 1;
        c = 1.2;
        
        // Variables always go on the left hand side (LHS) of the equals
        // sign (=) and the value going into the variable always goes on
        // the right hand side (RHS)
        
        // Output them again - after they have been changed...
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        // The "char" is short for "character" it holds (remembers) ONE
        // character   
        
        char d = 'A';
        System.out.println("d = " + d);
        
        // The boolean ("bool" in C#), integer (int), double, and character
        // (char) are all simple (primitive) data types, now a "complex" data
        // type (the "String" with a capital "S")....       
        
        String e = "apple";
        System.out.println("e = " + e);
        
        // Manipulate ("use") the varibles... 
        
        int x = 0;
        System.out.println("x = " + x);
        
        x = 30;
        System.out.println("x = " + x);
        
        int y = x + 10;
        
        // Optional ("you don't have to use this code") shorthand...
        y++;    // Means the same as y = y + 1;
        y--;    // Means the same as y = y - 1;
        
        // Even more shorthand (less recommended)  
        y += 10;    // Means the same as y = y + 10;
        y -= 10;    // Means the same as y = y - 10;
        y *= 10;    // Means the same as y = y * 10;
        y /= 10;    // Means the same as y = y / 10;
        
        System.out.println("y = " + y);
        
        // Modulus (mod) division gives you the remainder of a division
        // (not the normal answer) - in Java it uses the percentage "%"
        // symbol for this
        
        x = 28;
        y = x / 5;
        int z = x % 5;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        // Constants are variables that don't change (they stay "constant"),
        // and constants are written in ALL_CAPITAL_LETTERS with underscores
        // to seperate words
        
        final double  PI               = 3.141592653589793;
        final int     PROBLEMS         = 99;
        final char    YES              = 'Y';
        final boolean FOUND            = true;
        final String  COMPUTER_TEACHER = "Wachs";
        
        System.out.println(PI       + ", " + 
                           PROBLEMS + ", " + 
                           YES      + ", " + 
                           FOUND    + ", " + 
                           COMPUTER_TEACHER);
        
        // In a line of code, one space or multiple spaces doesn't matter
        // as seen above when declaring constants (it only matter when
        // between quotation marks). You can hit enter in a line of code
        // to break to a new line, because the computer will still consider
        // it ONE line of code until we reach the semicolon.
        
        // Constants are used for things like: easier code to maintain,
        // easier to read/understand (especially for other programmers)
        
        // Converting between variable data types...
        
        int f = 25;
        double g = f;
        
        System.out.println("f = " + f);
        System.out.println("g = " + g);
        
        g = 25.999999999999;
        int h = (int) g;
        
        System.out.println("g = " + g);
        System.out.println("h = " + h); 
                
        // When we use round brackets ( )  with a data type inside, this is
        // called "casting" which means it converts (temporarily) to another
        // data type - which meant it ignored the decimal part
        
        double k = 2.999999;
        int    l = (int)k;
        double m = (double)l;
        
        // Casting can also happen with other data types...
        
        char n = 'A';
        int  o = (int)n;
        char p = (char)70;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l); 
        System.out.println("m = " + n);
        System.out.println("n = " + n); 
        System.out.println("o = " + o);
        System.out.println("p = " + p); 
        
        // How to use dialog (JOptionPane) boxes (specifically the input)
        // with variables...
        
        // Whenever you are using INPUT dialogs, ALWAYS use a variable first
        // at the front of the line that makes the input dialog (code above is
        // wrong, always make a string variable then the input dialog)
        
        String q = JOptionPane.showInputDialog("Enter a string");
        
        JOptionPane.showMessageDialog(null, q);
        
        // The variable (always has to start as a string) stores what the 
        // user types in the input dialog box
        
        // With numbers, you HAVE to start off with a string, and then convert
        // it to a number. This is like Convert.ToInt32(text); in C#
        
        String r = JOptionPane.showInputDialog("Enter an int");
        
        // We convert it using code to "parse" (means to "read")
        
        int s = Integer.parseInt(r);
        
        JOptionPane.showMessageDialog(null, r + " as an int is " + s);
        
        // Always use a capital "I" and whole word "Integer" for this parsing
        // the string into a number
        
        // Same type of example but with a double....
        
        String t = JOptionPane.showInputDialog("Enter a double");
        double u = Double.parseDouble(t);
        JOptionPane.showMessageDialog(null, "double is " + u);
        
        // Example with a char (single character)...
        
        String v = JOptionPane.showInputDialog("Enter a char");
        char   w = v.charAt(0);
        JOptionPane.showMessageDialog(null, "char is " + w);
        
        // Strings have built-in actions like "charAt" to pull out a character
        // "at" location "0" which means the very first character (because 
        // numbering in Computer Science usually starts at 0)
        
        // Strings have MANY built-in "actions" (function, methods)
        
        String word = "hippopotomonstrosesquippedaliophobia";
        int length = word.length();
        
        System.out.println("word " + word + " is length " + length);
        
        String upper = word.toUpperCase();
        System.out.println("word " + word + " in uppercase is " + upper);
        
        // Many more string functions can be explored
        
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
        
        // Math library also does random numbers, in a way like...
        
        // Random random = new Random();
        
        // Although, Java does allow you to do something like that line,
        // but, it is not the same as C#
            
        double seed = Math.random();
        
        // The "seed" generates a number (decimal) between
        // 0 and 1 (but it never reaches 0 or 1)
        
        System.out.println("seed = " + seed);

        // You can use a formula for generating random numbers in a range
        // between a low and a high number

        // e.g. between 1 and 10 and make it an integer
        
        // Start with some constants defining the low and high
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now the formula to generate in that range
        
        double number = (HIGH - LOW + 1) * seed + LOW;
        
        System.out.println("number = " + number);
        
        // Now cast it into an int        
        int value = (int)number;
        System.out.println("value = " + value);
        
        // Do it again, but simplify the formula (between 2-53)
        
        int card = (int) ( ( 53 - 2 + 1 ) * Math.random() + 2 );
        System.out.println("card = " + card);
        
        // =====================================================================
        // (4) CONDITIONAL STATEMENTS (making decisions, if, else, else if)
        // =====================================================================
         
        // The simple if statement, you use this when comparing if something is
        // true, as it checks that one thing ("asks a true/false question")
        
        int value1 = 10;
        int value2 = 20;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // If statements use both ( ) round and { } curly brackets and the 
        // code inside of the curly brackets is said to be in a "block" of
        // code and that block only runs when the test inside of the round
        // brackets tests TRUE. It also indents the code inside the block
        
        if (value1 < value2) {
            System.out.println("They are");
            System.out.println("less than");
        }
        
        // All lines of code between the curley brackets { } is in a block that 
        // is "controlled" by the conditional (if) statement
        
        // if with "else" (an option) for both true and false, check 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        // Using a comma is a option (I do not recommend)
        
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
        
        // Use chars and some shorthand, not usually recommended (except in 
        // certain situations) used when the code in a block - between { } is
        // only one line of code! Then, you don't need the { } 
        // And.. (even further shorthand) the line can be moved up to the
        // same line as the if statement
        
        char value5 = 'A';
        char value6 = 'a';
        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // Use "else if" for multiple cases of more than 2 things (same as the
        // "switch" statement - which I don't use) use strings for this
        // example which are more complex (because they use many character,
        // and upper and lower case)
        
        // NOTE: with string NEVER use == ALWAYS use .equals()..
        
        String word1 = "edgy";
        String word2 = "eDgy";
        
        if (word1.equals(word2)) {
            System.out.println("equal");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("kind of equal");
        }
        else {
            System.out.println("not equal");
        }
        
        // Nesting is when you place one if statement inside the block of 
        // another if statement
        
        if (word1.equals(word2) == false) {
            // Like "!=" with strings
            if (word1.equalsIgnoreCase(word2)) {
                System.out.println("not really equal");
            }
        }
        
        // Combine logic using "and" "or" "not" which use the symbols:
        // "&&" for "and"  - AND means BOTH   have to be true
        // "||" for "or"   - OR  means EITHER can be true
        // "!"  for "not"  - NOT reverses the logic
        
        int age = 17;
        double iq = 180.0;
        
        if (age >= 21 && iq > 130) {
            System.out.println("Get in");
        }
        else if (age >= 18 || iq >= 100) {
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        // =====================================================================
        // (5) LOOPING (repeating instructions, while, do while, for)
        // =====================================================================
        
        
        
        
        
        
        
        
        
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
// (13) A red squiggily line and/or a "lightbulb" in NetBeans means a potential
//      error and a potential fix (if you click on the lightbulb)
// (14) Under the menu "Window" you can select "Reset Windows" to reset NetBeans
//      back to it's starting user interface settings
// (15) You can get more NetBeans tips and autocompletes by selecting:
//      Help -> Keyboard Shortcuts Card
// (16) To make projects easier and automate some tasks, go to 
//      Tools -> Templates, scroll down and click on the ">" beside "Java", 
//      select "Java Main Class", and "Open in Editor" and the enter 
//      the text below (by uncommenting it, then copying it, and pasting it 
//      into the temple (first delete all the text in the template and then 
//      replace what is there with this by pasting it):
//
///** Required package class namespace */
//package ${package};
//
//
///*
// * ${name} - description
// * 
// * @author YOUR NAME
// * @since ${date}
//*/
//public class ${name}
//{
//
//    /**
//     * Main method for the project
//     * 
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
//
//}
//
// (17) To autoformat code (fixes indents, extra spaces, etc.) you select the
//      code with mouse or keyboard (if you select nothing it will autoformat
//      all the code) and pres ALT + SHIFT + F (you should do this before you 
//      hand in your code)
// (18) When preparing a solution for hand in, when in NetBeans (after the  
//      code is cleaned up and ready - see tip 13) go to:
//      "File -> Print to HTML..." and then use the dialog box that appears
//      to select a location you can find the HTML file, and give the file  
//      you are saving a good name (with your name in the file name). Do 
//      not forget to also create a file (a Microsoft Word file is 
//      recommended) that has screen captures (pictures) to prove your 
//      program ran. Make as many or few to prove your solutions works 
//      (this is part of the mark). Note: when naming both files (outputs and
//      code files) make sure you include YOUR NAME in the file name itself.
//      Then hand in both the code file (html) and the outputs file (Word file)
//      on Mr. Wachs' hand in page here: https://bit.ly/3iiTvbu
// (19) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 13) by going to Tools -> Options, then click on the "Editor"
//      button at the top of this dialog, then click on the "Formatting" Tab.
//      Then under "Language" select "Java" and under "Category" choose 
//      various categories and make adjustments to your preferred style (see 
//      Mr. Wachs if you cannot find the style change you want)
//
