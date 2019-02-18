package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Emmanuel
 */
public class ConexionBD {
//
//    private static Connection con = null;
//    private static String URL = "jdbc:mysql://localhost:3306/pruebas";
//    private static String USER = "root";
//    private static String PASSWORD = "root";
//
//    public static Connection getConexion() throws SQLException {
//        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        con = DriverManager.getConnection(URL, USER, PASSWORD);
//        return con;
//
//    }

	
	Connection connection = null;
    String BD = "pruebas";
    String driverClassName = "com.mysql.jdbc.Driver";
    String driverUrl = "jdbc:mysql:///" + BD;
    String user = "root";
    String password = "root";

    public ConexionBD() {
        try {
            Class.forName(driverClassName);
            connection = (Connection) DriverManager.getConnection(driverUrl, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException E) {
            System.out.println("Excepcion SQL: " + E.getMessage());
            System.out.println("Estado SQL: " + E.getSQLState());
            System.out.println("Código del Error: " + E.getErrorCode());
        } catch (Exception E) {
            System.out.println("Otro problema: " + E);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
            connection = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}