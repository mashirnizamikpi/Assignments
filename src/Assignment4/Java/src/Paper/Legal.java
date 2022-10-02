package Paper;

public class Legal extends Paper {

	@Override
	public String name() {
		System.out.println("Very Legal");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int prod() {
		System.out.println("Very");
		// TODO Auto-generated method stub
		return 0;
	}


	public static void main(String[] args)

	{
		Legal l = new Legal();
	   
	    l.name();
	    l.prod();
	   
	    
	    
	}



}
