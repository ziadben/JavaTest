package de.ziad.rechner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RechenerTest {
    private RechnerMetier rechner;
	@Before
	public void setUp() throws Exception {
		rechner= new RechnerMetier();
	}

	@Test
	public void testsumme() {
		assertTrue(rechner.summe(1, 3)==4);
	}
	
	@Test
	public void testprodukt() {
		assertTrue(rechner.produkt(3, 4)==12);
	}

}
