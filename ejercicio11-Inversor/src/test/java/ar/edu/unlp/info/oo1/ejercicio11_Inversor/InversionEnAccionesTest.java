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
public class InversionEnAccionesTest {
	
	InversionEnAcciones accion1, accion2, accion3;
	
	@BeforeEach
	void setUp() throws Exception {
		accion1 = new InversionEnAcciones("Edenor");
		accion2 = new InversionEnAcciones("YPF");
		accion3 = new InversionEnAcciones("Globant");
		accion1.setCotizacion(50);
		accion2.setCotizacion(100);
		accion3.setCotizacion(1000);
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
    @Test
    public void testCompra() {
		accion1.compra(200);
		accion2.compra(300);
		accion3.compra(15000);
		assertEquals(200, accion1.getCantidad());
        assertEquals(300, accion2.getCantidad());
        assertEquals(15000, accion3.getCantidad());
        assertEquals(10000, accion1.valorActual());
        assertEquals(30000, accion2.valorActual());
        assertEquals(15000000, accion3.valorActual());
    }

    @Test
    public void testVenta() {
    	accion1.compra(200);
		accion2.compra(300);
		accion3.compra(15000);
		assertFalse(accion1.venta(300));
		assertTrue(accion2.venta(100));
		assertTrue(accion3.venta(1000));
		assertEquals(200, accion1.getCantidad());
        assertEquals(200, accion2.getCantidad());
        assertEquals(14000, accion3.getCantidad());
        assertEquals(10000, accion1.valorActual());
        assertEquals(20000, accion2.valorActual());
        assertEquals(14000000, accion3.valorActual());
    	
    }
    @Test
    public void testCotizacion() {
    	accion1.compra(200);
		accion2.compra(300);
		accion3.compra(15000);
		accion1.setCotizacion(1);
		accion2.setCotizacion(200);
		accion3.setCotizacion(100);
        assertEquals(200, accion1.valorActual());
        assertEquals(60000, accion2.valorActual());
        assertEquals(150000, accion3.valorActual());
    }
}