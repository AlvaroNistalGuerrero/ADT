package FuncionamientoJDBC;

import java.sql.*;

public class Ejercicio2 {
	public static void main(String[] args) {

		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");
			Statement statement = conexion.createStatement();
			String sql = "SELECT e.emp_no, e.apellido, d.dept_no, d.dnombre "
					+ "FROM empleados e " + "INNER JOIN departamentos d ON e.dept_no = d.dept_no";
			ResultSet resultado = statement.executeQuery(sql);

			

			while (resultado.next()) {
				int numeroEmpleado = resultado.getInt("emp_no");
				String apellido = resultado.getString("apellido");
				int numeroDepartamento = resultado.getInt("dept_no");
				String nombreDepartamento = resultado.getString("dnombre");

				System.out.println("Número de empleado: " + numeroEmpleado);
				System.out.println("Apellido: " + apellido);
				System.out.println("Número de departamento: " + numeroDepartamento);
				System.out.println("Nombre del departamento: " + nombreDepartamento);
				System.out.println();
			}

			resultado.close();
			statement.close();
			conexion.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}