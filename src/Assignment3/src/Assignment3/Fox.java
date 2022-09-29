package Assignment3;
//extend means Inheritance to abstract class
public class Fox extends Animal {
//inheritance and abstraction in on class
	@Override  //It is basically for abstraction
	String Name() {
		// TODO Auto-generated method stub
		System.out.println("Fox");
		return null;
	}

	
	@Override
	String Class() {
		// TODO Auto-generated method stub
		System.out.println("Carnivores");
		return null;
	}

	@Override
	int Number() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public static void main(String args[]) {
		
		Fox fox = new Fox();
		fox.Name();
		fox.Class();
		fox.Number();
		}
}
