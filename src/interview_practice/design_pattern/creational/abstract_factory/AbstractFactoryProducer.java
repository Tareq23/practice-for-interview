package interview_practice.design_pattern.creational.abstract_factory;

public class AbstractFactoryProducer {
	
	
	public static AbstractFactory getProfession(boolean isTrainee)
	{
		if(isTrainee) {
			return new TraineeProfessionAbstractFactory();
		}
		else {
			return new ProfessionAbstractFactory();
		}
	}

}
