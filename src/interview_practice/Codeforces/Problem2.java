package interview_practice.Codeforces;

public class Problem2 {

	
	public static boolean isPrime(int num) {
		
		for(int i  = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean productOfTwoPrimes(int num)
	{
		int primeCounter = 0;
		
		for(int i = 2; i <= (num >> 1); i++)
		{
			if(isPrime(i)) {
				while(num % i == 0) {
					num /= i;
					primeCounter++;
				}
				
				if(primeCounter > 2) return false;
			}
		}
		
		if(isPrime(num) && primeCounter == 1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int num1 = 61;
		int num2 = 91;
		
		System.out.println(num1+" is prime: "+isPrime(num1));
		System.out.println(num2+" is product of two primes: "+productOfTwoPrimes(num2));
		
	}

}
