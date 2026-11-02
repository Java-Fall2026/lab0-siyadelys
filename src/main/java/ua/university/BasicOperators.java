package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] is the sum and [1] is the average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        double sum = (long) a + b + c;
        return new double[]{sum, sum / 3.0};
    }

    /**
     * Returns the maximum of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of the three values
     */
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    /**
     * Returns the corresponding grade letter for a given numeric score.
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if score is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        if (score >= 50) return 'E';
        return 'F';
    }

    /**
     * Returns the English name of the day of the week for a number 1-7,
     * where 1 is Monday and 7 is Sunday.
     *
     * @param day the day number, from 1 (Monday) to 7 (Sunday)
     * @return the English name of the day
     * @throws IllegalArgumentException if day is less than 1 or greater than 7
     */
    public static String dayOfWeek(int day) {
        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
        };
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("Day must be between 1 and 7");
        }
        return days[day - 1];
    }

    /**
     * Returns an array counting down from n to 1.
     *
     * @param n the starting value
     * @return an array holding n, n-1, ..., 1; an empty array if n is 0
     * @throws IllegalArgumentException if n is negative
     */
    public static int[] countdown(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

    /**
     * Returns the factorial of n.
     *
     * @param n the number whose factorial is calculated
     * @return the factorial of n; 1 when n is 0
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Returns a reversed copy of the array.
     *
     * @param arr the array to reverse; must not be null
     * @return a new array holding the elements in reverse order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if arr is null
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    /**
     * Returns the sum of all elements in a 2D array (matrix).
     *
     * @param matrix the matrix to sum; must not be null
     * @return the sum of every element; 0 for a matrix with no elements
     * @throws IllegalArgumentException if matrix is null
     */
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     *
     * @param s the string to check; must not be null
     * @return true if s reads the same forwards and backwards
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Returns the minimum and maximum of an array.
     *
     * @param arr the array to scan; must not be null or empty
     * @return double-element array where [0] is the minimum and [1] is the maximum
     * @throws IllegalArgumentException if arr is null or empty
     */
    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return new int[]{min, max};
    }

    /**
     * Returns an n x n multiplication table.
     *
     * @param n the size of the table
     * @return a matrix of n rows by n columns
     * @throws IllegalArgumentException if n is less than 1
     */
    public static int[][] multiplicationTable(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be at least 1");
        }
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = (i + 1) * (j + 1);
            }
        }
        return result;
    }

    /**
     * Returns all even numbers from 2 up to and including n.
     *
     * @param n the upper bound, inclusive
     * @return an array of even numbers in ascending order;
     *         an empty array if n is less than 2
     */
    public static int[] evenNumbersUpToN(int n) {
        if (n < 2) {
            return new int[0];
        }
        int count = n / 2;
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = 2 * (i + 1);
        }
        return result;
    }

    /**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return true if n is prime; false for any n less than 2
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= n / divisor; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     *
     * @param s the string to scan; must not be null
     * @return the number of vowels found
     * @throws IllegalArgumentException if s is null
     */
    public static int countVowels(String s) {
        if (s == null) {
            throw new IllegalArgumentException("String must not be null");
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the first n Fibonacci numbers, starting with 0 and 1.
     *
     * @param n how many numbers to return
     * @return an array holding 0, 1, 1, 2, 3, ... of length n;
     *         an empty array if n is 0
     * @throws IllegalArgumentException if n is negative
     */
    public static int[] fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        int[] result = new int[n];
        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     *
     * @param matrix a rectangular matrix; must not be null
     * @return a new matrix where rows and columns are swapped;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if matrix is null
     */
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Matrix must not be null");
        }
        if (matrix.length == 0) {
            return new int[0][0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     *
     * @param arr the array to sort; must not be null
     * @return a new array holding the elements in ascending order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if arr is null
     */
    public static int[] sortArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] result = arr.clone();
        java.util.Arrays.sort(result);
        return result;
    }
}
