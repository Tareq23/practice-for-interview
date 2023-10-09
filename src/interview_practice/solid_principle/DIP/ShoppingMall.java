package interview_practice.solid_principle.DIP;

public class ShoppingMall {
	
//	private DebitCard debitCard;
//	
//	private CreditCard creditCard;
	
	private BankCard bankCard;
	
//	public ShoppingMall(CreditCard creditCard) {
//		this.bankCard = creditCard;
//	}
	
//	public ShoppingMall(DebitCard debitCard) {
//		this.bankCard = debitCard;
//	}
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args)
	{
//		DebitCard card = new DebitCard();
//		CreditCard card = new CreditCard();
		
		BankCard card;
		ShoppingMall mall;
		card = new DebitCard();
		mall =  new ShoppingMall(card);
		mall.doPurchaseSomething(3000);
		
		card = new CreditCard();
		mall = new ShoppingMall(card);
		mall.doPurchaseSomething(5000);
		
	}

}
