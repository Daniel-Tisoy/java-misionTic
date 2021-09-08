package javaDataBase;

import java.sql.*;
public class PruebaBaseDatos {

	public static void main(String[] args) {
		try {
			int identificacion;
			String nombres, correo, cargo;
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/proyecto_SistemaYRedes";
			Connection conexion = DriverManager.getConnection(url, "root", "usuario1");
			String sentencia = "SELECT * FROM administradores";
			Statement consulta = conexion.createStatement();
			ResultSet resultados = consulta.executeQuery(sentencia);
			while (resultados.next()) {
				identificacion = resultados.getInt("id_admin");
				nombres = resultados.getString("nom_admin");
				correo = resultados.getString("cor_admin");
				cargo = resultados.getString("car_admin");
				System.out.println("--------------");
				System.out.println("cc" + identificacion+ "\nNombres: "+
				nombres+"\nCorreo: "+correo+"\nCargo: "+cargo);
				 
			 }
			conexion.close();
			
		/*}catch(ClassNotFoundException e) {
			System.out.println("__|__");*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
