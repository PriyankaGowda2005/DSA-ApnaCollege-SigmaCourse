# Data Structures and Algorithms (DSA) - Java Implementation

**Repository:** [DSA-ApnaCollege-SigmaCourse](https://github.com/PriyankaGowda2005/DSA-ApnaCollege-SigmaCourse)

A comprehensive collection of Data Structures and Algorithms implementations in Java. This repository serves as a learning resource covering fundamental programming concepts, data structures, and algorithmic problem-solving techniques.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Topics Covered](#topics-covered)
- [Running the Code](#running-the-code)
- [Testing](#testing)

## 🎯 Overview

This repository contains well-documented Java implementations of various data structures and algorithms, organized by topic. Each implementation includes detailed comments and examples to help understand the concepts better.

## ✨ Features

- **Comprehensive Coverage**: From basic programming concepts to advanced algorithms
- **Well-Documented**: Each file contains detailed comments explaining the implementation
- **Organized Structure**: Code is organized by topics for easy navigation
- **Test Cases**: Includes JUnit test cases for verification
- **Educational Focus**: Designed for learning and understanding DSA concepts

## 📁 Project Structure

```
DSA-ApnaCollege-SigmaCourse/
│
├── Basic/                    # Fundamental Java concepts
│   ├── hello.java
│   ├── variable.java
│   ├── conditionalStatements.java
│   ├── loops.java
│   ├── functionsInJava.java
│   └── ...
│
├── Arrays/                   # Array operations and problems
│   └── introArray.java
│
├── ArrayList/                # ArrayList implementations and problems
│   ├── arrayListImImplementation.java
│   ├── operationArrayList.java
│   ├── pairSumBruteForce.java
│   ├── pairSum2PointerAppr.java
│   ├── containerWithMostWater.java
│   ├── trappingRainWater.java
│   └── ...
│
├── LinkedList/              # Linked List implementations
│   ├── introLinkedList.java
│   ├── addFirstInLL.java
│   ├── addLastInLL.java
│   ├── reverseLL.java
│   ├── detectingCycleLL.java
│   ├── circularLL.java
│   ├── doublyLL.java
│   └── ...
│
├── Stack/                    # Stack data structure and problems
│   ├── introStack.java
│   ├── stackUsingArrayList.java
│   ├── stackUsingLL.java
│   ├── validParanthese.java
│   ├── nextGreaterElement.java
│   ├── stockSpanProblem.java
│   └── ...
│
├── Queue/                    # Queue data structure
│
├── Backtracking/             # Backtracking algorithms
│   ├── findPermutation.java
│   ├── findSubset.java
│   ├── nQueen.java
│   ├── sudokusolver.java
│   └── ...
│
├── basicSorting/             # Basic sorting algorithms
│   ├── bubbleSort.java
│   ├── selectionSort.java
│   ├── insertionSort.java
│   ├── countingSort.java
│   └── inbuildSort.java
│
├── DivideAndConquer/         # Divide and conquer algorithms
│   ├── mergeSort.java
│   ├── quickSort.java
│   ├── searchInRotatedSortedArray.java
│   ├── majorityElementArray.java
│   ├── inversionCount.java
│   └── ... (with test files)
│
└── lib/                      # External libraries
    └── junit-platform-console-standalone-1.13.0-M3.jar
```

## 🔧 Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Java IDE**: IntelliJ IDEA, Eclipse, or VS Code (recommended)
- **Command Line**: For compiling and running Java files

## 🚀 Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/PriyankaGowda2005/DSA-ApnaCollege-SigmaCourse.git
   cd DSA-ApnaCollege-SigmaCourse
   ```

2. **Verify Java Installation**:
   ```bash
   java -version
   javac -version
   ```

3. **Navigate to a specific topic** and compile/run the Java files:
   ```bash
   cd Basic
   javac hello.java
   java hello
   ```

## 📚 Topics Covered

### 1. Basic Java Programming
- Variables and data types
- Conditional statements
- Loops (for, while, do-while)
- Functions and methods
- Input/Output operations
- Pattern printing

### 2. Arrays
- Array introduction and operations
- Array traversal and manipulation

### 3. ArrayList
- ArrayList implementation
- Basic operations (add, remove, get, set)
- Multi-dimensional ArrayList
- Problem-solving:
  - Pair Sum (Brute Force & Two Pointer Approach)
  - Container with Most Water
  - Trapping Rain Water
  - Finding maximum in ArrayList
  - Sorting and reversing

### 4. Linked List
- Singly Linked List
- Doubly Linked List
- Circular Linked List
- Operations:
  - Insertion (at beginning, end, middle)
  - Deletion
  - Searching (iterative & recursive)
  - Reversing
  - Cycle detection and removal
  - Palindrome checking
  - Merge sort on Linked List
  - Zig-zag pattern

### 5. Stack
- Stack implementation using:
  - ArrayList
  - Linked List
  - Java Collections Framework
- Stack problems:
  - Valid parentheses
  - Duplicate parentheses
  - Next greater element
  - Stock span problem
  - Maximum rectangular area in histogram
  - String reversal using stack
  - Push at bottom of stack

### 6. Queue
- Queue data structure (to be implemented)

### 7. Backtracking
- Permutations
- Subsets
- N-Queens problem
- Sudoku solver
- Grid ways
- Array changes

### 8. Basic Sorting Algorithms
- Bubble Sort (with optimization)
- Selection Sort
- Insertion Sort
- Counting Sort
- Built-in sorting methods

### 9. Divide and Conquer
- Merge Sort
- Quick Sort
- Search in rotated sorted array
- Majority element in array
- Inversion count
- String sorting

## 💻 Running the Code

### Compile a Java file:
```bash
javac <package-name>/<filename>.java
```

### Run a Java file:
```bash
java <package-name>.<classname>
```

### Example:
```bash
# Compile
javac Basic/hello.java

# Run
java Basic.hello
```

**Note**: Make sure to run the commands from the project root directory.

## 🧪 Testing

Some algorithms include JUnit test cases. To run tests:

1. **Using JUnit JAR** (included in `lib/` folder):
   ```bash
   java -cp "lib/junit-platform-console-standalone-1.13.0-M3.jar:." org.junit.platform.console.ConsoleLauncher --class-path . --select-class DivideAndConquer.mergeSortTest
   ```

2. **Using IDE**: Most IDEs support running JUnit tests directly through the test runner.

### Test Files Available:
- `mergeSortTest.java`
- `quickSortTest.java`
- `inversionCountTest.java`
- `inversionOptimizedTest.java`
- `majorityElementArrayTest.java`

## 📝 Code Style

- All code follows Java naming conventions
- Classes are organized in packages
- Detailed comments explain the logic
- Each file focuses on a specific concept or problem

## 🤝 Contributing

Contributions are welcome! If you'd like to add more implementations or improve existing ones:

1. Follow the existing code structure and naming conventions
2. Add comments explaining your implementation
3. Include test cases where applicable
4. Organize files in appropriate directories

## 📄 License

This project is for educational purposes. Feel free to use and modify the code for learning.

## 🎓 Learning Path

Suggested learning order:
1. **Basic** → Start with fundamental Java concepts
2. **Arrays** → Understand array operations
3. **ArrayList** → Learn dynamic arrays
4. **LinkedList** → Master linked data structures
5. **Stack** → Understand LIFO data structure
6. **basicSorting** → Learn sorting fundamentals
7. **DivideAndConquer** → Advanced sorting and algorithms
8. **Backtracking** → Problem-solving techniques

---

**Happy Coding! 🚀**

For questions or suggestions, feel free to open an issue or contribute to the repository.

