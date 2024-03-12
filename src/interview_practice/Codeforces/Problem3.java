package interview_practice.Codeforces;

public class Problem3 {

	public static float callCharge(int start, int duration)
	{
		float[] rates = {1.5f, 1f, 2.5f, 0.5f};
		
		int index = 0;
		float res = 0f;
		if(start >= 1 && start <= 15) {
			res = (15 - start) * rates[0];
			duration -= (15 - start);
			index = 1;
		}
		else if(start >= 16 && start <= 30) {
			res = (30 - start) * rates[1];
			duration -= (30 - start);
			index = 2;
		}
		else if(start >= 31 && start <= 45) {
			res = (45 - start) * rates[2];
			duration -= (45 - start);
			index = 3;
		}
		else {
			res = (60 - start) * rates[3];
			duration -= (60 - start);
			index = 0;
		}
		
		while(duration > 0) {
			if(duration >= 15)
			res += (15 * rates[index]);
			else res += (duration * rates[index]);
			duration -= 15;
			index++;
			if(index > 3) {
				index = 0;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int start = 13, duration = 50;
		
		System.out.println("Call Charge: "+callCharge(start, duration));
		
	}

}
