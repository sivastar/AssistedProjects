package program.jav.lambda;

import java.util.*;

public class CollectionLambda {
   public static void main(String[] argv) {
	   
	  //-------------List----------------// 
      List<String> countryNames = new ArrayList<String>();
      countryNames.add("Java");
      countryNames.add("Python");
      countryNames.add("MongoDB");
      countryNames.add("AWS");
      countryNames.add("Oracle");

      // Iterating country names through forEach using Lambda Expression
      countryNames.forEach(name -> System.out.println(name));
      
      
      //-----------Map-----------------//
      Map<String, Integer> ranks = new HashMap<String, Integer>();
      ranks.put("India", 5);
      ranks.put("Australia", 4);
      ranks.put("England", 2);
      ranks.put("Newzealand", 1);
      ranks.put("South Africa", 3);
      
      // Iterating through      
      ranks.forEach((k,v) -> System.out.println("Team : " + k + ", Rank : " + v));
   }
}
