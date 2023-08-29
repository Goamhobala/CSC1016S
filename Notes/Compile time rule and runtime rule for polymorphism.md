
### Case study
```java
Person s = new Student("Joanna");
```

### Compile time rule
* The compiler only knows the reference type of the object (since new Student() hasn't been executed yet)
* Hence, it can only outputs the method signatures of the class Person, e.g. s.getName();
* If you were to call, say s.getGrades() which only exists in the Student class, a compile time error will be thrown, because the compiler can't find such method in the Person class
* To avoid this, cast the statement, i.e. ((Student) s).getGrades(). Casting tells the compiler to treat "s" as a variable of type Student.


### Run time rule
* Run time follows the dynamic type (the actual) type of the object, namely the actual object that is created and assigned to the variable
* The java virtual machine (JVM) creates a Student object by calling its constructor, and then assign the object to the Person type reference variable named s. 
* JVM , uses dynamic binding, i.e., calling the methods based on the type of the object at run time, namely Student, which is the actual type.
* If method overriding exists, JVM calls the method that's in the subclass, instead of the method in the super class. For example, if getName() in the Student class overrides the getName() in the Person class, JVM will call the getName() of the Student class.