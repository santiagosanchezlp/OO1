package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class gestorCuadroTarifarioTest {
	private gestorCuadroTarifario tarifas;
	
	@BeforeEach
	void setUp() {
		tarifas = new gestorCuadroTarifario(200, java.time.LocalDate.of(2020, 9, 10));
		
	}
	
	@Test
	void unaTarifaTest() {
		assertEquals(200, tarifas.getTarifaVigente());
	}
	@Test
	void variasTarifasTest() {
		tarifas.nuevaTarifa(2000, java.time.LocalDate.of(2021, 9, 10));
		tarifas.nuevaTarifa(400, java.time.LocalDate.of(2022, 9, 10));
		tarifas.nuevaTarifa(8000, java.time.LocalDate.of(2023, 9, 10));
		assertEquals(8000, tarifas.getTarifaVigente());
	}
}
