package ar.edu.unlp.info.oo1.ejercicio19_EnvioPaquetes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EnvioTest {
	Envio envioLocal;
	Envio envioInterurbano;
	Envio envioInternacional;
	java.time.LocalDate unaFecha;
	
	@BeforeEach
	void setUp() {
		unaFecha = java.time.LocalDate.of(2024, 10, 15);
	}
	
	
	@Test
	void EnvioLocalTest() {
		envioLocal = new EnvioLocal(unaFecha, "Berisso", "La Plata", 100, false);
		assertEquals(1000, envioLocal.calcularCosto());
		envioLocal = new EnvioLocal(unaFecha, "Berisso", "La Plata", 100, true);
		assertEquals(1500, envioLocal.calcularCosto());
	}
	@Test
	void EnvioInterurbanoTest() {
		envioInterurbano = new EnvioInterurbano (unaFecha, "Berisso", "La Plata", 100, 99);
		assertEquals(20*100, envioInterurbano.calcularCosto());
		envioInterurbano = new EnvioInterurbano (unaFecha, "Berisso", "La Plata", 100, 100);
		assertEquals(25*100, envioInterurbano.calcularCosto());
		envioInterurbano = new EnvioInterurbano (unaFecha, "Berisso", "La Plata", 100, 500);
		assertEquals(25*100, envioInterurbano.calcularCosto());
		envioInterurbano = new EnvioInterurbano (unaFecha, "Berisso", "La Plata", 100, 1000);
		assertEquals(30*100, envioInterurbano.calcularCosto());
	}
	@Test
	void EnvioInternacionalTest() {
		envioInternacional = new EnvioInternacional (unaFecha, "Berisso", "La Plata", 1000);
		assertEquals(5000+10*1000, envioInternacional.calcularCosto());
		envioInternacional = new EnvioInternacional (unaFecha, "Berisso", "La Plata", 1001);
		assertEquals(5000+12*1001, envioInternacional.calcularCosto());
	}
}
