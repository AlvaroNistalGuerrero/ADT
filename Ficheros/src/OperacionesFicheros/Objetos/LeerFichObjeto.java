package OperacionesFicheros.Objetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

public class LeerFichObjeto {
	public static void main(String[] args) throws IOException {

		Persona persona;

		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p5.dat");
		ObjectInputStream objectIS = new ObjectInputStream(new FileInputStream(f));

		int i = 1;
		try {
			while (true) {
				persona = (Persona) objectIS.readObject();
				System.out.println(i + "=>");
				i++;
				System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());

			}
		} catch (EOFException e) {
			System.out.println("FIN LECTURA FICHERO");
		} catch (StreamCorruptedException e) {
			System.out.println("Error de corrupción en el stream: " + e);
		} catch (FileNotFoundException e) {
			System.out.println("Error acceso fichero: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("Error clase no encontrada" + e);
			e.printStackTrace();
		}
		objectIS.close();

	}
}
