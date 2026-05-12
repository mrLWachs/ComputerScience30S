
package computerscience30s;

/**
 * LearnClasses.java - A "class" of code (also known as a module) and in 
 * NetBeans and Java it creates a file that ends with ".java" is a way to 
 * organize the code. You can have more than one of these all in one project. 
 * This is similar to in C# and Visual Studio when you added more than one form.
 * 
 * @author Mr. Wachs
 * @since May 7, 2026
 */
public class LearnClasses {
    
    public LearnClasses() {
        System.out.println("Start Learning about Classes...");
                
        // =====================================================================
        // (1) WHAT IS A CLASS?
        // =====================================================================        
        // A class is a way in code to combine properties and methods. Classes 
        // can also "communicate" with other classes, and they are used to 
        // model "things" in the "real" world
        
        // =====================================================================
        // (2) PROPERTIES
        // =====================================================================        
        // Properties are things about the class, or descriptors, or 
        // adjectives (they can also be seen as "global variables" for the 
        // class)
        
        // =====================================================================
        // (3) METHODS
        // =====================================================================        
        // Methods are things the class can do, or actions, or verbs (they are 
        // written with parameters, return types, etc.)
        
        // NOTE: Create class "Person" (add a class called "Person" to this Java 
        // project). To do this, you can: see tip #27 in the "NetBeans Tips" 
        // comments section at the bottom of the ComputerScience30S code...
        
        // =====================================================================
        // (4) OBJECTS
        // =====================================================================        
        // The term "object" refers to when you USE the class to create (or 
        // "instantiate") an object that comes from that class (or an 
        // "instance" of that class). We use one class to create multiple 
        // objects (instances). The words are related but do not mean the same 
        // thing. Objects area specific instances of the general class. 
        // Analogy: classes are like "cookie cutters", and objects are the 
        // "cookies" -> ClassName objectName = new ClassName();
              
        // NOTE: In past Computer Science courses, when we wrote a line like the  
        // one below, it related directly to what we are doing in this unit:
        // Random random = new Random();
        
        Person person = new Person();
        
        // Class object = new Class() <--- implies a method?
        
         // person.born();
        // The original "born" method was changed into a constructor
        
        // We can call (invoke) methods within the object
        person.talk();        
        // We can also "access" the properties (variables) of that object
        person.name = "John Doe";
        person.gender = "Non binary";
        person.birthday();
        person.talk();
        
        // =====================================================================
        // (5) CONSTRUCTOR METHODS
        // =====================================================================        
        // These are special methods created in a class that are called 
        // (invoked) when a class is used to create an object - these methods 
        // have: (1) The same name as the class (including a capital letter)
        // and (2) No return type - not even the word "void". They are used to 
        // set the properties to starting (or "default") values - When the 
        // constructor is called, it is "creating" an object, or 
        // "instantiating" an "instance", "declaring" a "variable" of the 
        // class type. We can also overload the constructor methods 
        // (see examples in the Person class)
        
        
        
        
        
        
        
        
        
        System.out.println("Completed Learning about Classes!");
    }
    
}