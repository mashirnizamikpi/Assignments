package Assignment2;

public class State extends Bank{
	
	String bank = "Corp Bank";
	String branch = "Hyderabad";
	
	void print(){  
		System.out.println(bank);
		System.out.println(branch);
		System.out.println(super.bank);
		System.out.println(super.branch);
		}  
	public static void main(String args[]){  
		State d=new State();  
		d.print();  
		}
}
