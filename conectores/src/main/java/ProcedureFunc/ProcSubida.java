package ProcedureFunc;

import java.sql.*;
import java.util.Scanner;

public class ProcSubida {
    public static void main(String[] args) {
        try {
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");

            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el departamento del cual quiere subir el salario");
            String dep = sc.nextLine(); 
            System.out.println("¿Cuánto lo subimos? ");
            String subida = sc.nextLine(); 

            String sql = "{ call subida_sal(?, ?) }";

            CallableStatement llamada = conexion.prepareCall(sql);

            llamada.setInt(1, Integer.parseInt(dep)); 
            llamada.setFloat(2, Float.parseFloat(subida)); 

            llamada.executeUpdate();

            System.out.println("Subida realizada....");

            llamada.close();
            conexion.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
