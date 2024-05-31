package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BajarSalario {
	public static void main(String[] args) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Numero departamento al que quieres bajar el sueldo un 10%: ");
			int dept_no = sc.nextInt();

			String sql = String.format("UPDATE empleados SET salario = salario*0.9 WHERE dept_no =  ('%d')", dept_no);

			System.out.println(sql);

			Statement sentencia = conexion.createStatement();
			int filas = sentencia.executeUpdate(sql);
			
			if(filas>0) {
				System.out.println("Filas afectadas: " + filas);
			}else {
				System.out.println("Ya se ha borrado, no se encuentra ese numero de departamento");
				System.out.println("Filas afectadas: " + filas);
				
			}
			

			sentencia.close();
			conexion.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

}
