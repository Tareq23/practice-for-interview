package interview_practice.design_pattern.creational.prototype;

public class PrototypePatternMainClass {

	public static void main(String[] args) {
		
		ProfessionCache.loadProfessionCache();
		
		Profession doctorProfession = ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctorProfession);
		
		Profession engineerProfession = ProfessionCache.getCloneNewProfession(2);
		System.out.println(engineerProfession);
		
		Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacherProfession);
		
		Profession doctorProfession1 = ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctorProfession1);
		
		Profession doctorProfession2 = ProfessionCache.getCloneNewProfession(1);
		doctorProfession2.print();

	}

}
