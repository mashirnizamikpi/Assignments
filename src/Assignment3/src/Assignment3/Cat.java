//inheritance and abstraction in on class

package Assignment3;
//extend means Inheritance to abstract class

public class Cat extends Animal {

	@Override	
	
	String Name() {
		// TODO Auto-generated method stub
		System.out.println("Cat");
		return null;
		
	}

	@Override
	String Class() {
		// TODO Auto-generated method stub
		System.out.println("Omnivores");
		return null;
	}

	@Override
	int Number() {
		// TODO Auto-generated method stub
		return 1000;
	}
	public static void main(String args[]) {
	
	Cat cat = new Cat();
	cat.Name();
	cat.Class();
	cat.Number();
	}
}
