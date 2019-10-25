package ConexionBD;

import java.sql.*;


//Hola mundo

import javax.swing.JOptionPane;

public  class Conexion {
	private static String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static String URL = "jdbc:sql//localhost:3306/INVENTARIO";
	private static String USUARIO = "root";
	private static String CLAVE = "1234";
	

	public Connection conectar() {
		Class.forName(CONTROLADOR);
        Conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
        System.out.println("Conexión OK");
	}

	private void Conectar() {
		try {
			
		} catch (ClassNotFoundException  e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("error en la conexion");
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		if (connection==null){ this.Conectar(); } return connection;
	}

	public void desconectar() throws SQLException {
		connection.close();
	}
}