package interview_practice.collection.queue;

public class Customer  implements Comparable<Customer>{
	private Integer orderId;
	private Double amount;
	private String customerName;
	
	public Customer(Integer orderId, Double amount, String customerName) {
		this.orderId = orderId;
		this.amount = amount;
		this.customerName = customerName;
	}
	
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	@Override
	public String toString() {
		return "Customer [orderId=" + orderId + ", amount=" + amount + ", customerName=" + customerName + "]";
	}



	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
//		return o.orderId > this.orderId ? 1 : -1;
		return Integer.compare(this.orderId, o.orderId);
	}
	
	
}
