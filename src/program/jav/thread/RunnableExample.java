package program.jav.thread;

public class RunnableExample implements Runnable{  
	
	public void run(){  
	System.out.println("thread is running...");  
	}  
	  
	public static void main(String args[]){  
	
	RunnableExample m1=new RunnableExample();       // object of the class
	Thread t1 = new Thread(m1);                     // we are passing the object into the threas class constructor
	t1.start();                                     // start the thread
 }  
}  
