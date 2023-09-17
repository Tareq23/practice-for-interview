package interview_practice.solid_principle.OpenClosedPrinciple;



public class Employee {
	
	private int id;
	private String name;
	
	
	
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	
	public void printMe()
	{
		System.out.println("Employee id: "+this.id+" , Employee Name: "+this.name);
	}


	

}
