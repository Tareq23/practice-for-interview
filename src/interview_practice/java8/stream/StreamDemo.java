package interview_practice.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *  Q. What are Streams?
 *     -> If we want to process bulk objects of collection then go for streams concept.
 *     -> way to operate on collection in java 8 Stream.
 *     -> It is special Iterator class that allows processing collections of object in functional manner.
 *     -> EG: fetch all objects from collection of list whose value is greater than 15.
 *     
 *  Q. Difference between steams(1.8) and java.io.stream?
 *  
 *     -> Why stream are introduced in java 8 if we already had java.io.stream?
 *     		-> Java IO stream is a sequence of characters or binary data which is used to be written to a file or to read data from a file.
 *     		-> while stream java 1.8 is no where related to files, its related to collection of object.
 *     -> java io streams related to file whereas java 8 streams are related to collection object.
 *     -> Hence if we need to perform some operations on collection there we should go for streams.
 *  
 *  Q. Difference between streams (java 1.8) and collection?
 *     -> To represent group of collection as single entity then we should use collection concept.
 *     -> If we want to perform operation on bulk objects in collection then we should go for Streams.
 *     
 *  Q. Steps to create and process stream
 *  
 *     -> We can get Stream object by:
 *     		
 *     		-> Stream s = collectionObject.stream();
 *     		-> Once we get stream object we can process the object collection 
 *          -> Processing of steam consists of 2 steps / stage
 *          		-> Configuration of stream
 *          		-> Processing that configuration
 *          
 *     -> Configuration can be done by / Configuration of Stream
 *     		-> Map
 *     		-> Filter
 *     
 *     -> Processing that Configuration
 *     		-> Collect
 *     		-> Count
 *          -> Sorted
 *          -> Min Max
 *          -> For each
 *          -> toArray
 *          -> of
 *     
 *  Q. How to map the steam object?
 *  
 *     -> What if we don't want to filter out.
 *     -> we rather want to create new object against each existing stream object based on some function
 *     -> EG in given stream create new object by squaring its value
 *     
 *  Q. Difference between filter and map?
 *  
 *  
 *     -> If we want to fetch / filter objects from collections like eg: filter only even numbers from array list collection the use filter for 
 *        configuration of stream
 *     -> If we want to perform some operation on each objects of the collection then create another mapped object with different value ( after
 *        operation is performed ) for each object of the collection then use map
 *        
 *     -> In filter, because of filtering, number of objects in filtered list is less than original list while in Map same number of objects are there
 *        in both new and original list created.
 *        
 *  Q. How to process elements using collect()?
 *  
 *     -> If we want to collect elements of stream after filtering or mapping and add them to the required collection then use collect method.
 *     -> This will work for both filter and collect methods.
 *     
 *  Q. How to process elements using count()?
 *     
 *     -> If we want to count how many elements are there in collection that satisfy given condition then use collect method.
 *  Q. How to Process elements using sorted()?
 *  
 *     -> If we want to sort elements inside a stream use this sorted() method.
 *     -> We can sort based on default nature sorting order.
 *     -> If we want to sort using customized sorting order then use comparator.
 *     
 *  Q. How to process elements using Min, Max?
 *  
 *     -> Min(Comparator) will return the minimum value based on the defined comparator
 *     -> Max(Comparator) will return the maximum value based on the defined comparator
 * 
 *  Q. How to process elements using forEach?
 *    
 *     -> forEach() is a method.
 *     -> All methods that we saw till now returned something, like min, max value, sorted collection etc.
 *     -> This method does not return anything.
 *     -> Rather this method takes lambda expression as argument and apply that lambda expression to each element present in that stream.
 *     
 *  Q. How to process elements using toArray()?
 *  
 *     -> We can use this method to copy elements present in the stream to specified array.
 *     
 *  Q. How to process elements using of()?
 *  
 *     -> Stream concept is not applicable just for the collections it's also applicable for "ANY GROUP OF VALUE"
 *     -> Even for arrays you can use stream.
 *     -> Stream.of() this method take any group of values and convert them to stream so that multiple stream operation can be applied to it.
 */

public class StreamDemo {

	
	public void streamPractice()
	{
		List<Integer> list  = new ArrayList<Integer>();
		
		
		list.add(45);
		list.add(45);
		list.add(3);
		list.add(5);
		list.add(98);
		list.add(4);
		list.add(6);
		list.add(12);
		
		List<Integer> filteredList = list.stream().filter( e -> e <= 15).collect(Collectors.toList());
		System.out.println(filteredList);
		
		
		Stream s = list.stream();
		System.out.println("Stream Object: "+s.count());
		
		list.stream().filter(e -> (e%2)==0).forEach(x -> System.out.println(x));
		
		list.stream().map( e -> e*e).forEach(e-> System.out.println(e));
		
		System.out.println("Stream Demo");
	}
	
	
	public void parallelStreamPractice()
	{
		List<Integer> list = new ArrayList<>();
		
		
		list.add(45);
		list.add(2);
		list.add(32);
		list.add(32);
		list.add(43);
		list.add(4);
		list.add(20);
		list.add(18);
		list.add(28);
		list.add(34);
		list.add(25);
		list.add(87);
		list.add(10);
		list.add(82);
		
		// get steam objects
		Stream<Integer> openStream = list.stream();
		
		// configure stream by filter out required values
		Stream<Integer> filterStream = openStream.filter( e -> e %2 == 0);
		
		Long evenNumber = list.stream().filter( e -> e %2 == 0).count();
		System.out.println("Numbers of even number: "+evenNumber);
		
		
		Stream<Integer> sortStream = list.stream().sorted();
		
		System.out.print("Sorted List ascending order: ");
		sortStream.forEach(e -> System.out.print(e+", "));
		System.out.println();
		
		Stream<Integer> descSortStream = list.stream().sorted((x,y) -> y.compareTo(x));
		Integer minValue = list.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("Minimum value: "+minValue);
		
		
		Integer maxValue = list.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Maximum value: "+maxValue);
		
		System.out.print("Sorted List Descending order: ");
		descSortStream.forEach(e -> System.out.print(e+", "));
		System.out.println();
		
		Object[] listArray = list.stream().toArray();
		
		List<Integer> evenList = filterStream.collect(Collectors.toList());
		Set<Integer> evenSet = evenList.stream().collect(Collectors.toSet());
		System.out.println(evenSet);
		evenList.forEach(e -> System.out.println(e));
		
		
		// stream of method
		
		
		
		Stream.of(2,3,1,2,3,4,4,3).filter(e -> e%2==0).forEach(e -> System.out.println(e));
		
		
		String[] strs = {"abc","bde","xyz"};
		
	    Stream.of(strs).filter(e -> e.length() % 3 == 0).forEach(e -> System.out.println(e));
		
		
	}
	
	
	public static void main(String[] args)
	{
		StreamDemo sd = new StreamDemo();
//		sd.streamPractice();
		
		sd.parallelStreamPractice();
		
	}
	
	
}
 