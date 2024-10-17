package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	private DateLapse lapso1;
	private DateLapse lapso2;
	private DateLapse lapso3;
	private DateLapse lapso4;
	private Usuario usuario;
	private Usuario usuarioSinPropiedad;
	
	@BeforeEach
	void setUp() {
		lapso1 = new DateLapse(java.time.LocalDate.of(2024, 10, 20),java.time.LocalDate.of(2024, 10, 21));
		lapso2 = new DateLapse(java.time.LocalDate.of(2024, 10, 22),java.time.LocalDate.of(2024, 10, 26));
		lapso3 = new DateLapse(java.time.LocalDate.of(2024, 10, 25),java.time.LocalDate.of(2024, 10, 30));
		lapso4 = new DateLapse(java.time.LocalDate.of(2024, 10, 15),java.time.LocalDate.of(2024, 10, 19));
		propiedad1 = new Propiedad("Propiedad Prueba", "Calle Falsa 123");
		propiedad1.setPrecio(10);
		propiedad2 = new Propiedad("Propiedad Prueba", "Calle Falsa 123");
		propiedad2.setPrecio(20);
		propiedad1.crearReserva(lapso1);
		propiedad1.crearReserva(lapso2);
		propiedad1.crearReserva(lapso4);
		propiedad2.crearReserva(lapso1);
		propiedad2.crearReserva(lapso2);
		propiedad2.crearReserva(lapso4);
		usuario = new Usuario("Juan", "Calle Falsa 123", 11111111);
		usuarioSinPropiedad = new Usuario("Pedro", "Calle Falsa 456", 22222222);
		usuario.addInmuebles(propiedad1);
		usuario.addInmuebles(propiedad2);
	} 
	
		@Test
	void IngresosTest() {
		assertEquals(202.5,usuario.ingresos());
		assertEquals(0,usuarioSinPropiedad.ingresos());
	}

}
