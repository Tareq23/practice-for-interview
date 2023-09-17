package interview_practice.solid_principle;

import interview_practice.solid_principle.OpenClosedPrinciple.TraineeEmployee;
import interview_practice.solid_principle.SRP.Address;
import interview_practice.solid_principle.SRP.Employee;

/**
 * 
 * 1. Why we need solid Principle?
 * 
 *    The broad goal of the SOLID principles is to reduce dependencies so that engineers change one area of software without impacting others. Additionally,
 *    they're intended to make designs easier to understand, maintain, and extend. Ultimately, using these design principles make designs easier to 
 *    understand, maintain, and extend. Ultimately, using these design principles makes it easier for software engineers to avoid issues and to build adaptive,
 *    effective, and agile software.
 *    
 *    They lead to better code for readability, maintainability, design patterns, and testability.
 *    
 *    
 * 2. What are solid Principles?
 * 
 * 	  The following five concepts make up our SOLID principles
 * 
 *    -> Single Responsibility
 *    -> Open / Closed
 *    -> Liskov Substitution
 *    -> Interface Segregation
 *    -> Dependency Inversion
 * 
 * 3. What is Single Responsibility Principle?
 * 
 *    -> It states that, "One class should have one and only one responsibility"
 *    -> Which specifically means - we should write, change and maintain a class only for one purpose
 *    -> Change Class only when you need to change state of one particular object or instance
 *    
 *    -> Example: POJOS follow SRP.
 *    		   
 *       		-> Suppose we have Employee and Address Class, If we want to change the state of Employee then we do not need to 
 *                 modify the class Account and vice-versa.
 *       		-> If you world have merged both as single POJO including Employee
 *       
 *    -> Worst Design - which don't follow SRP -> Hitting Database in POJO of Employee class. That's why we have service layer, 
 *       DAP layer and Entities separated.
 *   ----------------------------
 *   
 *   Now the question will come, Have you ever seen the worst single responsibility principle violation, so the answer is yes
 *   
 *   when I merge my entity with my service that is the worst part.
 *   Example: In simple crud application we have Employee entity this is complete separate and we have Employee Service this is completely 
 *   separate. We should have one repository and this repository is responsible for data manipulations like saving and deletion. In this Employee service
 *   we are just using the business logics, so this is the way how you should segregate your task into your employee entity your service and your
 *   repository. Entity is responsible only for data transferring, Service is responsible for business logic, Repository is responsible for DAO 
 *   handling.
 *   
 *   What is not write? you should not write any kind of saving logic or business logic into Entity class. It will be the worst violation of SRP.
 *   
 *       
 * 4. Why is Single Responsibility Principle is Important?
 * 
 *    - In Real world, Requirement changes and so does your code implementation to cater the changing requirement.
 *    - The more responsibilities your class has, the more often you need to change it. To prevent frequent changes to same class,
 *    - Testing is easier - With a single responsibility, the class will have fewer tes cases
 *    - Easier to Understand
 *    - Less functionality also means fewer dependencies to other classes.
 *    - So best practice says: Use layers in your application and break God classes into smaller classes or modules.
 *    
 *    
 * ----------------------------------------------------------- OPEN / CLOSED -------------------------------------------------------------------
 * 
 * 1. What is Open / Closed principle?
 *  
 *  - It states that "Software components should be open for extension, but closed for modification"
 *  - The term "Open for extension" means that we can extend and include extra functionalities in our code without altering or affecting our existing implementation.
 *  - The term "Closed for modification" means that after we add the extra functionality, we should not modify the existing implementation.
 *  - In real world, You must have noticed that you change something to cater a new requirement and some other functionality breaks because of your change. To prevent
 *    that we have this principle in hand.
 *    
 * 2. How to implement Open/Closed Principle?
 *  
 *  - The application classes should be designed in such a way that whenever fellow developers want to change the flow of control in specific conditions in application,
 *    all they need to extend the class and override some functions and that's it.
 *    
 *  - Example - created a pojo employee with id, name. now new functionality comes which says add Training location. your constructor will fail for employees who
 *    didn't do training. better extend employee class, name it Traineed employee then add constructor.
 * 
 *    
 *       
 *      
 *    
 * 
 * 
 * 
 * 
 *
 */

public class SolidPrincipleDemo {

	public static void main(String[] args) {
		
		
		// SRP 
		
		Employee emp = new Employee(1,"Md Tarequl Islam", new Address("Dhaka-1209","Bhola-Daulatkhan","Bangladesh","Dhaka"));
//		System.out.println(emp.toString());
		
		// Open / Closed principle
		
		interview_practice.solid_principle.OpenClosedPrinciple.Employee emp1 = new interview_practice.solid_principle.OpenClosedPrinciple.Employee(1,"Tareq");
		
		emp1.printMe();
		
		TraineeEmployee tEmp = new TraineeEmployee(2, "Tareq", "Online");
		
		tEmp.printMe();
		
		

	}

}
