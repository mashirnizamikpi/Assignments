package Question5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class JokerTest {

	@Test
	
	public void ans() {
		Joker jo = new Joker();
		String legs = jo.dance();
		String net = jo.dance1();



		
		assertEquals("Kathakali", legs);
		assertEquals("Odissi", net);


	}

}
