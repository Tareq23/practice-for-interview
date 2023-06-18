package interview_practice.design_pattern.creational.abstract_factory;

public class TraineeProfessionAbstractFactory extends AbstractFactory{

	@Override
	Profession getProfession(String typeOfProfession) {
		
		if(typeOfProfession.equalsIgnoreCase("Engineer"))
		{
			return new TraineeEngineer();
		}
		else if(typeOfProfession.equalsIgnoreCase("Teacher")){
			return new TraineeTeacher();
		}
		
		
		return null;
	}

}
