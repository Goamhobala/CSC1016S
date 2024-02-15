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
- [[#Super]]





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
* Static methods are inherited but not overridden. i.e. They are merely hidden. 
 ```java
 // Suppoese B extneds A
 A a = new B();
 a.staticMethod(); // invokes the staticMethod() of A
 B.staticMethod(); // invokes the staticMethod() of B
 ```

* Should be invoked through the class name instead of the instances. However, instance.staticMethod() also works, just not recommended.
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

### Child Class
* The child class inherits all the public methods and instance variables of the parent class
* Can add its own methods and instance variables
* In the child class's constructor, if super() is not called, then java automatically adds it for you.
* When instantiating the child class, all instance variables of the parent class will be initialised first. [[Class construction]]
* When overriding methods, you cannot change the return type unless the return type is a parent class type, in which case you can change it the child class type
* This is known as a covariant return type
* Can change the visibility modifiers from **less visible to more visible**, but not the other way around.
* Has the type of itself and its ancestors as well
* Thus, since ArrayList implements List, you can also do this
```java
List<int> example = new ArrayList<int>()
```
### Overloading vs Overriding

* Method overloading refers to having multiple methods in the same class with the same name but different parameter lists.
* Method overriding means having a method in the child class with the same name and same parameter as the one in its parent class
* The annotation @Override ensures method overriding. [[When to use @Override]]
* Use **final** to prevent overriding
* When overriding methods, you can make it more visible (permissible), but not the other way around.

### Super
* A keyword that refers to the parent class
* super() must always be called first (The variables of the parent class must always be initialised first)
```java
public Child(int age, int height){
	super(age);
	this.height = height;
}
```
[[super() and this()]]


### The Object Class
* "The Adam class": every class is a descendant of it
* Has some methods that every class inherits, e.g., equals(), toString(), clone();

### Equals method
```java
public boolean equals(object other){
	if (other == null){
		return false;
	}
	else if (getClass().equals(other.getClass())){
		return false
	}
	else{
	.......
	}

}
```


### getClass vs instanceof

* instanceof operator returns true as long as the class is a descendant of the class (<=) 
```java
Child instanceof Parent;
```
* Whereas getClass() returns the memory location of the class (not the instance)
* Note: every descendant of the Object class has a static variable "class" that allows you to compare it to the getClass();
## Polymorphism
#### Introduction
* many forms
* Many definitions to one method name
* Through late binding and dynamic binding
####  Binding
* Binding refers to associating a method definition with a method invocation
* If the association happens during the compiling stage, it's called **early binding**. e.g. inheriting a method
* If the association happens when the method is invoked, i.e. during run time, it's called **late binding** or **dynamic binding**.  e.g. overriding a method, and decide which one to use (parent or child) at run time.
* In this example, equals is an example of late binding since both Person and Jojo have the equals method, and Jojo's equals() overrides the Person's equals(). getName() is an example of early binding as Jojo simply inherits the method from Person.
* Note: no late binding for static methods (as there's no method overriding for static methods)
* Note: **final** indicates that you can't override the method
```java
public class Person{
	private String name;

	public Person(String name){
		this.name = name;
	}

	public boolean equals(Object other){
		if (other == null){
			return false;
		}
		else if (getClass() != other.getClass()){
			return false;
		}
		else{
			return other.getName().equals(this.name);
		}

	}
	public String getName(){
		return this.name;
	}
}

public class Jojo extends Person{
	private String name;
	private String stand;

	public Jojo(String name, String stand){
		super(name);
		this.stand = stand;
	}

	public boolean equals(Object other){
		''''
	}

}
```

#### Upcasting
```java
List<int> l = new ArrayList<int>
```
* When you call l.add(), the add method of the ArrayList is invoked rather than the one for List.
* Reason: Late binding
* Only works if the method also exists in one of the ancestor classes. E.g. Suppose that ArrayList has a method poop() that's not in any of its ancestor class, then you can't call l.poop();
* To do that you need to downcast
```java
l.poop(); //won't work
((ArrayList) l).poop()// works
```



#### Downcasting

```java
int first = (ArrayList) l[0];
```
* Note the above example is only for illustration purpose, you don't have to do this in real life
* For downcasting to happen, the object has to be upcasted first.

### Interface
* Basically an abstract class with 100% abstraction
* Only method signatures
* Collection of methods for a specific purpose. E.g., the concept of ordering, with methods such as precedes(), follows(), etc.
* Use the keyword **implements** instead of **extends**
* You can't have multiple inheritance in java (to prevent methods of the same name), but you can implement multiple interfaces
* Everything of an interface should be public
* An interface can implement another interface.
* A **contract**
* Shared functionality, but not shared implementations.
* Constants must be public static final.
```java
public class Murakami extends Existentialist implements Writer{

}

```
* You can't instantiate an interface, but you can upcast, i.e.
```java
Writer m = new Murakami();
```
### Interface vs Abstract Class
* Both are types
	* Method parameter type
	* Variable type
* 
```markdown
| Header 1 | Header 2 |
| -------- | -------- |
| For set of functions of classes | Ideal for hierarchy of functions|
| Item 4 | Item 5 |
```


### Methods/Constants with same name
Compile time errors (Might be run time, but still not gonna work):
*  Constants with same name but different values
* Methods with same name but different return types (Which one am I supposed to call?)

Runs fine:
* Same names, same return types (Doesn't make sense however.)
* Same names, different parameter list (method overloading)

### Marker Interface
* Empty interface (No constants/method signatures)
* Used to tag a class as having certain properties but not necessarily enforced.
* e.g. Cloneable (used to indicate that the clone() method can be used safely)
* e.g.2 Serialisable (Implements file I/O in a particular way.)

### Normal Interfaces
* e.g. Comparable (ordered/ranked/sorted)
	* Has only one method signature: compareTo(Object other)
	* negative int if this precedes other (this < other)
	* 0 if same
	* positive if other precedes this (other < this)
* Generic class = parameterised class: Enables code to be applied to any class

### ArrayList
```java
import java.util.ArrayList

ArrayList<Poo> p = new ArrayList<Poo>()
p.add(new Poo());
p.add(1, new Poo()); // The index must be >= 0 and <= current size of the Array.
p.set(int index, item); // Returns the object that previously occupied the position
p.remove(Object theElement);// Returns boolean. Uses the equals() method
p.remove(int index); // Returns the element.
p.removeRange(int fromIndex, int toIndex);

```
* Dynamic size
* (Behind the scene: create new array -> repopulate)
* Cons
	* Base type must be class type (Reference type). Can't be primitive type. (Not really an issue since there's automatic boxing and unboxing)
	* **clone()** method returns a shallow copy.
* More efficient if you specified the size ahead of time (initial value is 10)
* Implements the Collection interface
* Collections.sort(Comparable c)
* All classes that implements the collection interface can use the for-each loop
* Note: You can't make changes to the collection object inside a for-each loop
* 

### Generics
* Need to specify the base type
* e.g. ArrayList\<Poo>
* Create **classes, interfaces, methods**, that work with different data types
* A type parameter can have any reference type
```java

public class GenericTest{
    public static void main(String[] args){
        String test = new String("Test!!!!!!!");
        GenericExample<String> g = new GenericExample<String>(test);
        System.out.println(g.getData());
    }
}
class GenericExample<T>{
    private T data;
    public GenericExample(T data){
        this.data = data;
    }
    public void setData(T newData){
        this.data = newData;
    }
    public T getData(){
        return this.data;
    }

}
```
* Can't have an array of generic objects
* Can't be exception class
* Can have multiple type parameters
```java
public class Calc<T1, T2>{
}
```
```java
public class Gen<T1, T2>{
}
class GenChild<T, T1, T2> extends Gen<T1, T2>{} // This is allowed
class GenChild2<T> extends Gen<T1, T2>{} // Not allowed
```

### Bounds of type parameter
* To limit what can be applied to the type parameter
* e.g.
```java
public class Gen<T extends Comparable>{}
```
* This translates to T must be a class that **implements** the **Interface** Comparable
* e.g.2
```java
public class Gen<T extends ClassA & InterfaceA & InterfaceB>
```
* Note that the type parameter can only extend one class but can implement multiple interfaces.

### Stack
* Last in first out
* consists of push() (adding something to the start of the list) and pop() (Removing the first item and returns it);
```java
Stack s = new Stack();
s.push(1);
//[1]
s.push(2);
//[2, 1]
s.pop();
//[1]
```

### Queue
* Remove data in the same order in which they were added
* i.e. first in first out
* Consists of enqueue() and dequeue();
```java
Queue q = new Queue();
q.enqeue(1);
[1];
q.enqeue(2);
[1, 2];
q.deqeue();
```