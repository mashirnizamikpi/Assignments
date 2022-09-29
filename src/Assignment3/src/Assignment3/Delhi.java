package Assignment3;
@FunctionalInterface  //First way to call Functional Interface
public interface Delhi {
	void capital();
	
}

class Test implements Delhi{
	public static void main(String args[])
	{
		String capital="India";
		
		Test t = new Test();
		t.capital();
		
		
	}

	@Override
	public void capital() {
		// TODO Auto-generated method stub
		
	}
}





