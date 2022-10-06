package Question7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class StudentTest{

	@Test
	public void check_set() {
		
		Student s = new Student();
		
		assertEquals(110, s.set_size());
		
	}
	
}



