package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EvenNumberSetTest {
	private Set<Integer> numbers;
	
	@BeforeEach
	void setUp() {
		numbers = new EvenNumberSet<Integer>();
	}
	
	@Test
	void VacioTest() {
		assertTrue(numbers.isEmpty());
	}
	
	@Test
	void ImparTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		assertTrue(numbers.isEmpty());
	}
	
	@Test
	void UnParTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		assertTrue(numbers.contains(2));
		assertEquals([2], numbers.toArray());
		assertEquals(1,numbers.size());
	}
	
	@Test
	void DosParesTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		assertTrue(numbers.contains(2));
		assertTrue(numbers.contains(4));
	}
	
	@Test
	void RepetidoTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		numbers.add(2); // Es par, pero ya está en el set, no se agrega => [2, 4]
		assertTrue(numbers.contains(2));
		assertTrue(numbers.contains(4));
	}

}
