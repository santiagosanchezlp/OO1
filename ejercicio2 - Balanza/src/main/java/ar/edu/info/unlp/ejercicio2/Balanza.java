package ar.edu.info.unlp.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;

	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto unProducto) {
		this.cantidadDeProductos++;
		this.precioTotal += unProducto.getPrecio();
		this.pesoTotal += unProducto.getPeso();
	}
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPrecioTotal(), this.getPesoTotal());
		return ticket;
	}
	
}

