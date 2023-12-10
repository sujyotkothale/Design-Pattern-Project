# Tic-Tac-Toe Game Project

This repository contains a Java-based Tic-Tac-Toe game implementing various design patterns to enhance its functionality and structure.

## Design Patterns Implemented

### Singleton
- Utilized for the game launcher to ensure only one instance is accessible throughout the gameplay session, managing resources efficiently.

### Factory
- Used to create different sizes of the game board dynamically (3x3, 4x4, 5x5), providing varying complexity levels for gameplay.

### Proxy
- Employed to validate player names, ensuring uniqueness and preventing players from having identical names during the gaming session.

### Template
- Defines the structure of the game welcome screen, facilitating easy customization and extension of game screens while maintaining a consistent gameplay framework.

## Features

- Java Swing-based Graphical User Interface (GUI) for a user-friendly gaming experience.
- Customizable colors for two players.
- Option to select different backgrounds.
- Supports various sizes of Tic-Tac-Toe grids including 3x3, 4x4, and 5x5.

## Getting Started

To run the game locally:

1. Clone the repository:

```bash
git clone https://github.com/your-username/tictactoe.git
```
## Running the Java Code

To compile and run the Java code:

1. Use an Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans.
   - Open the project in your preferred IDE.
   - Compile and run the main Java file to start the game.

OR

2. Use command line tools:
   - Navigate to the project directory containing the Java source files.
   - Compile the code using `javac` command:
     ```bash
     javac Main.java
     ```
   - Run the compiled code using `java` command:
     ```bash
     java Main
     ```
3. Follow the on-screen instructions to play the game.

## How to Contribute

Contributions to enhance the game features, improve code quality, or fix bugs are welcome! Feel free to fork this repository, make changes, and create a pull request.

## License

This project is licensed under the MIT License, allowing free use and modification of the codebase.


