### Student s = new Student();
* The **new** statement (which is actually an operator) allocates space. Once the space has been allocated, the reference to that space is passed to the constructor Student();
* The constructor(aka initialiser) initialises all the variables associated with Student s
* Variables are initialised inside out. i.e., the constructor of the Object class is first called, and then the Person class's , and finally return to the Student's
* Student() -> Person() -> Object() -> Initialise variables associated with Objects -> returns control to Person() -> initialise -> returns control to Student() -> initialise

### Java compiler
* Essentially, java compiler removes all the syntactic sugar in your code, and then convert it into bytecode, which is an intermediary representation that can be executed by the java virtual machine
* When it comes to compiling classes, the java compiler does three things
	1. Extend the class from object if it doesn't have a parent class
	2. Insert an empty constructor if it doesn't have one
	3. a. Add a super() statement inside the constructor to invoke the constructor of the super class. (This also has to be the first statement to prevent the subclass from modifying or accessing methods of the super class that have not been initialised yet)
	    b. Or, java compiler adds a this() statement, which invokes another constructor in the same class; this is possible because of method overriding [[1. Object design]]. Note: If you explicitly call this() in every constructor of the same class, you are going to cause an infinite loop.