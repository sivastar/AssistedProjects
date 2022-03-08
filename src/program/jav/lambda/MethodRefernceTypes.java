package program.jav.lambda;

interface B {
	public void getName(String name);
}

interface A {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean isSingleDigit(int x) {
	    return x > -10 && x < 10;
	}
}

interface C {
    public  void add(int x, int y);
}

class Addition {
	public void sum(int a, int b) {
	    System.out.println("The sum is :"+(a+b));
	}
}

interface E {
	public Employee getEmployee();
}

interface D {
	public Employee getEmployee(String name, int age);
}

class Employee {
	String eName;
	int eAge;
	
	public Employee(){} 
	
	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}
	
	public void getInfo() {
		System.out.println("I am a method of class Employee");
	}
}

public class MethodRefernceTypes {

	public static void getInfo(String info) {
		System.out.println(info);
	}

	public static void main(String[] args) {
		
    //========================= Method reference ==========================//		
		B a0 = (String s) -> System.out.println(s); //providing implementation of getName(String name) using Lambda Expression
		a0.getName("SAM is executing");

		B a1 = MethodRefernceTypes::getInfo; // refering to pre-existing getInfo(String info) of class Test as arguments are same as getName(String name)
		a1.getName("getInfo() of Test class is executing");
		
		
		
   //========================= Method reference to static method ==========================//
	//*** Using Lambda Expression ***//
		A a3 = (x) -> { return x > -10 && x < 10;};
		System.out.println(a3.checkSingleDigit(10));
				
	//*** Using Method Reference ***//
		A a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
		
		
		
	//========================Method reference to an Instance method of a class==========//
		Addition addition = new Addition();
		//*** Using Lambda Expression ***//
		C b1 = (a,b) -> System.out.println("The sum is :"+(a+b));
		b1.add(10, 14);
		
		//*** Using Method Reference ***//
		C b2 = addition::sum;
		b2.add(100, 140);
		
		
		
	//============================= Constructor Reference ===============================//	
		//*** Using Lambda Expression ***//
		E c1 = () -> new Employee();
		c1.getEmployee().getInfo();
		D d1 = (name,age) -> new Employee(name,age);
		d1.getEmployee("Tony", 34).getInfo();
				
		//*** Using Method Reference ***//
		E c2 = Employee::new;
		c2.getEmployee().getInfo();
		D d2 = Employee::new;
		d2.getEmployee("Tony", 34).getInfo();
	}
}
