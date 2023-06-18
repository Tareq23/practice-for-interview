package interview_practice.design_pattern.creational.abstract_factory;

public class ProfessionAbstractFactory extends AbstractFactory{

	@Override
	Profession getProfession(String typeOfProfession) {


		if(typeOfProfession.equalsIgnoreCase("Engineer"))
		{
			return new Engineer();
		}
		else if(typeOfProfession.equalsIgnoreCase("Teacher")){
			return new Teacher();
		}
		
		
		return null;
	}
	
	

}
