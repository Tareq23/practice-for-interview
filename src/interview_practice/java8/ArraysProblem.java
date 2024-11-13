package interview_practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysProblem {
	
	
	public static void fetchSecondElement(int nums[]) {
		
		
		int secondElement = Arrays.stream(nums)
								   .distinct()
								   .sorted()
								   
								   .skip(1)
								   .findFirst()
								   .orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest element"));
		System.out.println("Second maximum element: "+secondElement);
		
		
	}
	
	
	public static void findCommonElement(int[] array1, int[] array2) {
		
	 List<Integer> commonElement =	Arrays.stream(array1)
			 				.filter(number -> Arrays.stream(array2).anyMatch(array2Number -> array2Number == number))
			 				.boxed()
			 				.collect(Collectors.toList());
	 
	 System.out.println("Common element of given arrays: "+commonElement);
		
	}
	
	public static void reverseArrayInPlace(int[] array)
	{
		IntStream.range(0, array.length/2).forEach(i -> {
			int temp = array[i];
			array[i] = array[array.length-i-1];
			array[array.length-i-1] = temp;
		});
		
		System.out.println("Reverse Array in Place: "+Arrays.toString(array));
	}
	
	
	public static void fetchLongestLengthOfString(String[] strings) {
		
		
		
//		int maxLength = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
		int maxLength = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
		
		System.out.println("Maximum length of strings: "+maxLength);
		
	}
	
	
	public static void main(String[] args)
	{
		/*
		 * Given an array of integers, write a Java 8 program to find the second smallest element
		 * 
		 * */
		
		int[] nums = {5,2,8,4,3,3,1,6};
//		int[] nums = {5};
		
		fetchSecondElement(nums);
		
		
		/*
		 * Given two array of integers, write a java 8 program to find the common elements between them.
		 */
		
		int[] ar1 = {3,2,4,5,1,7};
		int[] ar2 = {2,3,4,1,7,8};
		
		findCommonElement(ar1,ar2);
		
		/*
		 * Write a java 8 program to reverse an array of integers in-place.
		 */
		
		int[] numbers = {2,1,7,3,4,9,5};
		
		reverseArrayInPlace(numbers);
		
		/*
		 * Given an array of String, write a java 8 program to find the length of the  longest string.
		 */
		
		String strings[] = {"Apple","Banana","Avocado","Apricot","Grapes"};
		
		fetchLongestLengthOfString(strings);
		
		/*
		 * Write a Java 8 program to remove duplicates from array of strings while preserving the original order:
		 */
		
		
		
		/*
		 * Write a java 8 program to Given an array of Integers, find the product of all the elements except the current element.
		 */
		
		
		/*
		 * Write a java 8 program to split an array of strings into two arrays, one containing string with even lengths and another one containing
		 * string with odd lengths 
		 */
		
		List<Department> deptList;
		
		
	}

}

class Department{
	Long id;
	String name;
	
	public Department() {}
	public Department(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
