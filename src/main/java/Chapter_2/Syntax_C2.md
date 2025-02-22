# Syntax - Chapter 2


In chapter 2 we learned a lot of new things and understanding these things is easier than using them. 

So to make the process of using these statements and structures by yourself easier, here is a list of their syntax.
### if-Statements
````
if(condition)
{
    //instructions-if true
}
else
{
    //instructions- if false 
}

````

Else after if is optional. If the condition is false without an else-statement the if-block will be skipped.

Again we can see that Java loves to use {} to structure things. Keep this in mind. You will get used to this. 

For examples see: [ControlFlow.java](.ControlFlow.java)
### Arrays

Arrays are created like this in Java: 
    
    datatype[] name_of_array = new datatype[array-length]
    
    //or: 
    datatype[] name_of_array = {value_1, value_2, value_3};
    
    //or: 
    datatype[] name_of_array = new datatype[] {value_1, value_2, value_3};

Set a value:

    name_of_array[index] = value; 

Get a value 

    name_of_array[index];

For examples see: [Arrays.java](Arrays.java)

### For-Loops

````
for(initilisation, condition, update)
{
    //instructions
}
````
As long as the condition of a for-loop is true the instructions will get repeated. 

For an example see: [Loops.java](Loops.java)

### While-Loops

````
while(condition)
{
    //instructions
}
````
As long as the condition of a while-loop is true the instructions will get repeated.

For an example see: [Loops.java](Loops.java)

### While-Loops

````
do 
{
    //instructions
}
while(condition)

````
The instuctions will get done once and repeated for as long as the condition is true.

For an example see: [Loops.java](Loops.java)

--- 

### Addition: access modifiers

There are four types of access modifiers:
public, protected, 'none', private

The access by modifier:

    public:     class, package, subclass, world 
    protected:  class, package, subclass
    'none' :    class, package
    private:    class


