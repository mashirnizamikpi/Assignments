package Employer;

public class Prakhar extends Employee implements Runnable{

	@Override
	String name() {
		System.out.println("Prakhar");
		// TODO Auto-generated method stub
		return "Prakhar";
	}

	@Override
	String State() {
		System.out.println("Haryana");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int insurance() {
		System.out.println("3112736");
		// TODO Auto-generated method stub
		return 3112736;
	}

	@Override
	int salary() {
		
		// TODO Auto-generated method stub
		return 6000;
	}

	@Override
	String Father() {
		System.out.println("Akash");
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String Mother() {
		System.out.println("Meenakshi");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int Age() {
		System.out.println("20");
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	String Role() {
		System.out.println("SDE");
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]) {
		
		Runnable r1 = new Prakhar();   
		  
		// creating an object of the class Thread using Thread(Runnable r, String name)  
		Thread th1 = new Thread(r1, "My new thread");    
		  
		// the start() method moves the thread to the active state  
		th1.start();   
		  
		// getting the thread name by invoking the getName() method  

		
	}

	public void run() {
		
		System.out.println("Now the thread is running ...");    
		// TODO Auto-generated method stub
		
	}

}
