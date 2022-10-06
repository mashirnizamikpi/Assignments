package Employer;

public class Akshay implements Employees {

	public int Empid() {
		System.out.println("1412");
		// TODO Auto-generated method stub
		return 1412;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Akshay");
		return "Akshay";
		
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
		
		Akshay aks= new Akshay();
		aks.Empid();
		aks.Name();
		aks.state();
		aks.role();
		aks.salary();
		aks.Gender();
		aks.Manager();
		aks.groupId();
		
		
		
	}

}
