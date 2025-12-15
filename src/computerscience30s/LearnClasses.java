
/** Required package class namespace */ 
package computerscience30s;
 
/**
 * LearnClasses.java - A "class" of code (also known as a module) and in 
 * NetBeans and Java it creates a file that ends with ".java" is a way to 
 * organize the code. You can have more than one of these all in one project. 
 * This is similar to in C# and Visual Studio when you added more than one form.
 * 
 * @author Mr. Wachs
 */
public class LearnClasses 
{
    
    /**
     * Default constructor method
     */
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
        
        // We can create ("declared", "instantiate") another Person object
        Person jane = new Person();
        jane.name = "Jane Doe";
        jane.gender = "female";
        jane.talk();
        
        // Creating a third person... (using the 2nd constructor option)
        Person james = new Person("James Rogowy");
        james.talk();
        
        // Create a 4th person... (using a different constructor method)
        Person fourth = new Person("Forth Forthy",4,"four");
        fourth.talk();
        
        // =====================================================================
        // (6) THIS keyword
        // =====================================================================        
        // The keyword "this" is used as a "placeholder" to refer to the object
        // that will (eventually) be created. Often used in constructor methods
        // or other methods to refer to the class properties. Often used to 
        // avoid confusion with any method parameters that have the "same name" 
        // as the properties. It can also be used to implicitly call (invoke) 
        // methods within a class as the word "this" makes that implicit 
        // reference to the object itself (see an example in the Person class)
        
        // =====================================================================
        // (7) ENCAPSULATION (private and public)
        // =====================================================================        
        // A concept applied to both properties and methods of classes to 
        // determine if they can be "used" only within the class or by other 
        // classes "communicating" with this class. The modifier word "private"
        // means the property can only be accessed and changed within the class
        // (not from other classes) and if used with methods, the methods can 
        // only be called by other methods inside the class (sometimes call 
        // "helper" or "utility" methods). The modifier word "public" means the
        // property can be accessed and changed within the class and outside 
        // the class (from other classes) and if used with methods, the methods
        // can be called anywhere (inside or outside the class) - See examples
        // in the Person class 
        
        // Note: the "age" property was originally public but then it was
        // "encapsulated" by making it a "private" so it can no longer be 
        // accessed (read) or modified (changed) outside the class. Also the
        // "think()" method was made private so it can only be called within
        // the Person class - not here in this class
        
        // person.age = 10;
        // person.think();
        
        // =====================================================================
        // (8) INHERITANCE
        // =====================================================================        
        // The ways two or more classes of code "communicate" with each other 
        // to transfer data or represent (model) a "real world" relationship of 
        // concepts. Inheritance is where one class "inherits" all the 
        // properties and methods of the other class - like biology you can 
        // have a parent (or "super" or "base") class and a child (or "sub") 
        // class that inherits from the parent class - this is also simply put 
        // as a "is a" relationship (see an example in the Student class)
        
        // =====================================================================
        // (9) ASSOCIATION
        // =====================================================================        
        // The ways two or more classes of code "communicate" with each other 
        // to transfer data or represent (model) a "real world" relationship of 
        // concepts. Association is where one class and another class "use" one
        // another - this can be also classified as a "usage" (one class using 
        // the other), or "composition" (one class composed of another) 
        // relationship - this is also simply put as a "has a" relationship
        // (see an example in the Student class)
        
        // Create a Student object - which inherits all properties and methods 
        // from it's parent (super) class Person ("Student 'is a' Person")
        Student student = new Student("Pubert Studentson",16,"male",67);
        // Now call (invoke) the 'inherited' methods...
        student.birthday();
        student.talk();
        // Call (invoke) methods specifically for the student class
        student.study();
        student.talk();
        student.slackOff();
        student.talk();
        student.cram();
        student.talk();
        // Calling another inherited method
        student.die();
        student.talk();
        
        // =====================================================================
        // (10) SUPER KEYWORD
        // =====================================================================        
        // The keyword "super" is also used as a reference to the parent class 
        // that this class inherits from (extends). Used with the dot operator,
        // you can access any public properties or call any public methods from
        // the parent or "super" class (you can see an example of this in the
        // "Student" class)
        
        // =====================================================================
        // (11) OVER-RIDE METHODS
        // =====================================================================        
        // A type of method - so this means (like the unit on methods) it may 
        // or may not have parameter(s) and it may or may not (void) return 
        // something. This applies to classes that inherit from another class.
        // It is similar to the concept of over-loading a method (two or 
        // methods with the same name but different parameters) - but not quite
        // the same. The method is named the same name (with the same parameter
        // list) as a method that was already inherited from the super (parent)
        // class. Instead of calling the inherited method, when you call this 
        // method from the sub (child) class, this sub classes method code 
        // "over-rides" that method and it's code runs instead (you can see an 
        // example of this in the "Student" class)
        
        // =====================================================================
        // (12) POLYMORPHISM
        // =====================================================================        
        // Is the idea that our code can adapt or change ("morph") to many 
        // ("poly") different types of objects. For example, a method that can 
        // take a class type as a parameter will accept all objects of that 
        // type, but also all children (sub-class) objects of that class as well
        // (you can see an example of this if you complete the bonus section of
        // this example...)
        
        System.out.println("Completed learning classes!");
    }    
    
}