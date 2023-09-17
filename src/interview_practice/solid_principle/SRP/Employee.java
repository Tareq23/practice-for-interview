package interview_practice.solid_principle.SRP;


/**
 *  SRP: Single Responsibility Principle
 * 
 * @author DELL
 *
 */


public class Employee {
	
	private int id;
	private String name;
	
	private Address address;
	
	
	public Employee(int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address = address;
	}
	
	
	public void printMe()
	{
		System.out.println("Employee id: "+this.id+" , Employee Name: "+this.name);
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address.toString() + "]";
	}
	
	
	
	
	// private String first line of address
	// private String second line of address
	// private String State
	// private String city

}
