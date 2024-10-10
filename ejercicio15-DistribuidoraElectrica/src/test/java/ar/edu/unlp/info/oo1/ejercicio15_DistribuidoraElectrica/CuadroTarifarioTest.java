package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CuadroTarifarioTest {
	private CuadroTarifario cuadro1;
	
	@BeforeEach
	void setUp() {
		cuadro1 = new CuadroTarifario(200, java.time.LocalDate.of(2024, 9, 10));
		cuadro1.setHasta(java.time.LocalDate.of(2024, 10, 8));
	}
	
	@Test
	void CuadroTest() {
		assertEquals(java.time.LocalDate.of(2024, 9, 10),cuadro1.getDesde());
		assertEquals(java.time.LocalDate.of(2024, 10, 8),cuadro1.getHasta());
		assertEquals(200, cuadro1.getCosto());
	}

}
