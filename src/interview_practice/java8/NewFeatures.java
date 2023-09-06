package interview_practice.java8;

import java.util.function.BiConsumer;

/**
 * 
 * Q. What is java 8? Main agenda behind the java 8.
 * 
 *    -> Significant reason for introducing java 8 was to introduce Conciseness in the code
 *    -> Java brings in Functional Programming which is enabled by Lambda expression( a powerful tool to create concise code base)
 *    -> If you have ever observed with Python and Scala language,  we can do same things in very less LOC. By mid 20s Java lost a large market due to these language
 *       To prevent further java upgraded itself from only OOPs language to some concepts of Functional Programming to create concise code base. 
 * 
 * Q. What are new feature which got introduced in java 8?
 * 
 *    -> Lambda Expression
 *    -> Steam API
 *    -> Default method in the interface 
 *    -> Static methods
 *    -> Functional Interface
 *    -> Optional
 *    -> Method reference
 *    -> Date API
 *    -> Nashorn, JavaScript Engine
 *    
 * Q. What are the main advantages of using Java 8?
 * 
 *    -> Compact code (Less boiler plate code.)
 *    -> More readable and reusable code
 *    -> More testable code
 *    -> Parallel Operations
 *    
 *    
 * Q. What is lambda expression?
 * 
 *    -> Lambda expression is an anonymous function( without name, return type, and access modifier and having one lambda (->) symbol
 *    -> Eg:
 *         Normal Programming technique
 *         
 *         public void add(int a, int b){
 *         		System.out.println(a+b);
 *         }
 *         
 *         Equivalent Lambda expression
 *         
 *         (a,b)-> System.out.println(a+b);
 *         
 * Q. What is Functional Interfaces?
 * 
 *    -> Functional Interfaces are those interfaces which can have only one abstract method
 *    -> It can have any number of static method and default method. No restriction on that
 *    -> There are many function interface already present in java, such as Comparable, Runnable. 
 *    
 * Q. How lambda expression and functional interfaces are related?
 * 
 *    -> Functional Interface is used to provide reference to lambda expression. This is the relation
 *    -> Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
 *    -> (s1,s2) -> s1.compareTo(s2) : This is lambda expression
 *    -> Comparator<String> c : This is Functional Interface
 *    -> Thus you can see, To call lambda expression we need Functional Interfaces. 
 *    
 * Q. Can you create your own Functional Interfaces?
 * 
 * 	  -> Yes, we can create our own Functional Interface.
 *	  -> As we know Functional Interface is an interface with Exactly One Single Abstract method and can have multiple
 *	     static or default methods.
 *    -> To create own function interface. You can do following steps:
 *    		-> Create an interface 
 *     		-> Annotate that with @FunctionalInterface 
 *     		-> Define exactly one abstract method
 *     		-> There is no restriction on number of static and default methods defined in such and interface.
 *    -> Java can implicitly identify functional interface but still you can annotate it with @FunctionInterface
 *    	 It just give you security that in case if you by mistake  add 2 abstract methods then Compiler throw compile-time-error
 *    
 * Q. What is Method Reference in Java 8?
 * 
 *    -> Method reference is replacement of lambda expressions. It is used to refer method of Functional Interface to an existing method. Mainly
 *    	 it used for code reusability
 *    -> Functional Interface's Abstract method can be mapped to specific existing method using double colon operator(::). This is method reference.
 *    -> Hence Method Reference is an alternative to Lambda Expression.
 *    
 *    -> Whenever we have existing implementation of Abstract method of our Functional interface then we can go for method reference. If no such 
 *       method like testImplementation() is available then go for lambda expression.
 *       
 *       
 * Q. What are defaults methods?
 * 
 *    -> Default method is a way for adding new methods to the interface without affecting the implementing classes. Hence with this new feature
 *       java people defended many compile time errors that may arise due to unimplemented methods of interface.
 *    -> Eg: interface Animal{
 *    
 *    			void legs();
 *    
 *    			default void eyes(){
 *    				System.out.println("Two eyes");
 *    			}
 *    	
 *    		 }
 *    -> The use of these default method is "Backward Compatibility" which means if JDK modifies any interface (without default method) then
 *       the classes which implement this Interface will break
 *       
 *    -> On the other hand, if you add the default method in an interface then you will be able to provide the default implementation. This won't
 *       affect the implementing classes.
 *       
 *       
 * Q. Is it necessary to Override default method?
 * 
 *    -> Default methods have dummy implementations.
 *    -> Implementing classes if ok with dummy implementation then use dummy Implementation of default method.
 *    -> If not satisfied then they can override and provide their own implementation.
 *    
 * Q. Is default keyword is one of the access modifier?
 * 
 * 	  -> Default is not the access modifier like public or protected or private.
 * 	  -> For default access modifier we don't use any keyword.
 *    -> Hence Default keyword was only used in classes till 1.8 version for switch case only but never in interface.
 *    -> Now its used for default methods in interface to provide default implementation for all implementing classes to use.
 * 
 * 
 * Q. How to override default methods?
 * 
 * 	  -> You can override default method by keeping same method and signature(name+argument)
 *    -> Removing default keyword because in class default keyword used in switch case to denote default case if no previous case match. So
 *       can't use default keyword in class
 *    -> Adding public as access modifier bcz in java 8. By default interfaces all methods are public so you can't reduce visibility of 
 *       overridden default method.
 *       
 *    -> Giving your own implementation.
 * 
 * 
 * Q. Can you use hashCode() default implementation in Interface?
 * 
 *   -> You cann't give your default implementation of hash code () method in interface for all implementing classes to use.
 *   -> We are not allowed to override Object class's method as default methods in interface else will get compile time error.
 *   -> All implementing classes by default has access to all methods of object class.
 * 
 * 
 * Q. How default method in Interface cope up with Diamond problem?
 * 
 *    -> Diamond problem of default methods of interface:
 *    	 	-> If 2 implemented interfaces contains same default methods then that's the diamond problem.
 *    -> In java, in such situation, the code will not compile.
 *    -> Solution to diamond problem:
 *    		-> Use InterfaceName.super.methodName();
 * 
 * 
 * Q. Why Static methods were introduced in java 8?
 * 
 *    -> Only reason for introducing static methods in interface is that you can call those methods
 *       with just interface name. No need to create class and then its object.
 *       
 *    -> Since Interface can never contain:
 *    		-> Constructors.
 *    		-> Static blocks
 *    		-> Nothings costly in terms of memory and performance
 *    -> Hence we don't need to create object and hence if you have everything static, then for 
 *       interface rather than class
 *    -> ( You have this flexibility only after java 8, before that you need to create class )
 * 
 * Q. Are Static method available in implementing classes by default?
 * 
 *    -> Static methods are not available to implementing classes.
 *    -> They are not default methods. They are static.
 *    
 *    -> Hence you can call these method using Interface name explicitly from the implementing
 *       classes as implementing classes won't have access to these methods directly.( This is the
 *       disadvantage of static methods of interface that its not available to implementing classes)
 *       
 *    
 *    
 *       
 *       
 *	
 */




