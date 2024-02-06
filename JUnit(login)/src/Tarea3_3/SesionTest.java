package Tarea3_3;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class SesionTest {
	public Sesion sesion;
	
	@Before
	public void preparacion() {
		sesion = new Sesion();
	}
	
	@Test
	public void userCorrPassCorr() {
		boolean result = sesion.login("dmunuera", "123456");
		assertTrue(result);
	}
	
	@Test
	public void userCorrPassIncorr() {
		boolean result = sesion.login("pepe", "6543210");
		assertFalse(result);
	}
	
	@Test
	public void userIncorrPassCorr() {
		boolean result = sesion.login("maria", "9876543210");
		assertFalse(result);
	}
	
	@Test
	public void userIncorrPassIncorr() {
		boolean result = sesion.login("maria", "654321");
		assertFalse(result);
	}
	
}