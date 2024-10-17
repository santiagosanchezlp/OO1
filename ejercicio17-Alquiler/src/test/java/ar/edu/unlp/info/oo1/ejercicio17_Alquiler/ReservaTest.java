package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservaTest {
	private Reserva reserva1;
	private Propiedad propiedad;
	private DateLapse lapso1;
	
	@BeforeEach
	void setUp() {
		lapso1 = new DateLapse(java.time.LocalDate.of(2024, 10, 20),java.time.LocalDate.of(2024, 10, 21));
		propiedad = new Propiedad("Propiedad Prueba", "Calle Falsa 123");
		propiedad.setPrecio(10);
		reserva1 = new Reserva(propiedad,lapso1);
	}
	
	
	@Test
	void calcularPrecioTest() {
		assertEquals(10,reserva1.getPrecio());
	}
	
	@Test 
	void cambioPrecioPosteriorTest() {
		propiedad.setPrecio(20);
		assertEquals(10,reserva1.getPrecio());
	}

	@Test 
	void getPeriodTest() {
		assertEquals(lapso1,reserva1.getPeriod());
		assertTrue(reserva1.getPeriod().includesPeriod(lapso1));
	}
}
