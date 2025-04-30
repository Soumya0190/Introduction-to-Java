# Introduction-to-Java
https://canvas.eee.uci.edu/courses/21534/assignments/401803

---

Sure! Here's how to explain your **Java project** using the **STAR method** (Situation, Task, Action, Result), ideal for interviews or resume bullets:

---

### ✅ **S – Situation**
You were tasked with building a utility class in Java to demonstrate your understanding of basic programming constructs, control flow, conditionals, and object-oriented principles in a hands-on way.

> **Example**:  
> *As part of a coursework project (or self-study initiative), I was required to implement a collection of mathematical and utility methods in Java that would solve a variety of real-world problems like temperature conversion, number theory, and string pattern detection.*

---

### ✅ **T – Task**
Your objective was to write a Java class (`Lab1`) containing multiple static methods to perform operations such as:

- Calculating area and surface area.
- Checking if a number is a perfect cube or perfect number.
- Computing GCF (Greatest Common Factor).
- Comparing floating-point numbers up to `n` decimal places.
- Validating password strength.
- Checking if a string is a palindrome.
- Converting Roman numerals to decimals.

> **Example**:  
> *The goal was to ensure each method was modular, correct, and could handle edge cases. Additionally, I had to create a main method to test and demonstrate each functionality.*

---

### ✅ **A – Action**
- Broke down requirements into separate methods, each solving a specific problem.
- Used Java constructs like `Math`, `StringBuilder`, and control structures.
- Implemented string manipulation, loops, and conditionals.
- Designed a `main` method to test the methods with various inputs.
- Debugged and refined edge cases (e.g., handling invalid Roman numerals, case-insensitive palindrome checks).
- Verified method correctness by comparing results with known outputs.

> **Example**:  
> *I wrote methods like `isPerfectCube(int n)` and `convertToDecimal(String roman)` using efficient logic and tested them using a series of test cases. I also wrote helper functions where needed, such as `getValue(char c)` for Roman numeral parsing.*

---

### ✅ **R – Result**
- Successfully created and tested over 10 modular, reusable methods.
- Demonstrated strong problem-solving skills and foundational knowledge in Java.
- Improved code robustness by testing corner cases (e.g., zero, negative numbers, invalid strings).
- Built a reusable Java library class that can be expanded or integrated into larger systems.

> **Example**:  
> *The project helped solidify my grasp of Java fundamentals. It also demonstrated my ability to write clean, maintainable, and testable code—skills that I’ve since applied in more complex development projects.*

---

Would you like me to turn this into a resume bullet or mock interview answer?

---

Thanks for sharing the full project details. Here's how you can get started on this assignment:

---

## ✅ **File & Class Setup**
Create a file called `Lab1.java` and define a class named `Lab1`.

```java
public class Lab1 {
    // All your 12 methods will go here
}
```

---

## ✏️ **Implementation Summary for Each Method**

Below is a breakdown of how each method should work:

1. **circleArea(int radius):**  
   Formula: π * r² → `Math.PI * radius * radius`

2. **findSurfaceArea(int radius, int height):**  
   Surface area of cylinder = `2 * π * r² + 2 * π * r * h`  
   Reuse `circleArea(radius)`

3. **isPerfectCube(int num):**  
   Compute cube root → check if cube root rounded³ == num  
   Handle negative numbers.

4. **isPerfectNumber(int num):**  
   Sum all divisors excluding `num` and check if sum == num.

5. **greatestCommonFactor(int x, int y):**  
   Use Euclidean algorithm.

6. **isEquals(double x, double y, int places):**  
   Round both numbers to `places` decimal points and compare.

7. **findDegrees(int fahrenheit):**  
   Celsius = `(fahrenheit - 32) * 5 / 9.0`

8. **isSecure(String password):**  
   Check all constraints using `Character` methods and regex.

9. **isPalindrome(String word):**  
   Normalize to lowercase, reverse, and compare.

10. **find(String word, String sub):**  
    Count non-overlapping occurrences using a loop.

11. **convertToDecimal(String roman):**  
    Use a map of Roman numeral values and process the string.

12. **convertToBinary(int num):**  
    Use `Integer.toBinaryString(num)`.

---

To **run and test your Java code**, you'll follow these steps:

---

## ✅ 1. **Save the Code**

Save your corrected Java file with the **same name as the public class**, which is:

```plaintext
Lab1.java
```

---

## ✅ 2. **Write a Main Method for Testing**

You can test your methods by adding some sample calls in the `main` method.

Example:

```java
public static void main(String[] args) {
    Lab1 lab = new Lab1();

    System.out.println("Circle Area (r=5): " + lab.circleArea(5));
    System.out.println("Surface Area (r=3, h=10): " + lab.findSurfaceArea(3, 10));
    System.out.println("Is 27 a perfect cube? " + lab.isPerfectCube(27));
    System.out.println("Is 28 a perfect number? " + lab.isPerfectNumber(28));
    System.out.println("GCF of 24 and 36: " + lab.greatestCommonFactor(24, 36));
    System.out.println("Are 1.2345 and 1.2344 equal to 3 decimal places? " + lab.isEquals(1.2345, 1.2344, 3));
    System.out.println("Fahrenheit 98 -> Celsius: " + lab.findDegrees(98));
    System.out.println("Is password 'Strong!9' secure? " + lab.isSecure("Strong!9"));
    System.out.println("Is 'Racecar' a palindrome? " + lab.isPalindrome("Racecar"));
    System.out.println("Occurrences of 'ana' in 'banana': " + lab.find("banana", "ana"));
    System.out.println("Roman 'MCMXCIV' to decimal: " + lab.convertToDecimal("MCMXCIV"));
}
```

---

## ✅ 3. **Compile the Code**

In your terminal or command prompt, navigate to the folder where `Lab1.java` is saved.

Then compile it:

```bash
javac Lab1.java
```

If successful, this will produce a `Lab1.class` file.

---

## ✅ 4. **Run the Code**

Run the compiled class:

```bash
java Lab1
```

You should see output printed to the console for each test case.

---

## ✅ 5. **(Optional) Use JUnit for Formal Testing**

If you want to write proper unit tests:

1. Add JUnit to your classpath.
2. Create a new file like `Lab1Test.java`.
3. Write test methods using `@Test`.

Let me know if you want help writing those JUnit tests.


