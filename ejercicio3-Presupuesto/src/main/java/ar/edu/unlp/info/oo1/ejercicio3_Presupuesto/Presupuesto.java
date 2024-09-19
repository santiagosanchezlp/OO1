package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto{
    private java.time.LocalDate fecha;
    private String cliente;
    private List<Item> items;
    
    public Presupuesto(String unCliente){
        this.fecha = LocalDate.now();
        this.items = new ArrayList<Item>();
        this.setCliente(unCliente);
    }
    
    public void setFecha(java.time.LocalDate unaFecha){
        this.fecha = unaFecha;
    }
    public java.time.LocalDate getFecha(){
        return this.fecha;
    }
    public void setCliente(String unCliente){
        this.cliente = unCliente;
    }
    public String getCliente(){
        return this.cliente;
    }
    public void vaciarItems(){
        
    }
    public void agregarItem (Item unItem){
        this.items.add(unItem);
    }
    public double calcularTotal(){
    	return this.items.stream().mapToDouble(Item::costo).sum();
    }
}