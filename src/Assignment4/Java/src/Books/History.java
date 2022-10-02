package Books;
//Inheritance 
public class History extends Book{
	
	 
	public void name()
	{
	System.out.println("History");
	}
	public void books()
	{
	System.out.println("The man who knew too much");
	}
	public void best()
	{
	System.out.println("W.Tuchman");
	}
	public void year()
	{
	System.out.println("1962");
	}
	
	public static void main(String[] args)

{
	Book b = new Book();//create a object
    History h = new History();
    b.name();//polymorphism
    h.name();
    b.books();
    h.books();
    b.best();
    h.best();
    b.year();
    h.year();
    
    
}
}
