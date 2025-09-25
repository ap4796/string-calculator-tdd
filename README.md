# String Calculator TDD

This is the **Incubyte String Calculator Kata** implemented using **Test Driven Development (TDD)** in Java with Maven and JUnit 5.

---

## Problem Statement
Create a simple string calculator with a method:

int add(String numbers)

### Rules:
- Empty string → returns `0`
- Single number → returns the number
- Two numbers separated by comma → returns sum
- Allow any amount of numbers
- Allow newline (`\n`) as delimiter
- Support custom delimiter: `"//[delimiter]\n[numbers]"`
- Throw exception for negative numbers, listing all of them

---

## Project Structure
string-calculator-tdd/
 ├── src/main/java/com/incubyte/calculator/Calculator.java
 ├── src/test/java/com/incubyte/calculator/CalculatorTest.java
 ├── pom.xml

---

## How to Run
From project root:

mvn clean test

This will compile the code and run all JUnit tests.

---

## TDD Steps Followed
1. Add failing test  
2. Write minimal code to pass the test  
3. Refactor  
4. Commit after each step

---

## Test Cases Covered
- Empty string  
- Single number  
- Two comma-separated numbers  
- Multiple numbers  
- Newline delimiter  
- Custom delimiter  
- Negative numbers

---

## Author
Adanankhan Pathan
