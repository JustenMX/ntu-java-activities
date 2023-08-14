1. Create an interface called `Building` containing the following abstract methods:

- Methods:
  - addFloor(int floors)
  - describe

2. Create a `School` class using the `Building` interface and implement the methods and properties:

- Properties: name, numberOfFloors, address
- Methods:
  - addFloor - adds the inputted number of floors
  - describe - prints the name and address

3. Create a `Person` class with the following properties and methods:

- Properties: name, age, gender
- Methods:
  - greet - asks for a name and prints "Nice to meet you, < name >"
  - introduce - prints "Hello, my name is < name >"
  - haveBirthday - increase the age by 1
- Constructors
- Getters/Setters

4. Create a `Teacher` class from `Person` with additional properties and methods:

- Properties: subject
- Methods:
  - introduce - prints "Hello, my name is < name > and I will be teaching you < subject >."
- Constructors, getters, and setters

5. Create a `Student` class from `Person` with additional properties and methods:

- Properties: yrLevel
- Methods:
  - introduce - prints "Hello, my name is < name > and I am a < yrLevel > student."
- Constructors, getters, and setters

6. Create a `Main` class and in the class, create the following:

- 1 School
- 1 Teacher
- 2 Students

7. In `Main` class, use the methods of `School`, `Teacher`, and `Student` objects
