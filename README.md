# Design Patterns in Java📐

This repository contains various design patterns implemented in Java. The goal is to provide a comprehensive collection of design patterns that can be used as a reference or learning resource for software developers.

## Implemented Design Patterns

The repository includes the following design patterns which have been implemented:

### Creational Patterns

1. **Factory Method**
   - Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. This pattern is used to decouple the client code from the object creation code.

2. **Abstract Factory**
   - Provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern is useful when there are multiple types of objects to be created, and the client code needs to be decoupled from the specific classes used.

### Structural Patterns

1. **Adapter**
   - Allows incompatible interfaces to work together by converting the interface of a class into another interface expected by the clients. This pattern is useful when integrating with legacy code or third-party libraries that have different interfaces.

2. **Proxy**
   - Provides a surrogate or placeholder for another object to control access to it. This pattern is useful for implementing lazy initialization, access control, logging, and other similar functionalities.

### Behavioral Patterns

1. **Observer**
   - Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is useful for implementing event handling and notification systems.

2. **Strategy**
   - Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it. This pattern is useful for implementing various algorithms or behaviors that can be selected at runtime.
