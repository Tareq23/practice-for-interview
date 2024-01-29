package interview_practice.bitmanipulation;



/**

	# Bitwise operator:
		
		-> Bitwise OR operator (|)
		-> Bitwise AND operator (&)
		-> Bitwise XOR operator (^)
		-> Bitwise NOT operator (~)
		-> Left Shift operator (<<)
		-> Right Shift operator (>>)


	# Left Shift
	
		-> a << n means (a * 2 raised to the power of n)[a * (2 ^ n)]

	# Right Shift
	
		-> a >> n means a/(2^n)


	problem:
		1. given an array where every element have duplicates except one element
		   as like ( 1,1,2,2,3,4,4). you job to find the single element from this
		   array
		2. 2's complement
		3. Check a number it is odd or even
		4. you have been given two number a and b. Now you have to find out the
		   minimum number of bits required to make a is equal to b.
		   
		5. Count the number of bits from given number.
		6. Swap two number using X-OR
		7. Extract the i'th bit of a number
		8. change the i'th bit of a number
		9. clearing the i'th bit of a number
		
		https://www.youtube.com/watch?v=aId6iahUGLI&list=PLX0iyO9CrCF1-4je7G0JMSr_50I0J2K3Z&index=3

 */





public class IntroBitManipulation {

	
	public static int findSingleElement(int[] ar)
	{
		int res = 0;
		
		for(int i = 0; i < ar.length; i++)
		{
			res ^= ar[i];
		}
		return res;
	}
	
	public static int findTwoElements(int[] ar)
	{
		int res = 0;
		
		for(int i = 0; i < ar.length; i++)
		{
			res ^= ar[i];
		}
		return res;
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		int negativeValue = -7;
		System.out.println("Bits of "+negativeValue+": "+Integer.toBinaryString(negativeValue));
		
		
		int[] arrayForSingleElement = {2,2,3,3,4,4,7,8,8,12,12,56,56};
		System.out.println("Single Element: "+findSingleElement(arrayForSingleElement));
		
		
		
		int[] arrayForTwoElements = {2,2,3,3,4,4,7,8,8,12,56,56};		
		System.out.println("Two Element: "+findSingleElement(arrayForTwoElements));
	}
	

}
