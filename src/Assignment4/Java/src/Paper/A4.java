package Paper;

public class A4 extends Paper{

	@Override
	public String name() {    //Method 1
		System.out.println("A4");
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public int prod() {             //Method 2
		System.out.println("High");
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args)//Main Mathod

	{
		A4 a = new A4();
	   
	    a.name();
	    a.prod();
	   
	    
	    
	}



}
