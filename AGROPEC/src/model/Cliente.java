package model;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable {
	
	
	 public Cliente() {}

	    public Cliente(int id,String CIF, String nombre,String direccion, String email, int telefono) 
	    {
	        super(email,CIF, nombre, direccion,id, telefono);
	    }
	    

}
