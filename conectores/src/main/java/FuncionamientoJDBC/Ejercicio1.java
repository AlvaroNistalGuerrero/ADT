package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados","AlvaroDepEmple","1234");  
			Statement sentencia = c.createStatement();
			String sql = "SELECT * FROM departamentos";
			ResultSet Result =  sentencia.executeQuery(sql);
			while(Result.next()) {
				System.out.println(" Numero departamento : " + Result.getInt(1)+ "\nNumero empleado :  " 
			+ Result.getInt(2) + "\nApellido empleado " + Result.getString(3) + " \nNombre departamento: " + Result.getString(4)
						);
			}
			Result.close();
			sentencia.close();
			c.close();
		}catch (SQLException e) {
			System.out.println("Error de SQL");
		}
	}

}
