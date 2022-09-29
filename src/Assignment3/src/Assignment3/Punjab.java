package Assignment3;

interface State{
	void region();
}



public class Punjab implements State{
	
	
	public static void main(String args[])
    {
  
        // lambda expression - Second way to call Functional Interface
      State punjab = () ->System.out.println("Capital is Chandigarh");
      punjab.region();
    }

	@Override
	public void region() {
		// TODO Auto-generated method stub
		
	}
}





