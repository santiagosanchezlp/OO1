package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PropiedadTest {
	private Propiedad propiedad;
	private DateLapse lapso1;
	private DateLapse lapso2;
	private DateLapse lapso3;
	private DateLapse lapso4;
	
	@BeforeEach
	void setUp() {
		lapso1 = new DateLapse(java.time.LocalDate.of(2024, 10, 20),java.time.LocalDate.of(2024, 10, 21));
		lapso2 = new DateLapse(java.time.LocalDate.of(2024, 10, 22),java.time.LocalDate.of(2024, 10, 26));
		lapso3 = new DateLapse(java.time.LocalDate.of(2024, 10, 25),java.time.LocalDate.of(2024, 10, 30));
		lapso4 = new DateLapse(java.time.LocalDate.of(2024, 10, 15),java.time.LocalDate.of(2024, 10, 19));
		propiedad = new Propiedad("Propiedad Prueba", "Calle Falsa 123");
		propiedad.setPrecio(10);
	}
	
	@Test
	void crearReservaTest () {
		assertTrue(propiedad.crearReserva(lapso1));
		
		assertTrue(propiedad.crearReserva(lapso2));
		assertFalse(propiedad.crearReserva(lapso2)); //ya reservado
		assertFalse(propiedad.crearReserva(lapso3)); //hay overlap
	}
	@Test
	void cancelarReservaTest() {
		propiedad.crearReserva(lapso1);
		propiedad.crearReserva(lapso2);
		propiedad.crearReserva(lapso4);
		assertFalse(propiedad.cancelarReserva(lapso3)); //no hay una reserva por ese tiempo
		assertFalse(propiedad.cancelarReserva(lapso4)); // tiempo ya pasado
		assertTrue(propiedad.cancelarReserva(lapso1));
	}
	
	@Test 
	void calcularPrecioTest(){
		propiedad.crearReserva(lapso1); //1*10
		propiedad.crearReserva(lapso2); //4*10
		propiedad.crearReserva(lapso4); //4*10
		assertEquals(90,propiedad.calcularIngreso());
	}
}
