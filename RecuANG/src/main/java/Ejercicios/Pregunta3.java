package Ejercicios;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MapeoClases.Fabricantes;
import MapeoClases.HibernateUtil;

public class Pregunta3 {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/recuang";
	static final String USER = "RecuANG";
	static final String PASS = "1234";

	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction ts = s.beginTransaction();	
		
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		try {
//
//			Class.forName(JDBC_DRIVER);
//
//			System.out.println("Conectando a la base de datos...");
//			conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//			System.out.println("Inserte el nombre del programa sobre el quiere realizar ");
//			Scanner sc = new Scanner(System.in);
//			String programaBuscado = sc.nextLine();
//			String sql = "SELECT FABRICANTES.* FROM FABRICANTES "
//					+ "INNER JOIN DESARROLLA ON FABRICANTES.COD_FAB = DESARROLLA.COD_FAB "
//					+ "INNER JOIN PROGRAMAS ON DESARROLLA.COD_PRO = PROGRAMAS.COD_PRO " + "WHERE PROGRAMAS.NOMBRE = ?";
//			stmt = conn.prepareStatement(sql);
//			stmt.setString(1, programaBuscado);
//
//			ResultSet rs = stmt.executeQuery();
//
//			List<Fabricantes> fabricantes = new ArrayList<>();
//			int cont = 0;
//			while (rs.next()) {
//				Fabricantes fabricante = new Fabricantes();
//				fabricante.setCodFab(rs.getString("COD_FAB"));
//				fabricante.setNombre(rs.getString("NOMBRE"));
//				fabricante.setPais(rs.getString("PAIS"));
//				fabricantes.add(fabricante);
//				cont++;
//			}
//			System.out.println("El numero de programas que contenen ese nombre o version son: " + cont);
//			System.out.println("Fabricantes que desarrollan el programa '" + programaBuscado + "':");
//
//			for (Fabricantes fabricante : fabricantes) {
//				System.out
//						.println(fabricante.getCodFab() + ", " + fabricante.getNombre() + ", " + fabricante.getPais());
//
//			}
//
//			rs.close();
//			stmt.close();
//			conn.close();
//			sc.close();
//		} catch (SQLException se) {
//			se.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (stmt != null)
//					stmt.close();
//			} catch (SQLException se2) {
//			}
//			try {
//				if (conn != null)
//					conn.close();
//			} catch (SQLException se) {
//				se.printStackTrace();
//			}
//		}
//
//	}
}}