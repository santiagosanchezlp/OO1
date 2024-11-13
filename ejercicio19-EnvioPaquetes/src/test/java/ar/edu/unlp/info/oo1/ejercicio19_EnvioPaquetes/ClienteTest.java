package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ClienteTest {
	Envio envioLocal1;
	Envio envioLocal2;
	Envio envioInterurbano;
	Envio envioInternacional;
	java.time.LocalDate unaFecha1;
	java.time.LocalDate unaFecha2;
	java.time.LocalDate unaFecha3;
	java.time.LocalDate unaFecha4;
	java.time.LocalDate desde;
	java.time.LocalDate hasta;
	Cliente clienteHumano;
	Cliente clienteCorporativo;
	
	@BeforeEach
	void setUp() {
		unaFecha1 = java.time.LocalDate.of(2024, 10, 5);
		unaFecha2 = java.time.LocalDate.of(2024, 10, 10);
		unaFecha3 = java.time.LocalDate.of(2024, 10, 15);
		unaFecha4 = java.time.LocalDate.of(2024, 10, 20);
		desde = java.time.LocalDate.of(2024, 10, 12);
		hasta = java.time.LocalDate.of(2024, 10, 22);
		envioLocal1 = new EnvioLocal(unaFecha1, "Berisso", "La Plata", 100, false);
		envioLocal2 = new EnvioLocal(unaFecha2, "Berisso", "La Plata", 100, true);
		envioInterurbano = new EnvioInterurbano (unaFecha3, "Berisso", "La Plata", 100, 1000);
		envioInternacional = new EnvioInternacional (unaFecha4, "Berisso", "La Plata", 100);
		clienteHumano = new ClienteHumano("Pepe", "Calle 2 166", 35243648);
		clienteCorporativo = new ClienteCorporativo("Pepe SRL", "Calle 2 166", 352436489);
	}
	
	@Test
	void ClienteHumanoTest() {
		assertEquals(0, clienteHumano.calcularCosto(desde, hasta));
		clienteHumano.agregarEnvio(envioLocal1);
		assertEquals(0, clienteHumano.calcularCosto(desde, hasta));
		clienteHumano.agregarEnvio(envioLocal2);
		assertEquals(0, clienteHumano.calcularCosto(desde, hasta));
		clienteHumano.agregarEnvio(envioInterurbano);
		assertEquals(3000*0.9, clienteHumano.calcularCosto(desde, hasta));
		clienteHumano.agregarEnvio(envioInternacional);
		assertEquals(9000*0.9, clienteHumano.calcularCosto(desde, hasta));
	}
	@Test
	void ClienteCorporativoTest() {
		assertEquals(0, clienteCorporativo.calcularCosto(desde, hasta));
		clienteCorporativo.agregarEnvio(envioLocal1);
		assertEquals(0, clienteCorporativo.calcularCosto(desde, hasta));
		clienteCorporativo.agregarEnvio(envioLocal2);
		assertEquals(0, clienteCorporativo.calcularCosto(desde, hasta));
		clienteCorporativo.agregarEnvio(envioInterurbano);
		assertEquals(3000, clienteCorporativo.calcularCosto(desde, hasta));
		clienteCorporativo.agregarEnvio(envioInternacional);
		assertEquals(9000, clienteCorporativo.calcularCosto(desde, hasta));
	}
}
