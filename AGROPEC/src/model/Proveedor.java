package model;

import java.io.Serializable;

public class Proveedor extends Persona implements Serializable {
	
	Proveedor(){}

    public Proveedor(int id,String CIF, String nombre, String direccion, String email, int telefono) 
    {
        super(email,CIF, nombre, direccion,id, telefono);


    }
}
