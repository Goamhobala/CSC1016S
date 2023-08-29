![[Pasted image 20230711161027.png]]
notes:
* p.getID() doesn't work because the compiler doesn't know that you've changed the reference type of p. It'll work if you **cast** it, i.e. ((student)p).getID()
* Every class is inherited from the object class
* A person is a faculty but a faculty is not necessarily a person.
* Hence f = q is not allowed. Because this prevents one from trying to access methods shared amongst the Faculty objects, which should not be allowed for a Person object

### Reference Variables
The reference variable of an object stores the address to that object. Therefore, their types must match. Since Student is a Person (Student is a child class of Person), Person p = new Student() is allowed. This is called upcasting. This doesn't work the other way around, however. Downcasting is not allowed because there might be some methods present in the Student type object that are not present in the Person's object, not every student is a Person.