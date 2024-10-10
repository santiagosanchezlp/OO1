package ar.edu.unlp.info.oo1.ejercicio15_DistribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class FacturaTest {
	private Factura juanAgosto;
	private Usuario juan;
	private Consumo consumo1;
	private Consumo consumo2;
	private Consumo consumo3;
	private Consumo consumo4;
	private gestorCuadroTarifario tarifas;
	
	@BeforeEach
	void setUp() {
		juan = new Usuario("Juan", "Calle 2 100");
		consumo1 = new Consumo(200,100);
		consumo2 = new Consumo(100,100);
		consumo3 = new Consumo(2000,1000);
		consumo4 = new Consumo(4000,2000);
		tarifas = new gestorCuadroTarifario(200, java.time.LocalDate.of(2020, 9, 10));
		juanAgosto = new Factura (tarifas);
	}
	
	@Test
	void sinConsumos() {
		juanAgosto.nuevaFactura(juan);
		assertEquals(0, juanAgosto.getMontoFinal());
	}

	@Test
	void conBonificacion() {
		juan.agregarConsumo(consumo1);
		juanAgosto.nuevaFactura(juan);
		assertEquals(36000, juanAgosto.getMontoFinal());
	}
	
	@Test
	void sinBonificacion() {
		juan.agregarConsumo(consumo2);
		juanAgosto.nuevaFactura(juan);
		assertEquals(20000, juanAgosto.getMontoFinal());
	}
}
