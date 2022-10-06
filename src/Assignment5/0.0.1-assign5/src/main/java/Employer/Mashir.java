package Employer;

public class Mashir implements Employees {

	public int Empid() {
		System.out.println("1010");
		// TODO Auto-generated method stub
		return 1010;
		
	}

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Mashir Nizami");
		return "Mashir Nizami";
		
	}

	public void state() {
		// TODO Auto-generated method stub
		System.out.println("Delhi");
		
	}

	public void role() {
		// TODO Auto-generated method stub
		System.out.println("Data Engineer");
	}

	public int salary() {
		// TODO Auto-generated method stub
		System.out.println("NA");
		return 100000;
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
		return 84290;
	}
	
	public static void main(String args[]) {
		
		Mashir m= new Mashir();
		m.Empid();
		m.Name();
		m.state();
		m.role();
		m.salary();
		m.Gender();
		m.Manager();
		m.groupId();
		
		
		
	}

}
