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
		
		PF1 = new PlazoFijo (1000, 0.02);
		PF2 = new PlazoFijo(2000, 0.01);
	}
	
    @Test
    public void testAlta() {
        assertEquals(0, accion1.getCantidad());
        assertEquals(0, accion2.getCantidad());
        assertEquals(0, accion3.getCantidad());
        assertEquals(50, accion1.getCotizacion());
        assertEquals(100, accion2.getCotizacion());
        assertEquals(1000, accion3.getCotizacion());
    }
}
