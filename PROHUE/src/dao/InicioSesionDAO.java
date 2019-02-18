package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import conexion.ConexionBD;
import modelo.Usuario;

public class InicioSesionDAO {
	public String autenticar(Usuario usuario) {
		String uname = usuario.getNombre();
		String pass = usuario.getPassword();

		Statement statement = null;
		ResultSet resultSet = null;
		
		String userNameDB = "";
		String passwordDB = "";
		String rolDB = "";
		String mensaje = "Invalid user credentials";
		

		try {
			
			ConexionBD con = new ConexionBD();
			statement = con.getConnection().createStatement();
			resultSet = statement.executeQuery("select nombre,password, email, rol from tbusuario");
			while (resultSet.next()) {
				userNameDB = resultSet.getString("nombre");
				passwordDB = resultSet.getString("password");
				rolDB = resultSet.getString("rol");
				resultSet.getString("email");
				
				if (uname.equals(userNameDB) && pass.equals(passwordDB) && rolDB.equals("admin")) {
					// mensaje = "Admin_Rol";
					return "Admin_Rol";

				} else if (uname.equals(userNameDB) && pass.equals(passwordDB) && rolDB.equals("usuario")) {
					// mensaje = "Usuario_Rol";
					return "Usuario_Rol";
				}
				// resultSet.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		// finally{
		// con.desconectar();
		//
		// }

		return mensaje;

	}
}
