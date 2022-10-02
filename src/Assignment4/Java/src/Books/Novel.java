package Books;


public class Novel extends Book{
	
	 
		public void name()
		{
		System.out.println("Novel");
		}
		public void books()
		{
		System.out.println("The Strange");
		}
		public void best()
		{
		System.out.println("Stephen King");
		}
		public void year()
		{
		System.out.println("2001");
		}
		
		public static void main(String[] args)

	{
		Book b = new Book();
	    Novel n = new Novel();
	    b.name();
	    n.name();//polymorphism
	    b.books();
	    n.books();//polymorphism
	    b.best();
	    n.best();
	    b.year();
	    n.year();
	    
	    
	}
	}