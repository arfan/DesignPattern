# Design Pattern Collection Implementation

## Strategy Pattern

In computer programming, the strategy pattern (also known as the policy pattern)
is a behavioral software design pattern that enables selecting an algorithm at runtime.
Instead of implementing a single algorithm directly, code receives run-time instructions
as to which in a family of algorithms to use.

## Observer Pattern

The observer pattern is a software design pattern in which an object, called the subject, 
maintains a list of its dependents, called observers, and notifies them automatically of 
any state changes, usually by calling one of their methods.

## Decorator Pattern

In object-oriented programming, the decorator pattern is a design pattern that allows 
behavior to be added to an individual object, dynamically, without affecting the behavior 
of other objects from the same class.

## Factory Method Pattern

In class-based programming, the factory method pattern is a creational pattern that uses 
factory methods to deal with the problem of creating objects without having to specify the 
exact class of the object that will be created. This is done by creating objects by calling 
a factory method—either specified in an interface and implemented by child classes, or 
implemented in a base class and optionally overridden by derived classes—rather than by 
calling a constructor.


## Abstract Factory Pattern

The abstract factory pattern provides a way to encapsulate a group of individual factories
that have a common theme without specifying their concrete classes. In normal usage, the 
client software creates a concrete implementation of the abstract factory and then uses the 
generic interface of the factory to create the concrete objects that are part of the theme.
The client doesn't know (or care) which concrete objects it gets from each of these internal 
factories, since it uses only the generic interfaces of their products. This pattern 
separates the details of implementation of a set of objects from their general usage and 
relies on object composition, as object creation is implemented in methods exposed in the 
factory interface.

## Singleton Pattern

In software engineering, the singleton pattern is a software design pattern that restricts 
the instantiation of a class to one "single" instance. This is useful when exactly one object 
is needed to coordinate actions across the system. The term comes from the mathematical concept 
of a singleton.

## Command Pattern

In object-oriented programming, the command pattern is a behavioral design pattern in which an 
object is used to encapsulate all information needed to perform an action or trigger an event at 
a later time. This information includes the method name, the object that owns the method and 
values for the method parameters.
