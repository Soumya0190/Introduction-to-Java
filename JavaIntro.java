import java.util.*;

/**
 * @author Soumya Sharma
 * UCI Net ID: 16463723
 */
public class Lab1 {

    public static void main(String[] args) {
        // You can add test cases here to verify each method.
    }

    double circleArea(int radius) {
        return Math.PI * radius * radius;
    }

    double findSurfaceArea(int radius, int height) {
        double circle = circleArea(radius);
        return (2 * circle) + (Math.PI * radius * 2 * height);
    }

    boolean isPerfectCube(int num) {
        int cubeRoot = (int) Math.round(Math.cbrt(num));
        return cubeRoot * cubeRoot * cubeRoot == num;
    }

    boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    int greatestCommonFactor(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    boolean isEquals(double x, double y, int places) {
        double factor = Math.pow(10, places);
        return Math.round(x * factor) == Math.round(y * factor);
    }

    double findDegrees(int fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    boolean isSecure(String password) {
        if (password.length() < 8 || password.contains(" ") || password.contains("\t") || password.contains("\n") || password.contains("\r")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (!Character.isLetterOrDigit(ch)) hasSymbol = true;
        }

        return hasUpper && hasLower && hasDigit && hasSymbol;
    }

    boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int len = word.length();
        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    int find(String word, String sub) {
        int count = 0;
        int index = 0;
        while ((index = word.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    int convertToDecimal(String roman) {
        Map<Character, Integer> romanValues = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );

        int total = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = romanValues.getOrDefault(roman.charAt(i), 0);
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }
        return total;
    }
}
