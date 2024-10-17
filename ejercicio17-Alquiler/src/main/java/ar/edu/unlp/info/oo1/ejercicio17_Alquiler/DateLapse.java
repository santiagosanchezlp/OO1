package ar.edu.unlp.info.oo1.ejercicio17_Alquiler;

public class DateLapse {
	private java.time.LocalDate from;
	private java.time.LocalDate to;
	
	public DateLapse(java.time.LocalDate from, java.time.LocalDate to) {
		this.setFrom(from);
		this.setTo(to);
	}
	public DateLapse(java.time.LocalDate from, int sizeInDays) {
		this.setFrom(from);
		this.to = this.from.plusDays(sizeInDays);
	}
	public DateLapse(int sizeInDays, java.time.LocalDate to) {
		this.setTo(to);
		this.from = this.to.minusDays(sizeInDays);
	}
	
	public java.time.LocalDate getFrom() {
		return this.from;
	}

	public void setFrom(java.time.LocalDate from) {
		this.from = from;
	}

	public java.time.LocalDate getTo() {
		return this.to;
	}

	public void setTo(java.time.LocalDate to) {
		this.to = to;
	}
	public int sizeInDays() {
		return (int) this.from.until(this.to,java.time.temporal.ChronoUnit.DAYS);
	}
	public boolean includesDate(java.time.LocalDate other) {
		return other.isAfter(this.from) && other.isBefore(this.to);
	}
	public boolean includesPeriod(DateLapse unPeriodo) {
		return !(this.to.isBefore(unPeriodo.getFrom()) || this.from.isAfter(unPeriodo.getTo()));
	}
}
