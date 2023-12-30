package com.task.pondit;



/*
 
 
 
1. Sum of Array Elements: Write a program to find the sum of all elements in an array.

2. Largest Element in Array: Find and print the largest element in an array.

3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)

4. Reverse an Array: Reverse the elements of an array.

5. Factorial Calculation: Write a program to calculate the factorial of a given number.*** + recursive solution.

6. Palindrome Check: Check if a given string is a palindrome. (use char string)

7. Prime Number Check: Determine whether a given number is prime.

8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.**** + recursive solution.

9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)

10. Binary Search: Implement binary search for a sorted array. 

11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)

12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)

13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)

14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)

15. Calculate Average: Calculate the average of elements in an array.

16. Leap Year Check: Determine whether a given year is a leap year.

17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)

18. String Reversal: Reverse a given string without using built-in functions. apple, elppa

19. Armstrong Number: Check if a number is an Armstrong number.

20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
 
21. Calculate the simple interest for given principal, rate of interest, and time.

22. Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.

23. Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.

24. Write a program to find the second largest number in a given array.

25. Given a string containing both letters and numbers, find the sum of all the numbers in the string.
 
 
 * */

public class Solution {

	public static void main(String[] args) {

		int[] arrayForSum = { 2, 4, 62, 14, 5 };
		System.out.println("1) Sum of Array Elements: " + sumOfAllElements(arrayForSum));
		System.out.println("2) Largest Element in Array: " + largestElementOfArray(arrayForSum));

		int num = 23;
		System.out.println("3) Even or Odd Numbers: " + evenOrOdd(num));

		int[] reverseArray = reverseArray(arrayForSum);
		System.out.print("4) Reverse an Array: ");
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
		System.out.println();

		System.out.println("5) Factorial Calculation: " + factorialCalculation(5));

//		char[] palindromeCharArray = {'a','a','b','a','a'};
		char[] palindromeCharArray = { 'a', 'b', 'c', 'e', 'b', 'a' };
		System.out.println("6) Is above character array palindrome?: " + palindromeCheck(palindromeCharArray));

		int primeCheckNumber = 42;
		System.out.println("7) Is " + primeCheckNumber + " prime: " + primeCheck(primeCheckNumber));

		int fibonacciNumber = 20;
		System.out.print("8) Fibonacci Series: ");
		fibonacciSeries(fibonacciNumber);
		System.out.println();

		int linearSearchValue = 23;
		int[] linearSearchArray = { 43, 24, 5, 3, 12, 34, 23, 67 };
		System.out.println("9) Is " + linearSearchValue + " exists in above linear search array: "
				+ linearSearch(linearSearchArray, linearSearchValue));

		int binarySearchValue = 35;
		int[] binarySearchArray = { 3, 5, 12, 23, 24, 34, 43, 67 };
		System.out.println("10) Is " + binarySearchValue + " exists in above binary search array: "
				+ binarySearch(binarySearchArray, binarySearchValue));

		int[] duplicateValueArray = { 13, 15, 12, 23, 24, 34, 13, 67 };
		System.out.println("11) Have any duplicate Elements: " + isExistsDuplicateValue(duplicateValueArray));

		String vowelConsonantString = "countvowelandconsonant";
		countVowelAndConsonant(vowelConsonantString);

		multiplicationTable(3);

		int[][] mat1 = { { 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 1 }, { 3, 4, 6, 7, 2 }, { 4, 5, 2, 1, 4 },
				{ 1, 2, 4, 5, 6 } };
		int[][] mat2 = { { 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 1 }, { 3, 4, 6, 7, 2 }, { 4, 5, 2, 1, 4 },
				{ 1, 2, 4, 5, 6 } };

		System.out.println("14) Matrix Addition: ");
		matrixAddition(mat1, mat2);

		int[] averageArray = { 3, 4, 5, 6, 7, 21, 2, 3 };
		System.out.println("15) Average Calculate: " + averageCalculate(averageArray));

		int year = 2098;

		System.out.println("16) Is " + year + " leap year: " + isLeapYear(year));

		System.out.println("17) Pattern: ");
		patternPrint(5);

		String reverseString = "apple";
		System.out.println("18) Reverse of \"" + reverseString + "\" String: " + reverseString(reverseString));

		int armstrong = 407;
		System.out.println("19) Is \""+armstrong+"\" armstrong number: "+armstrongNumber(armstrong));
		
		int[] arrayForMaxMin = { 3, 4, 512, -3, 5 };
		maxMinValue(arrayForMaxMin);
		
		double principal = 2342;
		double rate = 34; 
		double time = 453;
		System.out.println("21) simple interest: "+simpleInterestCalculate(principal, rate, time));
		
		
		double temperature = 34;
		convertCelsiusFahrenheit(temperature);
		
		
		
		char checkChar = 'a';
		System.out.println("23) "+checkChar+" is an Uppercase , lowercase or digit: "+charCheck(checkChar));
		
		int[] array2ndMax = {3,4,52,1,3,5,23, 12, 51};
		System.out.println("24) second largest number: "+find2ndMax(array2ndMax));
		
		String findSumOfNumber = "kjdf3323kj232kj23232343j2323kkj323";
		System.out.println("25) Sum of all the numbers from \""+findSumOfNumber+"\": "+findSumFromStringDigit(findSumOfNumber));
		
	}

