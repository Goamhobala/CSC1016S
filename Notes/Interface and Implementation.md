### Example:
* List is an interface while ArrayList is an implementation of it.

### Interface
* Basically, an interface defines a blueprint for a group of classes to follow
* Interface defines a collection of abstract methods (the method signatures), which define the method's name, return type, and parameters, but not the body.
* More like a skeleton for classes
* Interfaces thereby achieve abstraction, code-reusability, and flexible design (e.g. polymorphism)
* Can extend another interface [[Inheritance]]
* Note: Interfaces can provide static methods (methods that are associated with the class/interface itself, rather than the instances and cannot be overridden by the implementing classes. For example, objectsCollide (GameObj obj1, GameObj obj2) in the interface GameObj; default methods (the default implementation, which can be overridden by the implementing classes); private methods, though not included in the contract, they can serve as helper methods for the default and static methods. Private methods can be both static and non-static. Private static methods can only be called by other static methods whereas non-static methods can be called by both static and non-static methods.

### Implementation
* Essentially fill up the skeleton provided by the interface
* The class provides the actual code for the methods defined by the interface it's implementing

### Code Example
```java
// Interface declaration
public interface Drawable {
    void draw();  // Abstract method declaration
}

// Class implementing the interface
public class Circle implements Drawable {
    @Override
    public void draw() {
        // Provide implementation for the draw() method
        System.out.println("Drawing a circle");
    }
}

public class rhombicosidodecahedron implements Drawable {
    @Override
    public void draw() {
        // Provide implementation for the draw() method
        System.out.println("rhombicosidodecahedron");\
        // Ain't no way that I'm going to code something that actually draws this
    }
}
```
