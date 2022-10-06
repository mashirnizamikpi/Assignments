package Employer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest 
{




@Test
	
	public void aka() {
	Amit am = new Amit();
	
	int five = am.insurance();
	int six = am.salary();
	int seven = am.Age();
	String et = am.name();

	assertEquals(1092736, five);
	assertEquals(2000, six);
	assertEquals(22, seven);
	assertEquals("Amit",et);
}

@Test

public void Muk() {
Mukesh muk = new Mukesh();

int five = muk.insurance();
int six = muk.salary();
int seven = muk.Age();
String et = muk.name();

assertEquals(1452736, five);
assertEquals(3000, six);
assertEquals(22, seven);
assertEquals("Mukesh",et);
}

@Test

public void Pra() {
Prakhar pr = new Prakhar();

int five = pr.insurance();
int six = pr.salary();
int seven = pr.Age();
String et = pr.name();

assertEquals(3112736, five);
assertEquals(6000, six);
assertEquals(20, seven);
assertEquals("Prakhar",et);
}

@Test

public void Push() {
Pushpa p = new Pushpa();

int five = p.insurance();
int six = p.salary();
int seven = p.Age();
String et = p.name();

assertEquals(5092736, five);
assertEquals(9000, six);
assertEquals(20, seven);
assertEquals("Pushpa",et);
}


@Test

public void raj() {
Raja r = new Raja();

int five = r.insurance();
int six = r.salary();
int seven = r.Age();
String et = r.name();

assertEquals(9092736, five);
assertEquals(12000, six);
assertEquals(20, seven);
assertEquals("Raja",et);
}


@Test

public void rab() {
Rajesh raj = new Rajesh();

int five = raj.insurance();
int six =raj.salary();
int seven = raj.Age();
String et = raj.name();

assertEquals(5091111, five);
assertEquals(11000, six);
assertEquals(20, seven);
assertEquals("Rajesh",et);
}


@Test

public void ram() {
Rama ra = new Rama();

int five = ra.insurance();
int six = ra.salary();
int seven = ra.Age();
String et = ra.name();

assertEquals(1112736, five);
assertEquals(1000, six);
assertEquals(20, seven);
assertEquals("Rama",et);
}


@Test

public void shi() {
Shivam sh = new Shivam();

int five = sh.insurance();
int six = sh.salary();
int seven = sh.Age();
String et = sh.name();

assertEquals(7072736, five);
assertEquals(3000, six);
assertEquals(20, seven);
assertEquals("Shivam",et);
}


@Test

public void vik() {
Vikrant v = new Vikrant();

int five = v.insurance();
int six = v.salary();
int seven = v.Age();
String et = v.name();

assertEquals(8888836, five);
assertEquals(9000, six);
assertEquals(20, seven);
assertEquals("Vikrant",et);
}

@Test

public void vish() {
Vishal vi = new Vishal();

int five = vi.insurance();
int six = vi.salary();
int seven = vi.Age();
String et = vi.name();

assertEquals(3332736, five);
assertEquals(9000, six);
assertEquals(20, seven);
assertEquals("Vishal",et);
}

}











