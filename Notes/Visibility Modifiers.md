### Public
* Grants access to every other class
```java
public x;
```

### Protected
* Grants access to every class within the same package as well as all subclasses, regardless of whether they're inside the package or outside
```java
protected y;
```

### Package
* Grants access to every class within the same package
* The default access modifier. (i.e., if no modifier is specified, this one is used)
```java
z;
```

### Private
* Restrict access to only within the same class
* Note: Can use getters and setters to give some control.
```java
private secret;
```

![[Pasted image 20230712101320.png]]