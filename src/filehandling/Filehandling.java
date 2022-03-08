package filehandling;
import java.io.*;
public class Filehandling {
	
	public static void main(String[] args){
		 //Writing in the file

		 try
		 {
			 FileWriter f = new FileWriter("C:\\Users\\sivamadduluri\\Desktop\\test.txt");
		 try
		 {
			 f.write("writeup for Filehandling Project \n Project objective: To write a program to read, write, and append to a file. Approach:imported input output ,by using filewriter fetched the file to be edited,edit the file using f.write() method");
		 } 
		 finally
		 {
			 f.close();
		 }
		 System.out.println("Test passed");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }

		 }


}
