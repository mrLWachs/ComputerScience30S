
/** Required package class namespace */ 
package computerscience30s;
 
/**
 * A "class" of code (also known as a module) and in NetBeans and Java it 
 * creates a file that ends with ".java" is a way to organize the code. You can 
 * have more than one of these all in one project. This is similar to in C# and
 * Visual Studio when you added more than one form.
 * 
 * @author Mr. Wachs
 */
public class LearnClasses 
{
    
    public LearnClasses() {
        System.out.println("Start learning classes...");
        
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
                
        // Create class "Person" (add a class called "Person" to this Java 
        // project). To do this, you can: see tip #27 in the "NetBeans Tips" 
        // comments section at the bottom of the ComputerScience30S code...
        
        // Note: when in the past we used a line of code like this:
        // Random random = new Random();
        // It related directly to what we are doing in this unit...
        
        Person person = new Person();
        
        // Class object = new Class() <--- implies a method?
        
        person.born();
        person.talk();
        person.name = "John Doe";
        person.gender = "Non binary";
        person.birthday();
        person.talk();
        
        // We can create ("declared", "instantiate") another Person object
        Person jane = new Person();
        jane.name = "Jane Doe";
        jane.gender = "female";
        jane.talk();
        
        
        
        
        
        System.out.println("Completed learning classes!");
    }    
    
}