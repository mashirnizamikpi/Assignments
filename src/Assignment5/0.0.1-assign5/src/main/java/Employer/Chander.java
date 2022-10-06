package Employer;

public class Chander implements Employees {

	public int Empid() {
		System.out.println("2422");
		// TODO Auto-generated method stub
		return 2422;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Chander");
		return "Chander";
		
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Noida");
		
	}

	public void role() {
		// TODO Auto-generated method stub
		System.out.println("Engineer");
	}

	public int salary() {
		// TODO Auto-generated method stub
		System.out.println("NA");
		return 60000;
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
		return 87821;
	}
	
	public static void main(String args[]) {
		
		Chander ch= new Chander();
		ch.Empid();
		ch.Name();
		ch.state();
		ch.role();
		ch.salary();
		ch.Gender();
		ch.Manager();
		ch.groupId();
		
		
		
	}

}
