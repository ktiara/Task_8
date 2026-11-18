# Task 8: Packages and Interfaces in Java

University laboratory assignment for Computer Science at Vistula University. This project demonstrates the usage of **abstract classes, inheritance, packages, and interfaces** (including abstract methods, default methods, and static methods) in Java.

## Task Requirements

1. **Animal Hierarchy:** Utilizes an abstract class `Animal` with a multi-level class hierarchy (including subclasses such as `Dog`, `Pigeon`, and `Blowfish`).
2. **Interfaces:**
   * `AnimalBehavior`: Contains an abstract method `sleep()`. Implemented by lower-level classes (`Dog`, `Pigeon`, `Blowfish`). Called via an array of `AnimalBehavior` references.
   * `AnimalMove`: Contains a `default` method `move()`. Implemented by all classes, with customized behavior for dogs, pigeons, and fish (e.g., *Dog run*, *Pigeon fly*), invoked via a `foreach` loop on an `Animal` array.
   * `AnimalName`: Contains a `static` method `name(String name)`, invoked in combination with `getName()` from the `Animal` array elements.
3. **Main Execution:** Demonstrates object instantiation, array manipulation, and method calls on specific array indices.


  
