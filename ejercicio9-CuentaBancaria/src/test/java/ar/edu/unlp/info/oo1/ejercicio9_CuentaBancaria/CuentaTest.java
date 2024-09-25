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
public class CuentaTest {
	
	Cuenta CajaAhorro1, CuentaCorriente1, CajaAhorro2, CuentaCorriente2;
	
	@BeforeEach
	void setUp() throws Exception {
		CajaAhorro1 = new CajaDeAhorro();
		CuentaCorriente1 = new CuentaCorriente();
		CajaAhorro2 = new CajaDeAhorro();
		CuentaCorriente2 = new CuentaCorriente();
    	CajaAhorro2.depositar(200);
    	CuentaCorriente2.depositar(200);
    	CuentaCorriente2.setDescubierto(200);
	}
	
    @Test
    public void testAlta() {
        assertEquals(0, CajaAhorro1.getSaldo());
        assertEquals(0, CuentaCorriente1.getSaldo());
        assertEquals(0, CuentaCorriente1.getDescubierto());
    }
    @Test
    public void testDeposito() {

    	assertEquals(200, CajaAhorro2.getSaldo());
    	assertEquals(200, CuentaCorriente2.getSaldo());
    	assertEquals(200, CuentaCorriente2.getDescubierto());
    }

    @Test
    public void testExtraccion() {
    	assertFalse(CajaAhorro2.extraer(300));
    	assertTrue(CajaAhorro2.extraer(100));
    	assertTrue(CuentaCorriente2.extraer(300));
    	assertEquals(98,CajaAhorro2.getSaldo());
    	assertEquals(-106,CuentaCorriente2.getSaldo());
    	
    }
    @Test
    public void testTransferencia() {
    	assertFalse(CajaAhorro2.transferirACuenta(300,CajaAhorro1));
    	assertFalse(CajaAhorro2.transferirACuenta(300,CuentaCorriente1));
    	assertTrue(CuentaCorriente2.transferirACuenta(100,CajaAhorro1));
    	assertTrue(CuentaCorriente2.transferirACuenta(100,CuentaCorriente1));
    	assertEquals(98,CajaAhorro2.getSaldo());
    	assertEquals(-106,CuentaCorriente2.getSaldo());
    	
    }
}