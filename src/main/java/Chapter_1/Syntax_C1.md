# Syntax

What is Syntax? Syntax is basically the grammar of a programming laguage. Just like real languages, programming languages have a structrue and rules they follow.
Every Programming language has their own syntax.

(The following syntax is only for Java and can be different for other programming languages!)

---
### Structure
Java loves to use {} to structure files. 

For example a class is structured like this.

```
class name
{   
    //class variables 
    //methods
}
```

Inside the class you can also define methods. 

(Methods will be explained in Chapter_2. But are usefull here to understand the importance of {} in Java.=
````
return_value method_name(method_parameters)
{
    //Instructions
}
````

! Attention: Every method  needs to be inside of their class's brackets.

Example:
````
class name
{
    private String name; //variable
    
    String getName() //method inside of class
    {
        retrun name; 
    }

}

String getName() //method outside of class - this won't work!
    {
        retrun name; 
    }
````

### Variables

In general, to create a variable use this concept:
    
    datatype name_of_variable;
    
    //Example: 
    String name;

To assign a value to the variable use this:

    name_of_variable = value;

    //Example: 
    name = "Anna";

To do both in one step use this concept:

    datatype name_of_variable = value;

    //Example: 
    String name = "Anna";