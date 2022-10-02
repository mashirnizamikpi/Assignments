package Paper;

public class Letter extends Paper{

	@Override
	public String name() 
	{
		System.out.println("Letter");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int prod() {
		System.out.println("Moderate");
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args)

	{
		Letter le = new Letter();
	   
	    le.name();
	    le.prod();
	   
	    
	    
	}



}
