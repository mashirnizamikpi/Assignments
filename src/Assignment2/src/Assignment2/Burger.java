package Assignment2;

public class Burger extends Food {

	@Override
	String taste() {
		// TODO Auto-generated method stub
		System.out.println("Tasty");
		return null;
	}

	@Override
	String color() {
		System.out.println("white");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int Equipments() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	String name() {
		System.out.println("Burger");
		// TODO Auto-generated method stub
		return null;
	}
}
