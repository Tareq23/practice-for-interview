package interview_practice.design_pattern.creational.builder;

public class Director {
	
	private Builder builder;
	
	
	public Director(Builder builderType)
	{
		this.builder = builderType;
	}
	
	public Home getComplexObjectOfHome() {
		return this.builder.getComplexObject();
	}
	
	public void manageRequiredHomeContruction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}
	

}
