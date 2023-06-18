package interview_practice.design_pattern.creational.abstract_factory;

public class AbstractFactoryPatternMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Here getProfession parameter true means trainee, false means not trainee
		 * */
		
		
//		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
		
		Profession engineer = abstractFactory.getProfession("engineer");
		
		engineer.print();

	}

}
