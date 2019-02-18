package dao;

import java.util.List;

public interface ImpClienteDAO {
	
	public boolean Crear ();
	public boolean Update();
	public boolean Borrar();
	public List <ClienteDAO> getList ();

}
