package com.task.pondit;

import java.util.Scanner;

/*
 
 
 1
Replace Spaces with Underscores:

Problem: Create a Java program that replaces all spaces in a string with underscores.
Input: "Java String Exercises"
Output: "Java_String_Exercises"

2
Count Vowels and Consonants:

Problem: Write a Java method to count the number of vowels and consonants in a given string.
Input: "Java String"
Output: Vowels: 3, Consonants: 7

3
Problem: Write a Java program to reverse a given string.
Input: "Hello World"
Output: "dlroW olleH"
Check Palindrome:

4
Problem: Create a Java function to check if a string is a palindrome (a string that reads the same forwards and backwards).
Input: "racecar"
Output: true

5
Extract Digits from a String:

Problem: Create a Java function that extracts all digits from a given string.
Input: "Java 1234 String 56789"
Output: "123456789"

Bonus:
Problem: Find number of occurrence of word “bangla” in a string
Input: “Bangla amar jibon anonado bangla praner sur”
Output: 2
 
 */


public class String5Question {
	
	
	public static boolean checkPalindrome(String str)
	{
		StringBuffer reverseString = new StringBuffer(str);
		String revString = reverseString.reverse().toString();
		
		return revString.equals(str);
	}
	

	public static void main(String[] args) {
		
		
		
		
		String str = "Java String Exercises";
		String str1 = str.replace(' ', '_');
		System.out.println("replace string: "+str1);
		
		
		str = "Java String";

		str = str.toLowerCase();
		int vow = 0, con = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') continue;
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vow++;
			}
			else {
				con++;
			}
		}
		
		System.out.println("vowel: "+vow+"; consonants: "+con);
		
		str = "Hello World";
		
		StringBuffer stringBuf = new StringBuffer(str);
		String reversedStr = stringBuf.reverse().toString();
		
		System.out.println("Original String: "+str+"\nReversed String: "+reversedStr);
		System.out.println("IsPalindrome: "+str.equals(reversedStr));
		
		str = "racecar";
		
		System.out.println(checkPalindrome(str));
		
		str = "Java 1234 String 56789";
		
		StringBuffer strBuf = new StringBuffer("");
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				strBuf.append(str.charAt(i));
			}
		}
		System.out.println(strBuf);
		
		str = "Bangla amar jibon anonado bangla praner sur".toLowerCase();
		
		

	}

}
