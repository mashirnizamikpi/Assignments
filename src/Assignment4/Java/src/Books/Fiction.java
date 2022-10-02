package Books;

public class Fiction extends Book{
	
	 
	public void name()
	{
	System.out.println("Fiction");
	}
	public void books()
	{
	System.out.println("The Stranger Things");
	}
	public void best()
	{
	System.out.println("J.K.Rowling");
	}
	public void year()
	{
	System.out.println("2006");
	}
	
	public static void main(String[] args)

{
	Book b = new Book();
    Fiction f = new Fiction();
    b.name();
    f.name();//polymorphism
    b.books();
    f.books();
    b.best();
    f.best();
    b.year();
    f.year();
    
    
}
}