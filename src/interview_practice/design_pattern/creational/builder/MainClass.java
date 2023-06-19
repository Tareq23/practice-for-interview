package interview_practice.design_pattern.creational.builder;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		
		// create object of required home builder
		Builder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
		
		Builder floodResistantBuilder = new FloodResistantBuilder();
		
		Director director = new Director(earthQuakeResistantBuilder);
		
		Director director2 = new Director(floodResistantBuilder);
		
		director.manageRequiredHomeContruction();
		director2.manageRequiredHomeContruction();
		
		Home homeConstructedAtTheEnd = director.getComplexObjectOfHome();
		
		System.out.println(homeConstructedAtTheEnd.floor);
		System.out.println(homeConstructedAtTheEnd);
	}

}
