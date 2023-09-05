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
 */




public class NewFeatures {

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
		

	}

}


class Test{
	
	public static void testImplementation() {
		System.out.println("Test Implementation for abstract method");
	}
	
}
