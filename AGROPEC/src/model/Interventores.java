package model;

public class Interventores extends Persona {
	
	String apellidos;
	 public Interventores(int id, String nombre,String apellidos) {
	       
	        super("","", nombre, "",id, 0); // NLE
	        this.apellidos=apellidos;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }
	    
	



}
