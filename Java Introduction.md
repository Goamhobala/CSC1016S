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
* **println** method
* "Hi mom!" argument
* Actions performed by objects are known as methods

### Variables declarations
* When declaring variables, because java is not a dynamic-type language (static type language), you must declare the type of the variable

```java
double length = 10.3;
float height = 180.3f;
byte number = 12 // 1 byte (-128 t0 127)
short number2 = 245 // 2 bytes (-32768 to 32757)
int weight = 71; // 4 bytes (large number)
String message = "Hi";
boolean eat = false;
char mom = "m";
byte 
```