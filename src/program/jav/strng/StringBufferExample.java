package program.jav.strng;

public class StringBufferExample{  
	
public static void main(String args[]){  
	
	StringBuffer sb=new StringBuffer("Hello "); 
	
	sb.append("Java");        //now original string is changed  
	System.out.println(sb);   //prints Hello Java  
	
	sb.insert(1,"Java");     //now original string is changed  
	System.out.println(sb);  
	
	sb.replace(1,3,"Java");  
	System.out.println(sb);
	
	sb.delete(1,3);  
	System.out.println(sb);
	
	sb.reverse();  
	System.out.println(sb);
	
	System.out.println(sb.charAt(3));
	
	StringBuilder ss = new StringBuilder("Core");
	
	System.out.println(">>>>>>>"+ ss);
	ss.append("Java");
	System.out.println(">>>>>>>"+ ss);
	System.out.println(ss.length());
	System.out.println(ss.charAt(6));
	System.out.println(ss.reverse());
	
	
	}  
}  