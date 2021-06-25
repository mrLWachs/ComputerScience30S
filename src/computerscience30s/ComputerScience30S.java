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
        // most likely not going to be used much (if at all)

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

        // Start by generating a random "seed" number
        double seed = Math.random();
        
        // Output this random "seed" number
        System.out.println("seed = " + seed);

        // Now, use a formula for generating random numbers in a range 
        // between a low and a high number:

        // E.g. between 1 and 10 and make it an int

        // Start with the constants defining the highest and lowest
        final double LOW  = 1.0;
        final double HIGH = 10.0;
        
        // Now a formula to generate in that range
        double number = (HIGH - LOW + 1) * seed + LOW;

        // Output it (as decimal)
        System.out.println("number = " + number);

        // Now cast it as in integer
        int value = (int)number;
        
        // Output again
        System.out.println("value = " + value);

        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
                
        // Simple if, use it when something is true, checks for 1 thing
        
        int value1 = 10, value2 = 10;
        
        // The if uses both () round and {} curly brackets and the code inside 
        // of the curley brackets is said to be in a "block" of code, and that 
        // block only runs when the test is true it also indents the code  
        // inside a block
        
        if (value1 == value2) {
            System.out.println("equal");
        }
        
        // if with else, for both true and false, checks 2 things
        
        double value3 = 1.45, value4 = 1.5;
        
        if (value3 < value4) {
            System.out.println("Less than");
        }
        else {
            System.out.println("Greater than");
        }
        
        // use chars and some shorthand, not usually recommended (except in
        // certain situations) used when the code between { } (block) is only
        // one line of code! Then, you don't need the { }

        char value5 = 'A', value6 = 'a';        
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
                
        // use "else if" for multiple cases of more than 2 things (same as a 
        // "switch" statement - which I do not use!) use string for this 
        // example which are more complex (because they are capital letters),
        // with string NEVER use == instead use .equals()...
        
        String word1 = "edgy";
        String word2 = "edGy";
        
        if (word1.equals(word2)) {
            System.out.println("w1==w2");
        }
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("w1 kind of == w2");
        }
        else {
            System.out.println("w1!=w2");
        }
        
        // combine logic using:
        // "and" "or" "not"
        // using symbols:
        //  &&    ||    !
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 1.15) {
            // with "and" BOTH have to be true
            System.out.println("Get in");
        }
        else if (age >= 18 || iq > 0.85) {
            // with "or" EITHER can be true
            System.out.println("Keep trying");
        }
        else {
            System.out.println("Get out");
        }
        
        ///////////////////////////////////////////////////////////////////////
        // LOOPING
        ///////////////////////////////////////////////////////////////////////
        
        // Simple loop...
        
        int counter = 0;
        
        while (counter < 10) {
            System.out.println("counter = " + counter);
            counter++; // counter = counter + 1
        }
        
        // while loop with a string
        
        String password = JOptionPane.showInputDialog("Create password");
        
        while (password.equals("1234")) {
            JOptionPane.showMessageDialog(null, "Try again!");
            password = JOptionPane.showInputDialog("Create password");
        }
        
        // The next type of loop is rarely used (you may never need it)
        // it test for true/false at the bottom of the loop, you use it
        // when you want the body (block) of the loop to run at least
        // once!
        
        String choice = "";
        
        do {            
            
            choice = JOptionPane.showInputDialog("Enter password");
            
        } while (choice.equalsIgnoreCase(password) == false);
                
        JOptionPane.showMessageDialog(null, "You got it");
        
        // The "for" loop is used for counting (and for the upcoming unit
        // called "arrays")
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        
        // Variations on the for loop:
            // count down (not up)
            // start at 100
            // stop at zero (including zero)
            // count by 10s
        
        for (int i = 100; i >= 0; i = i - 10) {
            System.out.println("i = " + i);
        }
        
        ///////////////////////////////////////////////////////////////////////
        // EXAMPLE ASSIGNMENT:
        ///////////////////////////////////////////////////////////////////////
        
        // create welcome screen for the user
        String message = "You are an intern at radio station, C-RAP, The \n"
                       + "disk jockeys announce the current temperature \n"
                       + "in both Fahrenheit and Celsius every half-hour.\n"
                       + "They would like an easy way to display both the \n"
                       + "Fahrenheit and Celsius temperatures quickly and \n"
                       + "at the same time. The local airport phones in \n"
                       + "the temperature (but only in Celsius). They \n"
                       + "have requested that you develop an application \n"
                       + "that will display both temperatures after the \n"
                       + "Celsius temperature is inputted. Note: Use \n"
                       + "this conversion formula F = (C ∗ 1.8) + 32";
        // show a message dialog box
        JOptionPane.showMessageDialog(null, "Welcome to the C-RAP number "
                + "2 radio station\n\n" + message);
        // get user input
        String userInput = JOptionPane.showInputDialog("Enter temperature "
                + "in Celcius");
        // convert to a number variable
        double celcius = Double.parseDouble(userInput);
        // apply formula
        double fahrenheit = (celcius * 1.8) + 32;
        // show user the results in a dialog
        JOptionPane.showMessageDialog(null, "Your temperature in "
                + "Fahrenheit is " + fahrenheit);
        // show ending message
        JOptionPane.showMessageDialog(null, "Thank you!");
                
        System.out.println("Good-bye World!");

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
// (12) Go to Tools -> Templates, scroll down and click on the "+" beside 
//      "Java", select "Java Main Class", and "Open in Editor" and the enter 
//      this into the temple (but use the slash "/" instead of "|"):
//
//      /** 
//       * ${name}.java - 
//       *
//       * @author Mr. Wachs 
//       * @since ${date} 
//       */
//      public class ${name} 
//       { .... etc .....     
//
// (13) When printing code for hand in (this only needs to be done once), click
//      on "Print Options" and uncheck everything previously checked off, and
//      then check off "Print as in Editor", then either print it to a PDF 
//      (which means select "Microsoft Print to PDF" on the next screen), or
//      cancel and resize the code to fit better (see tip #1) and then print 
//      again
// (14) To autoformat code (fixes indents, extra spaces, etc.) select code with
//      mouse or keyboard (or it will format all if none is selected) and press
//      ALT + SHIFT + F  (you should do this before hand in!)
// (15) You can "teach" NetBeans to change the style it uses to autoformat (see
//      number 14) by going to Tools -> Options, then click on the "Editor"
//      tab at the top, then the "Formatting" below that. Then change the 
//      settings to what you prefer
// (16) If you have to rename a variable or a method, select the
//      word and then press CTRL + R, then type in a new name
