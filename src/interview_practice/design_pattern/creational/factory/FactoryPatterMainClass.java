package interview_practice.design_pattern.creational.factory;


public class FactoryPatterMainClass {
	
	public static void main(String[] args) {
		ProfessionFactory professionFactory = new ProfessionFactory();
		
		Profession doc = professionFactory.getProfession("doctor");
		
		doc.print();
		
		doc = professionFactory.getProfession("Teacher");
		doc.print();
	}

}
