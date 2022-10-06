package Employer;

public class Adnan implements Employees {

	public int Empid() {
		System.out.println("1232");
		// TODO Auto-generated method stub
		return 1232;
		
	}
	

	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Adnan Nizami");
		return "Adnan Nizami";
		
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
		return 10000;
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
		
		Adnan ad= new Adnan();
		ad.Empid();
		ad.Name();
		ad.state();
		ad.role();
		ad.salary();
		ad.Gender();
		ad.Manager();
		ad.groupId();
		
		
		
	}

}
