package Question5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class JokerTest {

	@Test
	
	public void ans() {
		Joker jo = new Joker();
		String legs = jo.dance();
		String rat = jo.dance1();
		



		
	//	assertEquals("Kathakali", legs);
		assertEquals("Joker 1 is dancing Kathakali", legs);
		assertEquals("Joker 2 is dancing Kuchipudi", rat);


	}

}
