package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapseTest {
	DateLapse lapse;
	DateLapse lapse2;
	DateLapse lapse3;
	DateLapse lapse4;
	java.time.LocalDate date;
	
	@BeforeEach
	void setUp() {
		lapse = new DateLapse(java.time.LocalDate.of(1972, 12, 15), java.time.LocalDate.of(2032, 12, 15));
		lapse2 = new DateLapse(java.time.LocalDate.of(1972, 12, 14),10);
		lapse3 = new DateLapse(10, java.time.LocalDate.of(2032, 12, 15));
		lapse4 = new DateLapse(java.time.LocalDate.of(1972, 10, 15), java.time.LocalDate.of(1972, 12, 14));
		date = java.time.LocalDate.now();
	}
	
	@Test
	void setDates() {
		assertEquals(java.time.LocalDate.of(1972, 12, 15),lapse.getFrom());
		assertEquals(java.time.LocalDate.of(2032, 12, 15),lapse.getTo());
		assertEquals(java.time.LocalDate.of(1972, 12, 14),lapse2.getFrom());
		assertEquals(java.time.LocalDate.of(1972, 12, 24),lapse2.getTo());
		assertEquals(java.time.LocalDate.of(2032, 12, 5),lapse3.getFrom());
		assertEquals(java.time.LocalDate.of(2032, 12, 15),lapse3.getTo());
	}
	
	@Test
	void includesDateTest() {
		assertTrue(lapse.includesDate(date));
		assertTrue(lapse.includesDate(java.time.LocalDate.of(1972,12,16)));
		assertTrue(lapse.includesDate(java.time.LocalDate.of(2032,12,14)));
		assertFalse(lapse2.includesDate(date));
		assertTrue(lapse2.includesDate(java.time.LocalDate.of(1972,12,16)));
		assertTrue(lapse2.includesDate(java.time.LocalDate.of(1972,12,23)));
		assertFalse(lapse3.includesDate(date));
		assertTrue(lapse3.includesDate(java.time.LocalDate.of(2032,12,6)));
		assertTrue(lapse3.includesDate(java.time.LocalDate.of(2032,12,14)));
	}
	@Test
	void includesPeriodTest() {
		assertTrue(lapse.includesPeriod(lapse2));
		assertFalse(lapse.includesPeriod(lapse4));
	}
	@Test
	void sizeInDaysTest() {
		assertEquals(21915,lapse.sizeInDays());
		assertEquals(10,lapse2.sizeInDays());
		assertEquals(10,lapse3.sizeInDays());
	}
}
