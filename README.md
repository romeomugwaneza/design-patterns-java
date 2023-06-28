# Design Patterns

## Definition

Used to design reusable and extensible OO software.
Solves common design problems.
How to structure classes and how the classes should collaborate.

A Design Pattern: Elegant solution to repeating problems.

### 3 Categories:

1. Creational: Different ways to create objects.
2. Structural: Relationships between objects.
3. Behavioral: Interaction/Communication between the objects.

## Behavioral Design Patterns

### 1. Momento Pattern

Used to implement undo mechanism.
It uses 3 classes:

1. Originator: Creates and restores states.
2. Caretaker: Holds history of states(can use a List).
3. Momento: Contains current state.

### 2. State Pattern

Example of a drawing canvas that changes depending on the tool selected from the palette in software like PhotoShop.

### 3. Command Pattern

Encapsulates a request in a single object. Here are some advantages:

- Objects can be logged. Added to a list(or any other DS)
- Command objects can be used to undo/redo functionality.
- Command objects can be replayed.
