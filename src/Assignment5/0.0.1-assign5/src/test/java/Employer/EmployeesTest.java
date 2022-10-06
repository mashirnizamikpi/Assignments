package Employer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeesTest {


	@Test
	
	public void ans() {
		Arinjay ar = new Arinjay();
		


		

		int legs = ar.Empid();
		int net = ar.salary();
		int cat = ar.groupId();
		String na = ar.Name();


		

		
		assertEquals(1121, legs);
		assertEquals(1000, net);
		assertEquals(57123, cat);
		assertEquals("Arinjay",na);
		


	}


@Test
	
	public void adn() {
	Adnan ad = new Adnan();
	
	int base = ad.Empid();
	int rat = ad.salary();
	int amt = ad.groupId();
	String sat = ad.Name();

	assertEquals(1232, base);
	assertEquals(10000, rat);
	assertEquals(84290, amt);
	assertEquals("Adnan Nizami",sat);
}


@Test

public void aka() {
Akash aks = new Akash();

int base = aks.Empid();
int rat = aks.salary();
int amt = aks.groupId();
String sat = aks.Name();

assertEquals(1311, base);
assertEquals(20000, rat);
assertEquals(84321, amt);
assertEquals("Akash",sat);
}


@Test

public void aks() {
Akshay akshay = new Akshay();

int base = akshay.Empid();
int rat = akshay.salary();
int amt = akshay.groupId();
String sat = akshay.Name();

assertEquals(1412, base);
assertEquals(20000, rat);
assertEquals(84321, amt);
assertEquals("Akshay",sat);
}


@Test

public void chan() {
Chander ch = new Chander();

int base = ch.Empid();
int rat = ch.salary();
int amt = ch.groupId();
String sat = ch.Name();

assertEquals(2422, base);
assertEquals(60000, rat);
assertEquals(87821, amt);
assertEquals("Chander",sat);
}


@Test

public void may() {
Mayur m = new Mayur();

int base = m.Empid();
int rat = m.salary();
int amt = m.groupId();
String sat = m.Name();

assertEquals(1875, base);
assertEquals(80000, rat);
assertEquals(94321, amt);
assertEquals("Mayur",sat);
}



@Test

public void mud() {
Mudit mu = new Mudit();

int base = mu.Empid();
int rat = mu.salary();
int amt = mu.groupId();
String sat = mu.Name();

assertEquals(2375, base);
assertEquals(80000, rat);
assertEquals(76321, amt);
assertEquals("Mudit",sat);
}



@Test

public void mas() {
Mashir ma = new Mashir();

int base = ma.Empid();
int rat = ma.salary();
int amt = ma.groupId();
String sat = ma.Name();

assertEquals(1010, base);
assertEquals(100000, rat);
assertEquals(84290, amt);
assertEquals("Mashir Nizami",sat);
}

}








