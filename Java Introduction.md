### Table of Contents
- [Table of Contents](#table-of-contents)
- [Origin](#origin)
- [Translation process](#translation-process)
- [Objects and Methods](#objects-and-methods)
- [Application programs](#application-programs)
- [System.out.println()](#systemoutprintln)
- [Variables declarations](#variables-declarations)
- [Naming convention](#naming-convention)
- [Assignment](#assignment)
- [Increment and decrement:](#increment-and-decrement)
- [String](#string)
- [Importing packages and classes](#importing-packages-and-classes)
- [Scanner class](#scanner-class)
- [Be careful when mixing nextline and other next together.](#be-careful-when-mixing-nextline-and-other-next-together)
- [File input/output](#file-inputoutput)
- [Null](#null)
- [If-else](#if-else)
- [Array:](#array)
- [For loop](#for-loop)
- [Classes](#classes)
- [Primitive type vs Class type values](#primitive-type-vs-class-type-values)
- [Methods](#methods)
- [Constructor](#constructor)
- [Paramaterised Constructor vs Default Constructor](#paramaterised-constructor-vs-default-constructor)
- [Common methods that a class should have](#common-methods-that-a-class-should-have)
- [Encapsulation](#encapsulation)
- [Accessor and Mutator Methods](#accessor-and-mutator-methods)
- [Static Methods](#Static-Methods)





### Origin
* Originally created for home appliances in 1991

### Translation process
* A compiler language
* Before it's compiled into machine code for each processor, java cod (.java) is first converted into java-byte code using the java virtual machine (jvm) (.class file)
* Write-once, run everywhere

###  Objects and Methods
* Java is a high level object oriented programming (oop)
* Objects of the same type are said to have the same type, or belong to the same class
* All programming constructs in java are part of a class.

### Application programs 
* When a java application program (regular program) is run, the run-time environment automatically invokes the main method
* All application programs must have a main method
* Note that not every class must have a main method. Only the application program, namely the program that's executed first (like index.scss, e.g.)

```java
public class Hello{
	public static void main(String[] args){
		System.out.println("Hi mom!");
	}
}
```
* Everything that comes after the command line that runs the programme will be stored inside the String\[\] args. (Comma separated)
e.g.
```java
2 public class Test {  
3     
4    public static void main(String[] args){  
5      for (String arg: args){  
6         System.out.println(arg);  
7      }  
8    }  
9  }
```
* If you run "java Test.java huh kokonut", then the output will be huh kokonut
### System.out.println()
* Java programs work by calling objects
* **System** is a package
* **out** is a class
* **System.out**: An object used for sending output to the screen
* **println** method, moves pointer to beginning of next line
* "Hi mom!" argument
* Actions performed by objects are known as methods

### Variables declarations
* When declaring variables, because java is not a dynamic-type language (static type language), you must declare the type of the variable
* Basic types are known as primitive types
* A variable must first be initialised.
* Oftentimes, variables are given an initial values. However, don't rely on this

```java
double length = 10.3; //Declaration plus assignment
float height = 180.3f;
byte number = 12 // 1 byte (-128 t0 127)
short number2 = 245 // 2 bytes (-32768 to 32757)
int weight = 71; // 4 bytes (large number)
String message = "Hi";
boolean eat = false;
char mom;
```
Note: String uses double quote, char uses single quote


### Naming convention
* Classes: FirstClass
* Variables, objects, methods: camelCase
* Constants: MAX_SPEED

### Assignment
* Right to left, hence can be chained
* int decimal = 1.00 doesn't work but double one = 1 works
* Hierarchy: Byte -> Short -> (int == char )->long-> float -> double ->
* Note: When both operands are int, it'll give you a floor integer answer.
* If you want the answer to be in double, type cast one of them. 
```java
int n = 11;
int m = 5;
double answer = n / (double) m;


```

### Increment and decrement:
* ++n pre-increment, --n pre-decrement
* n++ post-increment, n-- post-decrement likewise.
```java
int n = 3;
int m = 3;
int x = n++ + 2; // x = 5
int y = --m + 2; // y = 4
```


### String 
* Not a primitive data type
* Is an object, and therefore has methods associated with it
* Immutatble: A new object is created everytime a change is made
* When a string is combined with another 
* Note: When comparing string, use .equals() method instead of == (because they're different objects)
* Use charAt to access the character
* It is iterable
* printf is an example of legacy code (things from originally migrated from other programming languages)
```java
System.out.println("")//Print with a new line
System.out.print("")// Print without a new line
System.out.printf("formatSpecifiers", value1, value2)// Print with formatting (Look up the syntax) Default right align
/*
- % indicates start of specifier
- int justifying characters
- .int rounding
-  
*/
```

### Importing packages and classes
```java
import java.text.NumberFormat;
//OR
import java.text.*;

```

### Scanner class
* Part of the java util library
* Allows you to access keyboard inp
* Separator is whitespace (unlike python which uses new line)
* nextIn() for integers, nextDouble for doubles etc.
* next() vs nextLine: Reads from the current position on the line to the end of line. (ends at but excludes \\n)

```java
import java.util.Scanner

public class Example{
	
   private static Time[] getInputs(){  
    
      try (Scanner input = new Scanner(System.in)){  
         System.out.println("Enter time A:");  
         Time timeBefore = new Time(input.nextLine());  
         System.out.println("Enter time B:");  
         Time timeAfter = new Time(input.nextLine());  
      }  
      return new Time[]{timeBefore, timeAfter};  
                
   }
}
```

### Be careful when mixing nextline and other next together.
```java\
int n = input.nextInt();
//NB: s1 is empty since n ends with an white space. It moves the pointer to the next line (you don't actually need the assignment)
String s1 = keyboard.nextLine(); 
String s2 = keyboard.nextLine();
```

### File input/output
* Scanner class can also be used to read files
* Other classes to use
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

```
* Use try and catch to open file
* Use nextLine(), nextInt() to read from Scanner like reading from console

### Null
* Means there's something there but the something there is nothing


### If-else
* You can add ; to the end of a if block, to isolated nested if block for example.

### Array:
* A data structure to process a collection of data
* Static type in java
* Builtin java array is static. i.e. Size fixed
* To use dynamic array use ArrayList
* Strict type
* The **length public instance variable** gives you the maximum number of values (the array size), instead of the actual number of values
* Declare a counter to store the number of values
* Arrays are instances of a class
Syntax:
```java
double[] numbers = new double[5]; // array of size 5, create 20 instance variables that will be initialised to null
String[] mangas = {"Gintama", "Chainsaw man"}; // array of size 2

```

### For loop
```java
for (int i; i < 10; i++){
	System.out.println(i);
}
```
* Can change counter within the loop. You can even omit the updater 
* Initialise -> test -> body -> update
* Since update comes last, ++i and i++ make no difference
* If leave boolean expression blank, then infinite loop
* You can also leave the initialiser out, if you've pre-declared the variable already. This allows you to access the counter outside of the loop
 ```java
int j = 10;
for (;j< 17;j++){
	System.out.println(j);
}   
      
System.out.println(j);
```
* exit, break, continue 
	* exit ends the program immediately
	* break ends the loop
	* continue ends the iteration

### Classes
* A type of data (A programmer defined type)
* A template that defines the general properties of a type of object, i.e., the definition of the object
* A template for creating objects
* A recipe for a dish
* 3 types of classes
	* An user interface class
	* Helper class. (Tool box)
	* Programmer-defined class (To create actual objects)
* An object is a piece of a type of data
* An object is an actual entity, instead of the concept that defines the kind of entity
* Methods for behaviours
* Instance variables for properties
* [[Class construction]]
### Primitive type vs Class type values
* Primitive type values is a single piece of data.
* Class type values can carry multiple pieces of data and actions known as methods.
* Primitives are value type whereas objects and enums are reference type

### Methods
```java
public static void main(String[] args){
	System.out.println("The first line is known as the header");
}
```

### Method-Overloading
* An example of polymorphism (poly: many, morph: form)
* It allows you to create multiple versions of a method that do slightly different things
* They must have different parameter list (regardless of return type of the method), due to java's compilation process.
* An example will be default constructor vs parameter constructor. If no arguments are passed to an object's constructor, then the default constructor is used. The parameter constructor is used otherwise.
* Note: This should not be confused with **method overriding**
	* Method overloading refers to having multiple methods in the same class with the same name but different parameter lists.
	* Method overriding means having a method in the child class with the same name and same parameter as the one in its parent class
	* The annotation @Override ensures method overriding. [[When to use @Override]]erd

### Constructor
```java
Student s = new Student();
```
* The **new** statement (which is actually an operator) allocates space. Once the space has been allocated, the reference to that space is passed to the constructor Student();
* The constructor(aka initialiser) initialises all the variables associated with Student s

### Paramaterised Constructor vs Default Constructor
```java
public class Student{
	private String name;
	private String studentNumber; 
	Student(){
		this.Student("Test Student", "TESSTU001");
	}
	Student(String name, String studentNumber){
		this.name = name;
		this.studentNumber = studentNumber;
	}

}
```
* If no arguments are passed to an object's constructor, then the default constructor is used. The parameter constructor is used otherwise.
* The default constructor allows you to provide default values to the object Student. The if no arguments if provided, the default constructor is invoked, which will itself invoke the parameter constructor using the default values as argument.
* The "this" keyword refers to the object that's being called.



### Common methods that a class should have
* Constructor for default values, e.g. 
```java
this();
super();
```
*  equals() Returns a boolean that checks if two instances of the same type are equal.
	* Generally, this is done by comparing instance variables
```java
String x = "Shohei Ohtani";
x.equals("Shohei Ohtani");
```
* toString(): Returns a string representation of the object.
	* Note: if an data type has a toString method, then Sytem.out.println(object) automatically invokes the toString method
* Getters and setters for instance variables.


### Encapsulation
* aka abstraction
* A sealed unit with the implementation details concealed
* Information hiding: Knowing the detail is unnecessary because interactions with the object don't require the knowledge of implementation.
* e.g. bar access to instance variables with private
* As a rule of thumb, make all instance variables private
* Interface available to the user of the class contains:
	* Comments
	* Method signatures (headings, visibility modifier, return)
	* Public defined constants (public int DOORS = 4;)
* [[Visibility Modifiers]]

### Accessor-and-Mutator-Methods
* getters and setters
* Most instance variables should have a getter, which is a method that returns a certain instance variable
* Setters are not always needed. They are methods that mutate certain instance variables.


### Static-Variables

```java
public class Jojo{
	private static int numJojos = 0;
	public static final String NICKNAME = "jojo";
	// Safe to make public since it can't be changed
	public static void dio(){
		System.out.println("DIOOOOOO!")
	}
}
```
```java
Jojo kujo = new Jojo();
```
* Static variables/methods belong to the class itself, instead of certain instances of a class (objects created by the class)
* Static variables: e.g. to count the number of instances you have created from the class
* Every instance of a class has access to its static variables
* It's preferable to explicitly initialise static variables rather than rely on the default initialisation.

### Static-Methods
* Only has access to static variables
* Invoked through class name
* Note that static methods has no "this", since it doesn't belong to any instances
* You can put main in any class. Only do it if it makes sense to convert the class into a application tho. (Especially useful when the class contains diagnostic code)
```java
Jojo.dio();
```

### Wrapper Class
* A class type corresponding to each primitive type
* Prior to java 5, you need to box and unbox. That is, convert the data between wrapper classes and their corresponding primitive types
* Can be used interchangeably to a certain degree.
* Doesn't have no argument constructor
```java
// Automatic casting
Integer myInt = 5;
Integer myInt2 = new Integer(2);
```
* Numerical wrapper classes have useful constants such as MAX_VALUE, MIN_VALUE
* Some useful methods (Note that these methods are static)
```java
// String to number
Integer.parseInt("5");
Long.parseLong("3");
Double.parseDouble("5.32");
Double.toString(5.32);
```

### Variables and Memory
* Main memory: RAM
* Secondary memory: Hard Drive
* Primitive type variables: Pass by value. (Location stored in a table known as **stack**)
* Class type variables: Pass by reference. Variables store the memory location. (The location in heap memory)
* Two reference variables can contain the same reference
* Note: If your instance variable is an class type value, then you should return a deep copy of it instead of shallow copy to avoid privacy leaks
```java
Jojo kujo = new Jojo();
Jojo starPlatinum = kujo;
```
* Both kujo and starPlatinum are pointing to the same object.

### Parameters
* All parameters are call-by-value:
* A parameter is a local variable that is set equal to the value of its arguments
* Class parameters, since they are passed by reference. If the parameter changes the instance variables of that instance, those changes will be visible outside as 
* A method cannot change the value of a variable of a primitive type that is an argument to the method
* However, a method can change the values of the instance variables of a class type that is an argument to the method.
* Note: Class type variables can lead to privacy leaks: e.g. Having pointers inside the class that points to a parameter, which originated from outside the class
```java

```

### Take an infinite amount to parameters
* Note: The arguments must be of the same type
```java
public doSth(int... args){
	for (int num : args){
		System.out.println(num);
	}
}
```
### Null
* A special constant that may be assigned to a variable of any class type
* Use to indicate that a variable has no value
* Not an object, but rather a places holder for a reference that does not name any memory location
* Therefore, a method cannot be invoked using a variable that is initialised to null (Throws **Null Pointer Exception**)
* Note: Primitive types are not initialised to null.

### Anonymous Objects
```java
Money m = new Money("R10", new Currency("ZAR", "R", 100));
```
* In this case, the currency object is an anonymous object

### Copy Constructor
* A constructor with a single argument of the same type as the class
* To create a clone of the object (A deep copy, in contrast top shallow copy) 
* Therefore, you'll end up with two instances
* Note: A class should typically consist of three constructors: Copy (Necessary for mutable types), Default(When not needed, make it private), and the vanilla one.

### Inheritance
* A general (parent) class is first defined.
* A specialised class (child) class that inherits a parent class will have all the instance variables and methods of that class.
* Promotes code-resusablity
* To inherit a class, use the keyword **extends**
* Note that you can only extend one class
```java
public class Poop extends OrganicSubstance{

}
```
* In this case, Poop will inherit the property(instance variable) CH and the method burn().
* Of course, you can add instance variables and methods to the class Poop, e.g. methods such as 
* Note: private instance variables are also inherited, but they can't be directly accessed within the child class (needs get and set)
* 

























