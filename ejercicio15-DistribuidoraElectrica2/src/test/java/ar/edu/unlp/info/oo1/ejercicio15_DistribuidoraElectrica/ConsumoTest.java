package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ConsumoTest {
	
	private Consumo consumo1;
	
	@BeforeEach
	void setUp() {
		consumo1 = new Consumo (200, 100);
	}
	
	@Test
	void getConsumoTest() {
		assertEquals(200, consumo1.getEnergiaActiva());
		assertEquals(100, consumo1.getEnergiaReactiva());
	}

}
