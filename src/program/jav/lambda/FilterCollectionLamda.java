package program.jav.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterCollectionLamda {
	public static void main(String[] args)
    { 
		List<String> items = new ArrayList<String>();
		items.add("one");
		items.add("two");
		items.add("three");

		Stream<String> streams = items.stream();
		streams.filter( item -> item.startsWith("t")).forEach(System.out::println); 		
		System.out.println("----------------------------------------------------");
        
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	    Predicate<Integer> condition = new Predicate<Integer>() 
	    {
	            @Override
	            public boolean test(Integer n) {
	                if (n % 2 == 0) {
	                    return true;
	                }
	                return false;
	            }
	    };
	    // iterate over a stream of integers and print only even numbers
	    list.stream().filter(condition).forEach(System.out::println);
	    System.out.println("----------------------------------------------------");
	    
	    
	    
	    //use the map() method to collect the stream elements and then convert each
	    //number to its square before collecting it to the List
	    List<Integer> listt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);    
        List<Integer> evenNumbers = listt.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .collect(Collectors.toList());         
        System.out.println(evenNumbers);
        System.out.println("----------------------------------------------------");
	    
		
        
		// Creating a list of Integers
        List<Integer> lists = Arrays.asList(3, 4, 6, 12, 20);
  
        // Using Stream filter(Predicate predicate) to get a stream consisting of the elements that are divisible by 5
        lists.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        
        
        
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Games", "fOR", "hEllo", "Students","countries");
  
        // Using Stream filter(Predicate predicate) to get a stream consisting of the elements having UpperCase Character at index 1
        stream.filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);       
        System.out.println("----------------------------------------------------");
        
        
        
        Stream<String> stream1 = Stream.of("Games", "FoR", "hello", "Students","countries","oranges");
        // Using Stream filter(Predicate predicate) to get a stream consisting of the elements ending with s
        stream1.filter(strr -> strr.endsWith("s")).forEach(System.out::println);
    }
}
