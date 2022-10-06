package Employer;

public class Arinjay implements Employees {

	public int Empid() {
		System.out.println("1121");
		// TODO Auto-generated method stub
		return 1121;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Arinjay");
		return "Arinjay";
		
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Punjab");
		
	}

	public void role() {
		// TODO Auto-generated method stub
		System.out.println("SDE");
	}

	public int salary() {
		// TODO Auto-generated method stub
		return 1000;
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
		return 57123;
	}
	
	public static void main(String args[]) {
		
		Arinjay a= new Arinjay();
		a.Empid();
		a.Name();
		a.state();
		a.role();
		a.salary();
		a.Gender();
		a.Manager();
		a.groupId();
		
		
		
	}

}
