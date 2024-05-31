package OperacionesFicheros.Objetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirFichObjeto {
	public static void main(String[] args) throws IOException {

		Persona persona;

		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p5.dat");

		try {
			ObjectOutputStream objectOS;
			if (!f.exists()) {
				// Si el fichero no existe crea un ObjectOutputStream, la primera vez
				FileOutputStream fileout = new FileOutputStream(f);
				objectOS = new ObjectOutputStream(fileout);
			} else {

				objectOS = new ClaseParaQueNoSalteException(new FileOutputStream(f,true));
			}

			String nombres[] = { "Juan", "Alvaro", "Raul", "Pedro", "Jonny", "Pepe" };
			int edades[] = { 21, 87, 2, 8, 12, 34 };

			System.out.println("GRABO LOS DATOS DE PERSONA");
			for (int i = 0; i < edades.length; i++) {
				persona = new Persona(nombres[i], edades[i]);
				objectOS.writeObject(persona);
				System.out.println("GRABO LOS DATOS DE PERSONA");

			}

		} catch (EOFException e2) {
			System.out.println("Error E/S" + e2);

		} catch (FileNotFoundException e) {
			System.out.println("Error acceso fichero" + e);

		}
	}

}
