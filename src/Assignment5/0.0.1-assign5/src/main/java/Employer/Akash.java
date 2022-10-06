package Employer;

public class Akash implements Employees {

	public int Empid() {
		System.out.println("1311");
		// TODO Auto-generated method stub
		return 1311;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Akash");
		return "Akash";
		
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
		return 20000;
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
		return 84321;
	}
	
	public static void main(String args[]) {
		
		Akash aka= new Akash();
		aka.Empid();
		aka.Name();
		aka.state();
		aka.role();
		aka.salary();
		aka.Gender();
		aka.Manager();
		aka.groupId();
		
		
		
	}

}
