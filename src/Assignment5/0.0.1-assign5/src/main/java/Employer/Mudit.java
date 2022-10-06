package Employer;

public class Mudit implements Employees {

	public int Empid() {
		System.out.println("2375");
		// TODO Auto-generated method stub
		return 2375;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Mudit");
		return "Mudit";
		
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Kolkata");
		
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
		return 76321;
	}
	
	public static void main(String args[]) {
		
		Mudit mu= new Mudit();
		mu.Empid();
		mu.Name();
		mu.state();
		mu.role();
		mu.salary();
		mu.Gender();
		mu.Manager();
		mu.groupId();
		
		
		
	}

}
