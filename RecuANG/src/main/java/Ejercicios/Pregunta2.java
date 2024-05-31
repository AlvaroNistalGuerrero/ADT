package Ejercicios;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import MapeoClases.Fabricantes;
import MapeoClases.HibernateUtil;

public class Pregunta2 {
	public static void main(String[] args) {

		SessionFactory s = HibernateUtil.getSessionFactory();
		Session ss = s.openSession();
		Transaction ts = ss.beginTransaction();		// Los errores quedan en el "bloque" ts y no dañan el resto de codigo o la db (consistencia)
				
		try {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el código del fabricante:");
			String codFab = sc.nextLine();
			System.out.println("Ingrese el nombre del fabricante:");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el país del fabricante:");
			String pais = sc.nextLine();
			
			Fabricantes FabricanteExistente = ss.get(Fabricantes.class, codFab);
			
            if (FabricanteExistente != null) {
                System.out.println("Hay una Primary Key , con mismos valores");
                return; 
            }
//			
			Fabricantes fabricante = new Fabricantes();
			fabricante.setCodFab(codFab);
			fabricante.setNombre(nombre);
			fabricante.setPais(pais);
			fabricante.setPais(pais);

			ss.persist(fabricante);

			ts.commit();
			System.out.println("Fabricante insertado correctamente.");

		} catch (HibernateException e) {
			if (ts != null) {
				ts.rollback();
			}
			e.printStackTrace();
		
		} finally {

			if (ss != null) {
				ss.close();
			}
			if (ss != null) {
				ss.close();
			}

		}
	}

}
