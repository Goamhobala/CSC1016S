### What exactly do they do?
The keywords "super" and "this" refer to the superclass and the current class (this class, self if you know python). Hence, super() refer to the constructor of the direct parent class and this() refer to the constructor of the current class. A helpful way to think about them is to simply substitute the word "super" with the name of the parent class and the word "this" with the name of the current class.

### Example 
For example, let's say there's a class name Student, which extends the class Person, calling super(name) inside the constructor of Student means that you are calling the constructor of Person, i.e. Person(name) (remember, java objects are created inside out. Further reading:  [[Class construction]]). Similarly, this() means that you are calling the constructor of Student() itself (Note: if there are no other constructors in the Student class, an infinite loop will be generated). (Further reading: method overloading)

### Some key things to remember
* super() can only be used to refer to the direct parent class, i.e., no grandparent classes and other ancestors
* super() can only be used in a non-static context, which means that it doesn't give you access to the static methods and variables of the parent class. However, you can use the name of the parent instead. For example, if Person has a static method printHeight(), use Person.printHeight() instead of super.printHeight() in the Student class (the child class).
* Both super() and this() must be in the first line of the constructor. This is to prevent you from modifying or accessing methods or variables that have not been initialised.