### Revision
* [[1. Object design]]
* Recall method overriding from the first module. Method overriding means to overwrite a method in the parent-class inside a child-class
### The @Override annotation
* It's not strictly necessary to use the annotation @Override. However, there are two benefits of using it.
	1. **Compiler check**. When there's a mismatch of method signature, e.g. different parameter list, the compiler throws an error, thereby allowing the problem to be caught at compile-time
	2. Code readability. Makes the code self-explanatory and more readable as it clearly indicates that a method is meant to override a method from the parent class or implement an interface
* It is therefore considered best practice to include the annotation