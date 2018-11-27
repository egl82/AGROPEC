package model;

public class Persona {

	private String CIF;
	private String nombre;
	private String email;
	private String direccion;
	private int telefono; 
	private int id;
	
	
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		this.CIF = cIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Persona(String cIF, String nombre, String email, String direccion, int telefono, int id) {
		super();
		this.CIF = cIF;
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.id = id;
	}
	public Persona() {
		super();
	}
	
	
	
	

}
