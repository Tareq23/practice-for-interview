package interview_practice.java8;

import java.util.List;
import java.util.stream.Collectors;

/*
 *  Java 8 Statistics Example: Get Count, Min Max, Sum, and the average of numbers
 * 
 *  Given Emp DB, fetch max aged employee, Min aged employee, find average age of all emps working in an organization etc.
 *  
 *  stream().mapToInt(x->x).summaryStatistics();
 *  
 *  Since this statistics operation is numeric in nature, it's essential to call the mapToInt() method
 *  It provide us utility method like getMin(), getMax(), getSum(), and getAverage()
 * 
 */



class Employee{
	
	private long id;
	private String name;
	private int age;
	
	
	
	
	
	
	public Employee() {
		
	}
	public Employee(long id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class StatisticsExample {

	public static void main(String[] args) {
		
		List<Employee> empList = List.of(
				new Employee(1,"Rimon",27), 
				new Employee(2,"Riya",30),
				new Employee(3,"Joe", 45),
				new Employee(4,"David", 32)
				);
		
		List<Integer> ages = empList.stream().map(e -> e.getAge()).sorted().collect(Collectors.toList());
		System.out.println("Ages: "+ages);
		
        Integer maxAge = ages.stream().mapToInt(e -> e).summaryStatistics().getMax();
        Integer minAge = ages.stream().mapToInt(e -> e).summaryStatistics().getMin();
        Double avgAge = ages.stream().mapToInt(e -> e).summaryStatistics().getAverage();
        
        System.out.println("Max Age: "+maxAge);
        System.out.println("Min Age: "+minAge);
        System.out.println("Average Age: "+avgAge);
        
        System.out.println("Employee List Length: "+empList.size());

        
        // find second and third element
        
        List<Integer> slicedAges = ages.stream().skip(1).limit(2).collect(Collectors.toList()); // it is a short circuit operation.
        
        System.out.println("Second and Third Element: "+slicedAges);
        
        
        // convert String to uppercase and join them with coma
        
        List<String> names = empList.stream().map(e -> e.getName()).collect(Collectors.toList());
        String allName = names.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(", "));
        
        System.out.println("All Name with uppercase and delimiter: "+allName);
        
        
        
        /*
         * Find the first element of a Stream in Java
         * 
         * Using stream.reduce() method. Reduce methods work on two elements in the stream and returns the element as per the required condition.
         * Therefore this method can be used to reduce the stream so that it contains only the first element,
         * 
         * To get the first element, you can use reduce() method to ignore the next element, repeatedly till there is no next element
         * 
         * Stream.reduce((first,next)->first);
         * 
         * This reduces the set of elements in a stream to a single element, which is first
         * 
         * 
         * 
         */
        
        String firstEmpName = names.stream().reduce((first,next) -> first).orElse("There is no first employee name");
//        String firstEmpName = names.stream().reduce((first,next) -> first.concat(next)).orElse("There is no first employee name");
//        String firstEmpName = names.stream().reduce(String::concat).orElse("There is no first employee name");
        
        System.out.println("First employee name: "+firstEmpName);
	}

}
