package FuncionamientoJDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class ClavesAjenas {
	public static void main(String[] args) {
		 try {
			 	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/departamentosempleados",
					"AlvaroDepEmple", "1234");
	            DatabaseMetaData metaData = connection.getMetaData();
	            ResultSet primaryKeyDep = metaData.getPrimaryKeys(null, null, "departamentos");
	            ResultSet foreignKeys = metaData.getExportedKeys(null, null, "empleados");
	            ResultSet primaryKeyEmp = metaData.getPrimaryKeys(null, null, "empleados");

	            String primaryKeyDepcolumns = "";
	            String primaryKeyEmpcolumns = "";
	            String foreignKeysColumns = "";
	            

	            while (primaryKeyDep.next()) {
	            	primaryKeyDepcolumns +=  primaryKeyDep.getString("COLUMN_NAME");
	                
	            }
	            while(primaryKeyEmp.next()) {
	            	primaryKeyEmpcolumns +=  primaryKeyEmp.getString("COLUMN_NAME");
	            	
	            }
	            while(foreignKeys.next()) {
	            	foreignKeysColumns +=  foreignKeys.getString("FKCOLUMN_NAME");
	            	
	            }
	            System.out.println("Departamentos:");
	            System.out.println("Clave Primaria: " + primaryKeyDepcolumns);
	            System.out.println("");
	            System.out.println("Empleados:");
	            System.out.println("Clave Primaria: " + primaryKeyEmpcolumns);
	            System.out.println("Clave Ajena: " + foreignKeysColumns);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
