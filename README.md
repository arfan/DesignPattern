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

## Adapter Pattern

In software engineering, the adapter pattern is a software design pattern (also known as wrapper, 
an alternative naming shared with the decorator pattern) that allows the interface of an existing 
class to be used as another interface.

## Facade Pattern

The facade pattern (also spelled façade) is a software-design pattern commonly used in object-
oriented programming. Analogous to a facade in architecture, a facade is an object that serves as 
a front-facing interface masking more complex underlying or structural code.

## Proxy Pattern

In computer programming, the proxy pattern is a software design pattern. A proxy, in its most 
general form, is a class functioning as an interface to something else. The proxy could interface 
to anything: a network connection, a large object in memory, a file, or some other resource that 
is expensive or impossible to duplicate.

## Bridge Pattern

The bridge pattern is a design pattern used in software engineering that is meant to "decouple an 
abstraction from its implementation so that the two can vary independently", introduced by the 
Gang of Four. The bridge uses encapsulation, aggregation, and can use inheritance to separate 
responsibilities into different classes.

## Template Method Pattern

In object-oriented programming, the template method is one of the behavioral design patterns 
identified by Gamma et al. in the book Design Patterns. The template method is a method in 
a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms 
of a number of high-level steps. These steps are themselves implemented by additional helper 
methods in the same class as the template method.

## Composite Pattern

In software engineering, the composite pattern is a partitioning design pattern. The composite 
pattern describes a group of objects that is treated the same way as a single instance of the same 
type of object. The intent of a composite is to "compose" objects into tree structures to represent 
part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects 
and compositions uniformly.
