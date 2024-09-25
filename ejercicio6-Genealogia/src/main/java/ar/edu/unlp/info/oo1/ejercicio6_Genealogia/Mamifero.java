package ar.edu.unlp.info.oo1.ejercicio6_Genealogia;

public class Mamifero{
    private String identificador;
    private String especie;
    private java.time.LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;
    
    public Mamifero() {
    	
    }
    
    public Mamifero(String unIdentificador) {
    	setIdentificador(unIdentificador);
    }
    
    public Mamifero(String unIdentificador, String unaEspecie, java.time.LocalDate unaFecha){
        setIdentificador(unIdentificador);
        setEspecie(unaEspecie);
        setFechaNacimiento(unaFecha);
    }
    
    public String getIdentificador(){
        return this.identificador;
    }
    public void setIdentificador(String unIdentificador){
        this.identificador = unIdentificador;
    }
    public String getEspecie(){
        return this.especie;
    }
    public void setEspecie(String unaEspecie){
        this.especie = unaEspecie;
    }
    public java.time.LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(java.time.LocalDate unaFecha){
        this.fechaNacimiento = unaFecha;
    }
    public Mamifero getPadre(){
        return this.padre;
    }
    public void setPadre(Mamifero unMamifero){
        this.padre = unMamifero;
    }
    public Mamifero getMadre(){
        return this.madre;
    }
    public void setMadre(Mamifero unMamifero){
        this.madre = unMamifero;
    }
    public Mamifero getAbueloPaterno(){
        if (this.getPadre() != null)
        	return this.getPadre().getPadre(); 
        return null;
    }
    public Mamifero getAbueloMaterno(){
    	if (this.getMadre() != null)
        	return this.getMadre().getPadre(); 
        return null;   
    }
    public Mamifero getAbuelaPaterna(){
    	if (this.getPadre() != null)
        	return this.getPadre().getMadre(); 
        return null;    
    }
    public Mamifero getAbuelaMaterna(){
    	if (this.getMadre() != null)
        	return this.getMadre().getMadre(); 
        return null;     
    }
    public boolean tieneComoAncestroA(Mamifero unAncestro){
        if (unAncestro == null)
        	return false;
    	if ((this.getPadre() == unAncestro) || ((this.getMadre() == unAncestro)))
        	return true;
        return (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unAncestro) || 
        		this.getMadre() != null && this.getMadre().tieneComoAncestroA(unAncestro));
    }
}
