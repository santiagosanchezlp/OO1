package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		assertEquals(1,numbers.size());
		Set<Integer> testSet = new HashSet<Integer>();
		testSet.add(2);
		assertEquals(testSet,numbers);
	}
	
	@Test
	void DosParesTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		Set<Integer> testSet = Stream.of(2, 4).collect(Collectors.toSet());
		assertEquals(testSet,numbers);
		assertTrue(numbers.contains(2));
		assertTrue(numbers.contains(4));
	}
	
	@Test
	void RepetidoTest() {
		numbers.add(1); // No es par, entonces no se agrega => []
		numbers.add(2); // Es par, se agrega al set => [2]
		numbers.add(4); // Es par, se agrega al set => [2, 4]
		numbers.add(2); // Es par, pero ya está en el set, no se agrega => [2, 4]
		Set<Integer> testSet = Stream.of(2, 4).collect(Collectors.toSet());
		assertTrue(numbers.contains(2));
		assertTrue(numbers.contains(4));
		assertEquals(testSet,numbers);
	}

}
