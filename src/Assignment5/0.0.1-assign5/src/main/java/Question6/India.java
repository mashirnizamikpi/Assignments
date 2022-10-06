package Question6;

import java.util.ArrayList;

import Question7.Student;

public class India {

	
	public static int set_size() {
			
			//when we using list for  duplication
		ArrayList<String> No = new ArrayList<String>();
		No.add("Delhi");
		No.add("Punjab");
		No.add("Haryana");
		No.add("Rajasthan");
		No.add("Mumbai");
		No.add("UP");
		No.add("Chandigarh");
		
		
		
		ArrayList<String> Ne = new ArrayList<String>();
		Ne.add("Meghalaya");
		Ne.add("Mizoram");
		Ne.add("Mumbai");
		Ne.add("Assam");
		Ne.add("Arunachal");
		Ne.add("Mumbai");
		
		
		ArrayList<String> so = new ArrayList<String>();
		so.add("Mumbai");
		so.add("Karnataka");
		so.add("Kerala");
		so.add("Telangana");
		so.add("Lakshadweep");
		so.add("Andaman");
		
		
		ArrayList<String> ea = new ArrayList<String>();
		ea.add("Bihar");
		ea.add("Mumbai");
		ea.add("Odisha");
		ea.add("Jharkhand");
		ea.add("Kolkata");

		
		
		ArrayList<String> we = new ArrayList<String>();
		we.add("Mumbai");
		we.add("Maharashtra");
		we.add("Gujarat");
		we.add("Rajasthan");
		we.add("Goa");
		
		

	
		
		No.retainAll(Ne);
		No.retainAll(so);
		No.retainAll(ea);
		No.retainAll(we);
		
		
		System.out.println(No);
		int pos = Ne.indexOf("Mumbai");
		System.out.println("Position of Element is :"+pos);
	return pos;
	}
		

	public static void main(String args[]) {
		India ind = new India();
		ind.set_size();

	}
}
		
		

				
			
				
		
		
	
	

		