public class NewFeatures implements InterfaceDemo, DiamondProblemInterface1, DiamondProblemInterface2{
	
	@Override
	public void printInfoWithoutDefault() {
		// TODO Auto-generated method stub
		
	}
	
	public void printInfo()
	{
		DiamondProblemInterface1.super.printInfo();
		
		System.out.println("Override Diamond Problem Interface One");
	}
	
	public void printInfoWithDefault() {
		System.out.println("Overrride default printInfo method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lambda expression with BiConsumer
		BiConsumer<Integer, Integer> biConsumer = (a,b) -> {
			System.out.println(a+b);
			System.out.println(a*b);
		};
		
		biConsumer.accept(3, 4);
		
//		FuncationalInterfaceDemo f = () -> System.out.println("Implementation of SAM");
//		f.singleAbstractMethod();
		
		
		FuncationalInterfaceDemo f = Test::testImplementation;
		f.singleAbstractMethod();
		
		f.addTo();
		
		
		NewFeatures nf = new NewFeatures();
		
		nf.printInfoWithDefault();
		
		// solve diamond problem with default implementation in interface
		
		nf.printInfo();
		

	}
	
	
	

	

}


class Test{
	
	public static void testImplementation() {
		System.out.println("Test Implementation for abstract method");
	}
	
}
