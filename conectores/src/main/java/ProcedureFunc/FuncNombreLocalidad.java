package ProcedureFunc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class FuncNombreLocalidad {
	public static void main(String[] args) {
        try {
            
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el departamento del cual quiere saber el nombre y la localidad: ");
            String dep = sc.nextLine();  
            
            String sql = "{ ? = call nombre_dep(?, ?) }"; 
            
            CallableStatement llamada = conexion.prepareCall(sql);
            
            
            llamada.registerOutParameter(1, Types.VARCHAR); 
            llamada.setInt(2, Integer.parseInt(dep));
            llamada.registerOutParameter(3, Types.VARCHAR); 
            
            llamada.executeUpdate();
            
            System.out.printf("Nombre Dep: %s, Localidad: %s%n", 
                              llamada.getString(1), llamada.getString(3));
            
            llamada.close();
            conexion.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
} 
