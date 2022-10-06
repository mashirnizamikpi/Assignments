package Question5;

public class Joker implements Joke{

	private String Name;
	private String Dance;

	Joker() {
		// TODO Auto-generated constructor stub
	}

	public  Joker(String Name,String Dance) {
		this.Name=Name;
		this.Dance=Dance;
		
		// TODO Auto-generated constructor stub
	}

public static void main(String args[]) {

	Joker a = new Joker();
	Joker a1 = new Joker("Joker1","Kathakali");
	Joker b = new Joker();
	Joker b1 = new Joker("Joker2","Kuchipudi");
	Joker c = new Joker();
	Joker c1 = new Joker("Joker3","Bharatanatyam");
	Joker d = new Joker();
	Joker d1 = new Joker("Joker4","Kathak");
	Joker e = new Joker();
	Joker e1 = new Joker("Joker5","Odissi");
	Joker f = new Joker();
	Joker f1 = new Joker("Joker6","Mohiniattam");
	Joker g = new Joker();
	Joker g1 = new Joker("Joker7","Sattriya");
	Joker h = new Joker();
	Joker h1 = new Joker("Joker8","Chhau");
	
	
	
	System.out.println(a.Name+" "+"is dancing"+" "+a.Dance);
	System.out.println(a1.Name+" "+"is dancing"+" "+a1.Dance);
	System.out.println(b.Name+" "+"is dancing"+" "+b.Dance);
	System.out.println(b1.Name+" "+"is dancing"+" "+b1.Dance);
	System.out.println(c.Name+" "+"is dancing"+" "+c.Dance);
	System.out.println(c1.Name+" "+"is dancing"+" "+c1.Dance);
	System.out.println(d.Name+" "+"is dancing"+" "+d.Dance);
	System.out.println(d1.Name+" "+"is dancing"+" "+d1.Dance);
	System.out.println(e.Name+" "+"is dancing"+" "+e.Dance);
	System.out.println(e1.Name+" "+"is dancing"+" "+e1.Dance);
	System.out.println(f.Name+" "+"is dancing"+" "+f.Dance);
	System.out.println(f1.Name+" "+"is dancing"+" "+f1.Dance);
	System.out.println(g.Name+" "+"is dancing"+" "+g.Dance);
	System.out.println(g1.Name+" "+"is dancing"+" "+g1.Dance);
	System.out.println(h.Name+" "+"is dancing"+" "+h.Dance);
	System.out.println(h1.Name+" "+"is dancing"+" "+h1.Dance);
	
	
	
	
}



public String dance() {
	// TODO Auto-generated method stub
	return "Kathakali";
}
public String dance1() {
	// TODO Auto-generated method stub
	return "Odissi";
}

public String Dance() {
	// TODO Auto-generated method stub
	return null;
}

public String Name() {
	// TODO Auto-generated method stub
	return null;
}


}
