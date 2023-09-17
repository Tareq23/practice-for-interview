package interview_practice.solid_principle.SRP;


/**
 *  SRP: Single Responsibility Principle
 * 
 * @author DELL
 *
 */


public class Address {
	
	 private String first;
	 private String second;
	 private String state;
	 private String city;
	 
	 
	 
	 
	public Address(String first, String second, String state, String city) {
		super();
		this.first = first;
		this.second = second;
		this.state = state;
		this.city = city;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [first=" + first + ", second=" + second + ", state=" + state + ", city=" + city + "]";
	}



	public String getFirst() {
		return first;
	}
	public String getSecond() {
		return second;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 
	 
	 
	
	

}
