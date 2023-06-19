package interview_practice.design_pattern.creational.builder;

public class FloodResistantBuilder implements Builder{
	
	
	private Home floodResistantHome = new Home();

	@Override
	public void buildFloor() {
		floodResistantHome.floor = "10 feets above ground level floor";
	}

	@Override
	public void buildWalls() {
		floodResistantHome.walls = "water resistant walls";
	}

	@Override
	public void buildTerrace() {
		floodResistantHome.terrace = "water leakage resistant terrace";
	}

	@Override
	public Home getComplexObject() {
		// TODO Auto-generated method stub
		return this.floodResistantHome;
	}
	
	
	

}
