package ar.edu.unlp.info.oo1.ejercicio11_Inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class InversorTest {
	
	Inversor Santi, Rodri, Sebas;
	InversionEnAcciones accion1, accion2, accion3;
	PlazoFijo PF1, PF2;
	
	@BeforeEach
	void setUp() throws Exception {
		Santi = new Inversor("Santi");
		Rodri = new Inversor("Rodri");
		Sebas = new Inversor("Sebas");
		accion1 = new InversionEnAcciones("Edenor");
		accion2 = new InversionEnAcciones("YPF");
		accion3 = new InversionEnAcciones("Globant");
		accion1.setCotizacion(50);
		accion2.setCotizacion(100);
		accion3.setCotizacion(1000);
		accion1.compra(10);
		accion2.compra(20);
		accion3.compra(100);
		PF1 = new PlazoFijo (1000, 0.02);
		PF2 = new PlazoFijo(2000, 0.01);
		Santi.compra(accion1);
		Rodri.compra(accion2);
		Sebas.compra(accion3);
		Santi.constituirPlazoFijo(1000, 20);
		Rodri.agregarPlazoFijo(PF1);
		Sebas.agregarPlazoFijo(PF2);
	}
	
    @Test
    public void tesValorActual() {
        assertEquals(1500, Santi.valorActual());
        assertEquals(3000, Rodri.valorActual());
        assertEquals(102000, Sebas.valorActual());
    }
}
