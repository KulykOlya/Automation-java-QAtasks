package quadEquatation.QEsolver;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import quadEquatation.QEsolver.Discriminant;

public class DiscriminantTest {
	
	private static Discriminant discriminant = new Discriminant();
	
	@BeforeClass
	public static void beforeClass() {
	      System.out.println("BeforeClass Test done");
	      discriminant = new Discriminant();}
	
	@Test(timeout = 1000)
	public void testDiscriminantCalc() throws InterruptedException {
		assertEquals(0.0, discriminant.discriminantCalc(1.0,2.0,1.0), 0.0);
		assertEquals(9.0, discriminant.discriminantCalc(3.0,9.0,6.0), 0.0);
		assertEquals(-7.0, discriminant.discriminantCalc(2.0,3.0,2.0), 0.0);}
}