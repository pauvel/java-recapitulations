# Java Data Types Summary

This document provides an overview of Java's data types, both primitive and non-primitive, along with their properties, usage, and examples.

## Primitive Data Types
Java offers 8 primitive data types:

- **byte**: 1 byte, range -128 to 127
  - **Example**: `byte b = 100;`

- **short**: 2 bytes, range -32,768 to 32,767
  - **Example**: `short s = 20000;`

- **int**: 4 bytes, range -2^31 to 2^31-1
  - **Example**: `int i = 100000;`

- **long**: 8 bytes, range -2^63 to 2^63-1
  - **Example**: `long l = 10000000000L;`

- **float**: 4 bytes, single-precision floating-point
  - **Example**: `float f = 3.14f;`

- **double**: 8 bytes, double-precision floating-point
  - **Example**: `double d = 3.141592653589793;`

- **char**: 2 bytes, stores a single character
  - **Example**: `char c = 'A';`

- **boolean**: Represents true/false values
  - **Example**: `boolean isJavaFun = true;`

## Non-Primitive Data Types
These types store more complex data structures:

- **String**: A sequence of characters
  - **Example**: `String greeting = "Hello, World!";`

- **Arrays**: A collection of elements of the same type
  - **Example**: `int[] numbers = {1, 2, 3, 4};`

- **Classes and Interfaces**: Custom data types with fields and methods
  - **Example**: 
  ```java
  class Person {
      String name = "John";
      int age = 30;
  }