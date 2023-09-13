package interview_practice.java8.parallelStream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 *  Q. What is a Parallel Stream?
 *     -> Java parallel stream comes into picture after 1.8
 *     -> Its meant to utilize multiple cores of processor
 *     -> Till now our java code has 1 stream of processor where it executes sequentially
 *     -> But when we use parallel streams, we divide code into multiple streams that executes parallely, on separate cores and final result is the
 *        outcome of individual cores outcomes combined
 *        
 *        
 *  # Java 8 Stream
 *  
 *    -> Collectors
 *    	 	-> toList(), toMap(), toSet()
 *    		-> joining(), counting()
 *    		-> summarizingDouble/Long/Int
 *     		-> averagingDouble/Long/Int
 *     		-> groupingBy()/ partitioningBy()
 *    -> Stream Builder
 *          -> accept()
 *          -> add()
 *          -> build()
 *    -> Stream Support
 *    		-> Long Stream
 *    		-> Double Stream
 *    		-> Int Stream
 *    -> Terminal Operations
 *    	    -> forEach
 *    	    -> toArray
 *          -> reduce
 *          -> collect
 *          -> min, max, count
 *          -> anyMatch, allMatch, allMatch
 *          -> findFirst(), findAny()
 *    -> Intermediate Operations
 *          -> filter
 *          -> peek
 *          -> map
 *          -> distinct
 *          -> sorted
 *          -> limit
 *          -> skip
 *    -> Short Circuit Operators
 *          -> terminal operator
 *              -> findFirst()
 *              -> findAny()
 *              -> anyMatch(), allMatch(), nonMatch()
 *			-> Intermediate Operator
 *				-> limit 
 * 
 *   Q. What is an Intermediate Operations
 *     
 *      -> The operations which return another stream as a result are called intermediate operations. V imp part, they are lazy.
 *      -> EG: filter, map, sorted, skip, distinct, limit
 *      
 *   Q. What is terminal operation?
 *     
 *      -> The operation which return non-stream values like primitive or object or collection or return nothing are called terminal operations.
 *      -> You can chain multiple intermediate operations and none of them will do anything until you invoke a terminal operation. At that time
 *         all of the intermediate operations that you invoked earlier will be invoked along with the terminal operation 
 *         
 *   Q. Terminal vs Intermediate operations
 *   
 *      # Terminal Operation
 *      -> They return non-stream value
 *      -> They cann't be chained together
 *      -> Pipeline of operations can have maximum one terminal operation, that too at the end
 *      -> Terminal operation are eagerly loaded
 *      -> They produce end result
 *       
 *      # Intermediate Operation
 *      -> They return stream
 *      -> They can be chained together to form a pipeline of operations.
 *      -> pipeline of operation may contain any number of intermediate operations
 *      -> Intermediate operations are lazily loaded
 *      -> They don't produce end result
 *      
 *   Q. What is peak?
 *   
 *      -> Stream peak method is an intermediate operation.
 *      -> it takes a consumer object as an input.
 *      -> it returns stream consisting of the elements of current stream.
 *      -> It additionally perform the provided action on each element as element
 *      
 *  	-> peak() exists mainly to support debugging, where we want to see the elements as they flow past a certain point in a pipeline
 *  	-> It is similar to map, but it takes consumer object and perform some action on object and return nothing, But map takes a function
 *         argument hence apply operation on each element and return the stream having modified elements.
 *         
 *  
 *   Q. What is reduce?
 *      
 *      -> Stream reduce() combine the elements of a stream and return a single value.
 *      -> Reduce operation applies a binary operator to each element in the stream where the first argument to the operator is the return value 
 *         of the previous application and second argument is the current stream element.
 *   
 *     
 */


public class ParallelStreamDemo {
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"abc");
		Employee e2 = new Employee(2,"abc1");
		Employee e3 = new Employee(3,"abc2");
		Employee e4 = new Employee(4,"abc3");
		Employee e5 = new Employee(5,"abc4");
		Employee e6 = new Employee(6,"abc5");
		
		
		List<Employee> empList = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		
		intList.stream().filter(e -> e%2 ==0 ).peek(e -> System.out.println("peak: "+e)).map( e -> e+e).filter( e -> e>5).map(e -> e*e).forEach( e -> System.out.print(e+", "));
		
		System.out.println("\n"+intList.stream().filter(e -> e%2 ==0 ).map( e -> e+e).filter( e -> e>5).map(e -> e*e).count());
		
		
		empList.stream().filter(e-> e.getId() % 2 == 1).map(e -> {
			e.printName();
			return e.getName();
		}).forEach(e -> System.out.println("At last: "+e));
		
//		System.out.println("Sum: "+intList.stream().reduce((a,b)-> a+b));
		System.out.println("Sum: "+intList.stream().reduce((a,b) -> a+b).get());
		
		
	}

}

class Employee{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public void printName()
	{
		System.out.println("In Emp class: "+name);
	}
	
}
