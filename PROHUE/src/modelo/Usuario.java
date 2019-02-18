package modelo;

public class Usuario {

	private int idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String nombreusu;
    private String rol;
    
    
    
    public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombreusu() {
		return nombreusu;
	}
	public void setNombreusu(String nombreusu) {
		this.nombreusu = nombreusu;
	}
	

	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Usuario() {
		super();
	}
	public Usuario(int idUsuario, String nombre, String apellido, String email, String password, String nombreusu,
			String rol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.nombreusu = nombreusu;
		this.rol = rol;
	}
    

}
