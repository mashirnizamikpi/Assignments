package Assignment1;

public abstract class Animal {
	
	abstract int sound();
	abstract String color();
	abstract int legs();
	abstract char type();
	private String name;  
	 
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name ; 
	}  

}
