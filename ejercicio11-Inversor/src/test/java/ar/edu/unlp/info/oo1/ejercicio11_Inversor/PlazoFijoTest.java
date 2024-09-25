package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PlazoFijoTest {
		
	PlazoFijo PF1, PF2;
	@BeforeEach
	void setUp() throws Exception {
		LocalDate fecha = LocalDate.now().minusDays(100);
		PF1 = new PlazoFijo (1000, 0.02);
		PF2 = new PlazoFijo(2000, 0.01, fecha);
	}
	
	@Test
    public void ValorTest() {
        assertEquals(1000, PF1.getMontoDepositado());
        assertEquals(2000, PF2.getMontoDepositado());
        assertEquals(0.02, PF1.getTasa());
        assertEquals(0.01, PF2.getTasa());
        assertEquals(LocalDate.now(), PF1.getFechaConstitucion());
        assertEquals(LocalDate.now().minusDays(100), PF2.getFechaConstitucion());
        assertEquals(1000, PF1.valorActual());
        assertEquals(4000, PF2.valorActual());
        assertEquals(0, PF1.getAnticuacion());
        assertEquals(100, PF1.getAnticuacion());
    }
}
