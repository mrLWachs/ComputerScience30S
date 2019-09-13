/** required package class namespace - the line below is put in
 * automatically, and connects file to the project */
package computerscience30s;

/** required imports for the project - the lines below are added when your
  * code needs to connect to another library (API) of code */
import javax.swing.JOptionPane;


/**
 * ComputerScience30S.java - the large in class example we continue to work on
 * in each unit adding example code on the new concepts of each unit along with
 * any in class requests for code examples that might come up over the course
 *
 * @author Mr. Wachs
 * @since 09-Feb-2019
 * @instructor Mr. Wachs
 */
public class ComputerScience30S {   // Curly brackets DO NOT remove

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nJava basics started...\n");
        
        // methods (functions, procedures) 
        // are named like variables, but use 
        // verb type words starting with 
        // lowercase then using camel casing
        // the round braces ( ) indicate a method
        
        ///////////////////////////////////////////////////////////////////////
        // JAVA BASIC INPUT AND OUTPUTS
        ///////////////////////////////////////////////////////////////////////
        
        // A single line comment
        
        /*
            Multiple line comments, covers as many lines as you want
            starting with "slash star" until it sees the closing "star slash"
        */
        
        // Basic output
//        System.out.print("Hello World");    // comments can also go after code
//        
//        // Words starting with captial letters are powerful, they are a "class"
//        
//        // TIP: type "sout" and press TAB        
//        System.out.println("I'm in the world");
//        System.out.println("Good-bye world");
//        
//        // Output "special" characters
//        System.out.println("Quote \" " );
//        System.out.println("\tMake a tab");
//        System.out.println("\\Slash");
//        System.out.println("New\n\nLine");
//                
//        // TIP: if your want intellisense to appear at any time press:
//        // "CTRL" + "SPACE"        
//        // TIP: "null" is a placeholder for code you don't actually want
//        
//        // Create "fancy" ouptut using a dialog
//        JOptionPane.showMessageDialog(null, "Hi");
//        
//        // Optional versions of output dialogs:
//        
//        JOptionPane.showMessageDialog(null, 
//                "Information dialog icon is i",
//                "Information Title",
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null, 
//                "Question dialog icon is ?",
//                "Question Title",
//                JOptionPane.QUESTION_MESSAGE);
//                
//        JOptionPane.showMessageDialog(null, 
//                "Warning dialog icon is !",
//                "Warning Title",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showMessageDialog(null, 
//                "Plain dialog has no icon",
//                "Plain Title",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // dialog for inputs
//        
//        JOptionPane.showInputDialog("Enter something");
//        
//        // some optional versions of input dialog
//        
//        JOptionPane.showInputDialog(null, 
//                "Information dialog icon is i",
//                "Information Title",
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showInputDialog(null, 
//                "Question dialog icon is ?",
//                "Question Title",
//                JOptionPane.QUESTION_MESSAGE);
//                
//        JOptionPane.showInputDialog(null, 
//                "Warning dialog icon is !",
//                "Warning Title",
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showInputDialog(null, 
//                "Plain dialog has no icon",
//                "Plain Title",
//                JOptionPane.PLAIN_MESSAGE);
//        
//        // optional confirm dialog:
//        
//        JOptionPane.showConfirmDialog(null, "Confirm");
//        
//        
//        // more optional examples of confirm dialog
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 1",
//                "Information",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.INFORMATION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 2",
//                "Question",
//                JOptionPane.YES_NO_OPTION,
//                JOptionPane.QUESTION_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 3",
//                "Warning",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.WARNING_MESSAGE);
//        
//        JOptionPane.showConfirmDialog(
//                null, 
//                "Confirm Example 4",
//                "Plain",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
//        
//        ///////////////////////////////////////////////////////////////////////
//        // VARIABLES:
//        ///////////////////////////////////////////////////////////////////////
//        
//        // simple variables
//        
//        boolean a = true;
//        // type name = value
//        // when you "create" declare a variable
//        
//        int    b = 0;
//        double c = 0.0;
//        
//        // variables can change (vary)
//        a = false;
//        b = 1;
//        c = 1.2;
//        
//        // variable always goes on the LHS (left hand side) and the value 
//        // going in it goes on the RHS (right hand side)
//        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        
//        // TIP: on the lower toolbar at the end, are 2 buttons to comment an 
//        // uncomment code you have selected
//        
//        char d = '*';
//        System.out.println("d = " + d);
//        
//        // more "complex" data type
//        String e = "cats";
//        System.out.println("e = " + e);
//        
//        // in java words that start with a capital letter, are more "powerful" 
//        // which means they have built-in actions (they are a class)
//        
//        // manipulate, change the variables
//        
//        int x = 10;
//        System.out.println("x = " + x); // 10
//        x = 20;
//        System.out.println("x = " + x); // 20
//        int y = x + 10;
//        System.out.println("y = " + y); // 30
//        // optional shorthand...
//        y++;
//        // means the same as y = y + 1
//        y--;        // means y = y - 1
//        // even more optional....
//        y += 10;    // same as y = y + 10
//        System.out.println("y = " + y); // 40
//        
//        y -= 20;    // same as y = y - 20
//        y *= 2;     // same as y = y * 2
//        y /= 10;    // same as y = y / 10
//        
//        System.out.println("y = " + y); // 4
//        
//        // modulus (mod) gives you the remainder of a division, uses %
//        
//        x     = 28;
//        y     = x / 5;
//        int z = x % 5;
//        
//        System.out.println("x = " + x); 
//        System.out.println("y = " + y); 
//        System.out.println("z = " + z); 
//        
//        // constants are variables that don't change
//        // constants are written in ALL CAPITAL LETTERS
//        // and use underscore _ to seperate words
//        
//        final double  PI           = 3.14159265;
//        final int     PROBLEMS     = 99;
//        final char    YES          = 'y';
//        final boolean FOUND        = true;
//        final String  TEACHER_NAME = "Wachs";
//        
//        System.out.println(PI + " and " +
//                           PROBLEMS + " and " +
//                           YES + " and " +
//                           FOUND + " and " +
//                           TEACHER_NAME);
//        
//        // converting between data types...
//        
//        int    f = 15;
//        double g = f;
//        
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        
//        int h = (int) g;
//        // "casting" converts
//        // by ignoring the decimal portion
//        
//        System.out.println("h = " + h);
//        
//        double k = 2.9999999999;
//        int    l = (int)k;
//        double m = (double)l;
//        
//        // casting can happen both ways
//        
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);
//        System.out.println("m = " + m);
//        
//        // casting can also work with char
//        
//        char n = 'A';
//        int  o = (int)n;
//        
//        System.out.println("n = " + n);
//        System.out.println("o = " + o);
//        
//        o = 42;
//        n = (char)o;
//        
//        System.out.println("o = " + o);
//        System.out.println("n = " + n);
//        
//        // use input dialog with variables
//        
//        String p = JOptionPane.showInputDialog("string");
//        JOptionPane.showMessageDialog(null, p);
//        
//        // like Convert.toInt32()... in C#
//        // uses something called "parsing"
//        // which means "reading"
//        
//        String q = JOptionPane.showInputDialog("int");
//        int r = Integer.parseInt(q);
//        JOptionPane.showMessageDialog(null, r);
//        
//        // do this with doubles        
//        String s = JOptionPane.showInputDialog("double");
//        double t = Double.parseDouble(s);
//        JOptionPane.showMessageDialog(null, t);
//        
//        // dialogs with char
//        String u = JOptionPane.showInputDialog("char");
//        char v = u.charAt(0);
//        JOptionPane.showMessageDialog(null, v);
//        // numbering usually starts at 0
//        
//        // built-in actions (functions, methods) for
//        // strings
//        
//        String word = "quizzaciously";
//        int count = word.length();
//        System.out.println(word +  " length is " + count);
//        // numbering starts at 0
//        char letter = word.charAt(0);
//        System.out.println("Letter 0 = " + letter);  
//        // one more, many more to explore
//        word = word.toUpperCase();
//        System.out.println("word is " + word);
//        
//        // built-in math functions (methods)
//        
//        double answer1 = Math.PI;
//        double answer2 = Math.abs(-1);
//        double answer3 = Math.cos(0.5);
//        double answer4 = Math.log(0.5);
//        double answer5 = Math.pow(5,3);
//        double answer6 = Math.sqrt(9);
//        
//        System.out.println("answer1 = " + answer1);
//        System.out.println("answer2 = " + answer2);
//        System.out.println("answer3 = " + answer3);
//        System.out.println("answer4 = " + answer4);
//        System.out.println("answer5 = " + answer5);
//        System.out.println("answer6 = " + answer6);
//        
//        // math "library" does random numbers, like:
//        // Random random = new Random();
//        
//        double seed = Math.random();
//        System.out.println("seed = " + seed);
//        // formula for generating randoms
//        // in a range between a high and low number
//        final double LOW  = 1.0;
//        final double HIGH = 10.0;
//        double number = (HIGH - LOW + 1) * seed + LOW;
//        int value = (int)number;
//        System.out.println("value = " + value);
                
        ///////////////////////////////////////////////////////////////////////
        // CONDITIONAL STATEMENTS
        ///////////////////////////////////////////////////////////////////////
        
        // simple if, use it when something is true,
        // checks for 1 thing
        
        int value1 = 10, value2 = 10;
        
        if (value1 == value2) {
            System.out.println("equal");
        }
                
        // if with else, for both true and false,
        // checks 2 things
        
        double value3 = 1.45, value4 = 1.5;
        if (value3 < value4) {
            System.out.println("less than");
        }
        else {
            System.out.println("greater than");
        }
        
        // use chars and some shorthand, not usually
        // recommended (except in certain situations)
        // used when the code between { } (block)
        // is only 1 line of code, you don't need
        // the { }
        
        char value5 = 'A', value6 = 'a';
        if (value5 != value6) System.out.println("!=");
        else                  System.out.println("==");
        
        // use "else if" for multiple case of more
        // than 2 things (same as the "switch" 
        // statement - which I do not use!)
        
        // use strings (more complicated)
        // with string NEVER use ==
        // instead use .equals()...
        
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
        //  &&    ||    !
        
        int age = 17;
        double iq = 1.0;
        
        if (age >= 21 && iq > 1.0) {
            System.out.println("get in");
        }
        else if (age >= 18 || iq > 1.0) {
            System.out.println("keep trying");
        }
        else {
            System.out.println("get out");
        }
        
        
    }
    
}
