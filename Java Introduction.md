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
	public static void main(String args[]){
		System.out.println("Hi mom!");
	}
}
```

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
Syntax:
```java
double[] numbers = new double[5]; // array of size 5]
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
* Getters and setters for instance variables.