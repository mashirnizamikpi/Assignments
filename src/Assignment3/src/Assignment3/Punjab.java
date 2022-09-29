package Assignment3;

interface State{
	void region();
}

class Haryana implements State{

@Override
public void region() {
	// TODO Auto-generated method stub
	
}

public class Punjab {
	
	
	public static void main(String args[])
    {
  
        // lambda expression - Second way to call Functional Interface
      State haryana = () ->System.out.println("Capital is Chandigarh");
      haryana.region();
    }
}


}


