package interview_practice.solid_principle.OCP;

public class TraineeEmployee extends Employee{
	
	private String traineePlace;

	public TraineeEmployee(int id, String name, String traineePlace) {
		
		super(id, name);
		this.traineePlace = traineePlace;
	}
	
	public void printMe() {
		
		System.out.println("Employee id: "+super.getId()+" , Employee Name: "+super.getName()+" , Trainee Place: "+this.traineePlace);
		
	}
	
	

	
	
	

}
