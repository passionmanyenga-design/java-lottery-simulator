# Lottery Number Generator and Simulator 

## Project Overview

This project is a Java based lottery simulator that allows a user to select lottery numbers and compare them against a randomly generated draw.

The program lets the user choose six numbers within a range they define. It then generates six random numbers for the lottery draw and compares the generated results with the user's selections to determine how many numbers match.

The application also allows the user to specify the number of weeks they want to participate for and calculates winnings based on the results of the draws.

The project demonstrates how Java can be used to build an interactive console-based application that combines user input, collections, random number generation, loops and conditional logic.

## How the Program Works

### 1. Collecting User Input

The program begins by asking the user to enter the required lottery information.

This includes selecting six numbers and specifying the range from which the numbers should be generated. The user can also choose how many weeks they want to participate in the simulation.

The input determines how the subsequent lottery draws are carried out.

<img width="800" height="375" alt="lotto" src="https://github.com/user-attachments/assets/219a3103-8a44-46d6-8da1-c38a93095164" />

### 2. Validating and Managing Selections

The program uses the Java `Set` interface to manage selected numbers.

A Set is useful for this task because it stores unique elements, preventing duplicate numbers from being treated as separate selections.

This helps ensure that the user's six chosen numbers represent six distinct values.

### 3. Generating Random Lottery Numbers

The program generates six random numbers within the user-defined range.

Random number generation allows the application to simulate a lottery draw without requiring manually entered winning numbers.

The generated numbers are then stored so that they can be compared with the user's selections.

### 4. Comparing the Numbers

After the draw, the program compares the user's selected numbers with the randomly generated numbers.

It identifies matching values and determines how many of the user's selections appeared in the draw.

Using a Set makes it possible to perform membership checks and identify matching values.

### 5. Simulating Multiple Weeks

If the user chooses to participate for multiple weeks, the program repeats the drawing and comparison process.

Each week involves generating a new set of random numbers and checking the results against the user's selections.

This allows the application to simulate repeated lottery participation rather than carrying out only one draw.

### 6. Calculating Winnings

The program uses the matching results to determine the winnings associated with each draw.

The results are then used to calculate the overall outcome across the selected number of weeks.
<img width="900" height="430" alt="lottery" src="https://github.com/user-attachments/assets/051fab34-a596-46e3-b9ac-82290d91418e" />

## Key Features

- **User-selected numbers:** Allows users to choose six lottery numbers.
- **Custom number range:** Lets users define the range used for the lottery draw.
- **Unique number management:** Uses the Java Set interface to manage distinct selections.
- **Random number generation:** Generates six numbers for each simulated draw.
- **Number matching:** Compares the user's selections against the generated results.
- **Multiple-week simulation:** Repeats the lottery process for the number of weeks selected by the user.
- **Winnings calculation:** Determines winnings based on the number-matching results.
- **Interactive console interface:** Guides users through the required inputs and displays the results.

## Technologies Used

- Java
- Set interface
- Collections
- Random number generation
- Loops and conditional statements
- User input handling

## Skills Demonstrated

Java programming, object-oriented programming concepts, data structures, collections, algorithmic thinking, control flow, problem-solving and application development.

## Running the Project

Compile the Java source files and run the class containing the `main()` method. The exact commands depend on the filenames and class structure in the repository.

For a single-file project where the main class is named `Main`, the commands would be:

```bash
javac Main.java
java Main
```

## Author

**Passion Manyenga**  
BSc Data Science and AI | University of Dundee
