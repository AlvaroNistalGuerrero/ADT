package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio3 {
	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
						"AlvaroDepEmple", "1234");
			Statement statement = conexion.createStatement();
			String sql = "SELECT e.apellido, e.salario, e.dept_no "+ 
					"FROM empleados e INNER JOIN departamentos d ON e.dept_no=d.dept_no "+
					"WHERE e.salario = (SELECT MAX(salario) FROM empleados)";
			ResultSet result = statement.executeQuery(sql);
			
			
			while(result.next()) {
				String apellido = result.getString("apellido");
				float salario = result.getFloat("salario");
				int numero_departamento = result.getInt("dept_no");
				
				System.out.println("Apellido :" + apellido );
				System.out.println("Salario :" + salario);
				System.out.println("Numero departamento : " + numero_departamento);
				
			}
			conexion.close();
			statement.close();
			result.close();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