	public static int sumOfAllElements(int[] ar) {
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		return sum;
	}

	public static int largestElementOfArray(int[] ar) {
		int max = ar[0];

		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}

	public static String evenOrOdd(int num) {
		if (num % 2 == 0)
			return "Even";

		return "Odd";
	}

	public static int[] reverseArray(int[] num) {
		for (int i = 0; i <= num.length / 2; i++) {
			int temp = num[num.length - 1 - i];
			num[num.length - 1 - i] = num[i];
			num[i] = temp;
		}
		return num;
	}

	public static int factorialCalculation(int num) {
		if (num == 0)
			return 1;

		return num * factorialCalculation(num - 1);
	}

	public static String palindromeCheck(char[] ar) {

		for (int i = 0; i < ar.length / 2; i++) {

			if (ar[i] != ar[ar.length - 1 - i]) {
				return "No";
			}

		}

		return "Yes";
	}

	public static String primeCheck(int num) {
		if (num <= 1)
			return "No";

		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return "No";
		}

		return "Yes";
	}

	public static int fibonacci(int num) {
		if (num <= 0)
			return 0;

		if (num == 1)
			return 1;

		int f1 = fibonacci(num - 1);

		int f2 = fibonacci(num - 2);
		return f1 + f2;
	}

	public static void fibonacciSeries(int num) {

		for (int i = 0; i < num; i++) {

			System.out.print(fibonacci(i) + " ");

		}

	}

	public static boolean linearSearch(int[] num, int value) {

		for (int i = 0; i < num.length; i++) {
			if (num[i] == value)
				return true;
		}

		return false;
	}

	public static boolean binarySearch(int[] num, int value) {
		int left = 0, right = num.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (num[mid] == value) {
				return true;
			}

			if (num[mid] > value) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return false;
	}

	public static boolean isExistsDuplicateValue(int[] num) {
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j])
					return true;
			}

		}

		return false;
	}

	public static void countVowelAndConsonant(String str) {
		int vowelCnt = 0, consonantCnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
				vowelCnt++;
			} else {
				consonantCnt++;
			}
		}

		System.out.println(
				"12) \"" + str + "\" in this string have " + vowelCnt + " vowels and " + consonantCnt + " consonants");
	}

	public static void multiplicationTable(int n) {

		System.out.println("13) Multiplication Table for " + n + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	public static void matrixAddition(int[][] mat1, int[][] mat2) {
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print((mat1[i][j] + mat2[i][j]) + " ");
			}
			System.out.println();
		}
	}

	public static float averageCalculate(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return ((float) sum) / num.length;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void patternPrint(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static String reverseString(String str) {
		char[] charArr = str.toCharArray();

		for (int i = 0; i <= charArr.length / 2; i++) {
			char temp = charArr[i];
			charArr[i] = charArr[charArr.length - i - 1];

			charArr[charArr.length - i - 1] = temp;
		}
		return String.valueOf(charArr);
	}

	public static boolean armstrongNumber(int num) {
		
		int temp = num, sum = 0;
		while(temp>0) {
			
			int reminder = temp % 10;
			
			temp /= 10;
			
			sum += (reminder * reminder * reminder);
		
		}
		
		return sum == num;
	}

	public static void maxMinValue(int[] num) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i])
				max = num[i];

			if (min > num[i])
				min = num[i];
		}

		System.out.println("20) Max: " + max + "; Min: " + min);
	}
	
	public static double simpleInterestCalculate(double principal, double rate, double time)
	{
		return (principal * rate * time)/100;
	}
	
	public static int find2ndMax(int[] ar)
	{
		int firstMax = ar[0];
		int secondMax = Integer.MIN_VALUE;
		
		for(int i = 1; i < ar.length; i++)
		{
			if(ar[i] > firstMax) {
				secondMax = firstMax;
				firstMax = ar[i];
			}
			
			if(ar[i] < firstMax && ar[i] > secondMax) {
				secondMax = ar[i];
			}
		}
		return secondMax;
	}

	
	public static String charCheck(char ch) {
		
		if(ch >= 'a' && ch <= 'z') {
			return "lowercase";
		}
		else if(ch >= 'A' && ch <= 'Z') return "uppercase";
		
		else if(ch >= '0' && ch <= '9')  return "digit";
		
		return "don't know";
		
	}

	public static void convertCelsiusFahrenheit(double temperature) {
		
		double celsius = ((double) 9 / 5 * temperature) + 32;
		double fahrenheit = (double) 5 / 9 * (temperature - 32);
		
		System.out.println("22) "+temperature+" temperature: "+celsius+" celsius and "+fahrenheit+"Fahrenheit");
	}
	
	public static int findSumFromStringDigit(String str)
	{
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				sum += (ch - '0');
			}
		}
		
		return sum;
	}
	
}
