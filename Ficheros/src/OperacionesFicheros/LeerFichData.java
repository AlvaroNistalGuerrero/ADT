package OperacionesFicheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LeerFichData {
	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p3.dat");

		DataInputStream dataIS = new DataInputStream(new FileInputStream(f));

		String nom;
		int edad;
		try {
			while (true) {
				nom = dataIS.readUTF();
				edad = dataIS.readInt();
				System.out.println("Nombre : " + nom + " , Edad : " + edad);

			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro ningun fichero");
		} catch (EOFException eo) {
			dataIS.close();
		}


	}
}
