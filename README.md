The word “poly” means many and “morphs” means forms, So it means many forms.
Polymorphism is considered as one of the important features of Object Oriented Programming. Polymorphism allows us to perform a single action in different ways.

In Java polymorphism is mainly divided into two types:

Compile time Polymorphism(Method Overloading)
Runtime Polymorphism(Method Overriding)

Examle 1: Class movie is base class.
           other classes are base class which are extending Movie class and all class has same method plot with same signature that is called method overriding .signature is same but begaviour is diffrenet in every class.
Example 1:We are going to go back to the car analogy.
         Create a base class called Car
         It should have a few fields that would be appropriate for a generice car calss.
         engine, cylinders, wheels, etc.
         Constructor should initialize cylinders (number of) and name, and set wheels to 4
         and engine to true. Cylinders and names would be passed parameters.

         Create appropriate getters

         Create some methods like startEngine, accelerate, and brake

         show a message for each in the base class
         Now create 3 sub classes for your favorite vehicles.
         Override the appropriate methods to demonstrate polymorphism in use.
         put all classes in the one java file (this one).
