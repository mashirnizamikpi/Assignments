package Employer;

public class Mayur implements Employees {

	public int Empid() {
		System.out.println("1875");
		// TODO Auto-generated method stub
		return 1875;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Mayur");
		return "Mayur";
		
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Nainital");
		
	}

	public void role() {
		// TODO Auto-generated method stub
		System.out.println("Engineer");
	}

	public int salary() {
		// TODO Auto-generated method stub
		System.out.println("NA");
		return 80000;
	}

	public void Gender() {
		// TODO Auto-generated method stub
		System.out.println("Male");
	}

	public void Manager() {
		// TODO Auto-generated method stub
		System.out.println("NA");
	}

	public int groupId() {
		// TODO Auto-generated method stub
		System.out.println("0.0.1");
		return 94321;
	}
	
	public static void main(String args[]) {
		
		Mayur mas= new Mayur();
		mas.Empid();
		mas.Name();
		mas.state();
		mas.role();
		mas.salary();
		mas.Gender();
		mas.Manager();
		mas.groupId();
		
		
		
	}

}
