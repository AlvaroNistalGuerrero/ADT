package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BajarSalarioConSentenciaPreparada {
	public static void main(String[] args) {
		try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
                    "AlvaroDepEmple", "1234");

            Scanner sc = new Scanner(System.in);
            System.out.println("Número de departamento al que quieres bajar el sueldo un 10%: ");
            int dept_no = sc.nextInt();

            String sql = "UPDATE empleados SET salario = salario * 0.9 WHERE dept_no = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sql);
            preparedStatement.setInt(1, dept_no);

            int filas = preparedStatement.executeUpdate();

            if (filas > 0) {
                System.out.println("Filas afectadas: " + filas);
            } else {
                System.out.println("No se encontró ningún empleado en ese departamento.");
            }

            preparedStatement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
