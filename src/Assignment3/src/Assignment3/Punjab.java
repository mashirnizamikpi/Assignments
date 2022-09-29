package Assignment3;

public class Punjab {
	
	
	public static void main(String args[])
    {
  
        // lambda expression - Second way to call Functional Interface
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}


