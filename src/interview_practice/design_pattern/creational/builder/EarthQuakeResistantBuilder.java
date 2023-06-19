package interview_practice.design_pattern.creational.builder;

public class EarthQuakeResistantBuilder implements Builder{
	
	
	private Home earthQuakeResistantHome = new Home();

	@Override
	public void buildFloor() {
		earthQuakeResistantHome.floor = "Wooden floor";
	}

	@Override
	public void buildWalls() {
		earthQuakeResistantHome.walls = "Wooden Walls";
	}

	@Override
	public void buildTerrace() {
		earthQuakeResistantHome.terrace = "Wooden Terrace";
	}

	@Override
	public Home getComplexObject() {
		// TODO Auto-generated method stub
		return this.earthQuakeResistantHome;
	}
	
	

}
