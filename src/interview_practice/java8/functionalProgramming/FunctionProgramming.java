package interview_practice.java8.functionalProgramming;


/**
 *  Q. What are Predicates?
 *     -> Predicate is a predefined functional interface (Having only 1 abstract method)
 *     -> The only abstract method of predicate is test(T t), it accepts one input and return boolean value.
 *     -> Whenever we want to check some boolean condition then you can go for predicates.
 *     
 *  Q. Type parameters and return types of predicates?
 *  
 *     -> Input to predicate can be anything like 
 *     		->Predicate<String>
 *          ->Predicate<Integer>
 *          ->Predicate<Employee>
 *     -> Hence only one type argument is required which is input type in predicate.
 *     -> Return type is not required as its always Boolean only
 *     
 *   Q. Advantage of Predicates?
 *   
 *      -> Code reusability
 *      -> If you have same conditions being used 100 times in a program then you can write once and just use 100 times with checkLength.test(different
 *         string to be tested)
 *      -> Conditional checks are hold by conditional interface
 *      
 *   Q. What is predicate joining?
 *   
 *      -> You can combine predicates in serial predicate.
 *      -> Three ways to join:
 *      	-> And
 *          -> Or
 *          -> Negate
 *   Q. Eg: If you want to check 2 conditions:
 *      -> To check length of string > 5
 *      -> To check if length is even.
 *      
 *   
 *   Q. What are Functions?
 *   
 *      -> Function is also predefined interface (Having only 1 abstract method)
 *      -> The only abstract method of function is apply(T t)
 *             -> R apply(T t)
 *      -> Given some input perform some operation on input and then produce / return result (not necessary a boolean value)
 *      -> It takes one input and return one output
 *      -> In predicate we take one input and return always return boolean value
 *      -> In function return type is not fixed hence we declare both input type and return type.
 *      
 *      
 *  Q. What is the difference between Predicate and Function?
 *  
 *     # Predicate
 *     ->  It has return type as Boolean. It used for conditional check.
 *     ->  It is written in the form of predicate<T> which accepts a single argument.
 *     ->  It contains test() method.
 *     
 *     # Function
 *     -> It has return type as Object. It used for perform operations and return result.
 *     -> It is written in the form of Function<T, R> which also accepts in single argument but return any type of object denoted by R.
 *     -> It contains apply() method.
 * 
 * 
 *  Q. What is Functional Chaining?
 *     
 *     -> We can combine / chain multiple functions together with andThen
 *     -> There are two ways two combine function
 *     		-> f1.andThen(f2).apply(Input) // first f1 done then f2
 *     		-> f1.compose(f2).apply(Input) // first f2 done then f1
 *          -> Multiple function can be chained together like: f1.andThen(f2).andThen(f3).andThen(f4).apply(Input);
 *          
 *          
 *  Q. What is Consumer Functional Interface?
 *  
 *     -> Predicate<T> takes 1 input and returns boolean.
 *     -> Function<T,R> takes 1 input and 1 return type produced after performing some operation on that input.
 *     -> Consumer<T> -> it will consume Item. Consumers never return anything (never supply), they just consume.
 *     -> EG: take any object and save it details in Database and don't return anything
 *     
 *      Interface Consumer<T>{
 *      	public void accept(T t);
 *      }
 *      
 *  Q. What is Consumer Chaining?
 *  
 *     -> We can combine / chain multiple consumers together with andThen.
 *     -> There is only one ways to combine consumers:
 *     			-> c1.andThen(c2).apply(INPUT) // first c1, then c2
 *     -> No compose in Consumer
 * 	   -> Multiple consumer can be chained together like:
 * 			c1.andThen(c2).andThen(c3).andThen(c4).andThen(c5).apply(INPUT)
 * 
 *     
 *  Q. What is Supplier Functional Interface?
 *  
 *     -> Supplier<R> -> It will just supply required objects and will not take any input
 *     -> Its always going to supply never consume / take any input.
 *     -> EG: always supply me current date:
 *     			Interface Supplier<R>{
 *     				public R get();
 *     			}
 * 	   -> No chaining as no input is given to this. Only it gives u output.
 * 
 *  Q. Advantage of Supplier?
 *  
 *     -> Write once, use anywhere
 *     -> code reusability
 *     
 *  Q. Use of Biconsumer, Bifunction, Bipredicate and why no Bisupplier?
 *  
 *     -> Till now we had:
 *        -> Predicate<T> test() -> return boolean.
 *        -> Function<T,R> apply() -> return anything.
 *        -> Consumer<T> accept() -> return nothing.
 *        -> Supplier<T> get() -> return anything.
 *        
 *     -> What if we need 2 arguments for operation?
 *        -> Then we need Bi xyz Functional Interface.
 *        
 *     -> There is no input in supplier so no 1 or 2 input arguments needed. Hence no Bisupplier.
 *     
 *     
 *  Q. If we want of operate on 3 arguments then triPredicate?
 *  
 *     -> There are no TriPredicate or TriFunction
 *     -> No QuadPredicate or QuadFunction
 *     -> Java 8 has in-built Functional Interface that can take only 1 or 2 arguments no more. 
 * 
 */

public class FunctionProgramming {
	
	public static void main(String[] args)
	{
		PredicateInterface predInter = new PredicateInterface();
		
//		predInter.practice("Hello world");
//		predInter.practice("Helloworld");
		
		
		FunctionInterface fi = new FunctionInterface();
		fi.practice("Tarequl");
		fi.funcationChain(2);
		
		
		ConsumerInterface ci = new ConsumerInterface();
		ci.practice("It's take one input but never return any output");
		
		BipredicateInterface bipi = new BipredicateInterface();
		bipi.practice();
		
		BiFunctionInterface bfi = new BiFunctionInterface();
		bfi.practice();
	}

}
