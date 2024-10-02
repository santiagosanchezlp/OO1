package ar.edu.unlp.info.oo1.ejercicio9_CuentaBancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CuentaCorrienteTest {
	
	CuentaCorriente CuentaCorriente1, CuentaCorriente2;
	
	@BeforeEach
	void setUp() throws Exception {
		CuentaCorriente1 = new CuentaCorriente();
		CuentaCorriente2 = new CuentaCorriente();
    	CuentaCorriente2.depositar(100);
    	CuentaCorriente2.setDescubierto(500);
	}
	
    @Test
    public void testAlta() {
        assertEquals(0, CuentaCorriente1.getSaldo());
        assertEquals(0, CuentaCorriente1.getDescubierto());
    }
    @Test
    public void testDeposito() {
    	assertEquals(100, CuentaCorriente2.getSaldo());
    	CuentaCorriente2.depositar(200);
    	assertEquals(300, CuentaCorriente2.getSaldo());
    	assertEquals(500, CuentaCorriente2.getDescubierto());
    }

    @Test
    public void testExtraccion() {
    	assertTrue(CuentaCorriente2.extraer(100));
    	assertEquals(0,CuentaCorriente2.getSaldo());
    	assertTrue(CuentaCorriente2.extraer(400));
    	assertEquals(-400,CuentaCorriente2.getSaldo());
    	
    }
    @Test
    public void testTransferencia() {
    	assertTrue(CuentaCorriente2.transferirACuenta(100,CuentaCorriente1));
    	assertEquals(0,CuentaCorriente2.getSaldo());
    	assertEquals(100,CuentaCorriente1.getSaldo());
    	assertTrue(CuentaCorriente2.transferirACuenta(500,CuentaCorriente1));
    	assertEquals(-500,CuentaCorriente2.getSaldo());
    	assertEquals(600,CuentaCorriente1.getSaldo());
    	
    }
}