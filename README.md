# Design Patterns Reference

This repository is meant to serve as a one-stop, language-agnostic Design Patterns reference. It is essentially a summary of, and heavily based on the following resources:

1. (Book) Head First Design Patterns: A Brain-Friendly Guide, By Eric Freeman and Elisabeth Robson.

2. (Book) Design Patterns: Elements of Reusable Object-Oriented Software, By Eric Gamma, Richard Helm, Ralph Johnson, John Vlissides a.k.a The Gang of Four (GOF)

3. (LinkedIn Learning Course) Node.js Design Patterns by Alex Banks. The summary I made to that course can be found here: [Node.JS Design Patterns Summary](https://github.com/asyrul21/design-patterns-nodejs).

The code examples in this repository is heavily based on [Reference 1], thus is in Java. That being said, we attempt to exclude any Java-specific implementations, or using any Java's built in API libraries.

More resources: [Official Head First Design Patterns Resources Page](https://wickedlysmart.com/head-first-design-patterns/)

## How to run the code

You can either run the code via IDE (intelliJ) or via the Terminal.

### To Run via IDE:

1. Open the Main file of the example.

2. Click Run

### To Run via the Terminal

1. Navigate to */src*

2. Compile the class:

    ```bash
    javac StrategyPattern/Example1/SimuDuck.java
    ``` 

3. Run

    ```bash
    java StrategyPattern.Example1.SimuDuckMain
    ```

NOTE: Convention used is: `[pattern].[example].[main]`

## Not Covered Patterns

1. Interpreter

2. Mediator

3. Memento

4. Visitor

# Notes

## OO Basics

1. Abstraction

2. Encapsulation

3. Polymorphism

4. Inheritance

## OO Design Principles

1. Encapsulate what varies.

2. Favor composition over inheritance.

3. Program to interfaces, not implementation.

4. Strive for loosely coupled designs between objects that interact.

5. Classes should be open for extension and closed for modification.

6. The Dependency Inversion Principle: Always depend on abstractions. Do not depend on concrete classes. Point arrows towards abstractions.

    - No variable should hold a reference to a concrete class
    - no class should derive from a concrete class
    - No method should override an implemented (overridden) method of any of its base classes.

7. The Principle of Least Knowledge: Only talk to your friends.

    We should only invoke methods that belong to:
    
    - The Object itself
    - Objects passed in as a parameter to the method
    - Objects the method CREATES or instantiates
    - Composed (HAS-A) components of the Object
    
    Do NOT invoke methods from:
    
    - Objects RETURNED from calling other methods. This is what we call the Train Wreck. Eg:
    
        ```
        this.Zoo.getDuck().quack()
        ```

8. The Hollywood Principle: Don't call us, we'll call you:

    High level components control when and how low-level components are used in computations, somewhat related to the Template Method.

9. Single Responsibility Principle (SRP): A class should have only one reason to change.
