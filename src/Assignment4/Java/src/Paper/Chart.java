package Paper;

public class Chart extends Paper{

	@Override
	public String name() {
		System.out.println("Chart");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int prod() {
		System.out.println("Low");
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args)

	{
		Chart ch = new Chart();
	   
	    ch.name();//Encapsulation
	    ch.prod();
	   
	    
	    
	}



}
