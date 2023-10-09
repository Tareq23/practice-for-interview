package interview_practice.solid_principle.DIP;

public class DebitCard implements BankCard{
	
	public void doTransaction(long amount)
	{
		System.out.println("payment using debit card");
	}

}
