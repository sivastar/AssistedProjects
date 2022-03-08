package program.jav.thread;

public class ThreadExample extends Thread{  
	
	public void run(){  
	  System.out.println("thread is running...");  
	}  
	
	public static void main(String args[]){  
	
	ThreadExample t1=new ThreadExample();  // Step 1: create the object of the class
	t1.start();                            // Step 2: starting the thread
 }  
}  