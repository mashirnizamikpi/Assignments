package Pens;

public class Teacher implements Pen,Pencil {

	@Override
	public void Pname() {
		// TODO Auto-generated method stub
		System.out.println("Nataraj");
		
	}

	@Override
	public void Pcategory() {
		// TODO Auto-generated method stub
		System.out.println("Pencil");
		
	}

	@Override
	public void Pcost() {
		// TODO Auto-generated method stub
		System.out.println("50");
	}

	@Override
	public void Penname() {
		// TODO Auto-generated method stub
		System.out.println("Parker");
	}

	@Override
	public void Penbrand() {
		// TODO Auto-generated method stub
		System.out.println("Parker");
	}

	@Override
	public void Pencategory() {
		// TODO Auto-generated method stub
		System.out.println("Gel Pen");
		
	}

	@Override
	public void Penprice() {
		// TODO Auto-generated method stub
		System.out.println("Rs.1000");
		
	}
	
	public static void main(String[] args)

	{
		Student s = new Student();
	   
	    s.Pname();
	    s.Pcategory();
	    s.Pcost();
	    s.Penname();
	    s.Pencategory();
	    s.Penprice();
	    
	    
	}	

}
