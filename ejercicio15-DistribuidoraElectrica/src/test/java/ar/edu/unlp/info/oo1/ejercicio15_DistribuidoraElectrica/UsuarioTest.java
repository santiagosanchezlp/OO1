package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class UsuarioTest {
	private Usuario pedro;
	private Usuario juan;
	private Consumo consumo1;
	private Consumo consumo2;
	private Consumo consumo3;
	private Consumo consumo4;
	
	
	@BeforeEach
	void setUp() {
		pedro = new Usuario("Pedro", "Calle 1 50");
		juan = new Usuario("Juan", "Calle 2 100");
		consumo1 = new Consumo(200,100);
		consumo2 = new Consumo(100,50);
		consumo3 = new Consumo(2000,1000);
		consumo4 = new Consumo(4000,2000);
		juan.agregarConsumo(consumo1);
		
	}
	
	@Test
	void sinConsumoTest() {
		assertEquals(0,pedro.getUltimoConsumoActivo());
		assertEquals(0,pedro.getUltimoConsumoReactivo());
	}
	
	@Test
	void unConsumoTest() {
		assertEquals(200,juan.getUltimoConsumoActivo());
		assertEquals(100,juan.getUltimoConsumoReactivo());
	}
	@Test
	void variosConsumosTest() {
		pedro.agregarConsumo(consumo1);
		pedro.agregarConsumo(consumo2);
		pedro.agregarConsumo(consumo3);
		pedro.agregarConsumo(consumo4);
		assertEquals(4000,pedro.getUltimoConsumoActivo());
		assertEquals(2000,pedro.getUltimoConsumoReactivo());
	}
}
