package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertarDep {
	public static void main(String[] args) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Numero departamento");
			int dept_no = sc.nextInt();
			System.out.println("Nombre departamento");
			String enter = sc.nextLine();
			String dnombre = sc.nextLine();
			System.out.println("Localizacion departamento");
			String loc = sc.nextLine();

			String sql = String.format("INSERT INTO departamentos VALUES ('%d', '%s', '%s')", dept_no, dnombre, loc);

			System.out.println(sql);

			Statement sentencia = conexion.createStatement();
			int filas = sentencia.executeUpdate(sql);

			System.out.println("Filas afectadas: " + filas);

			sentencia.close();
			conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
