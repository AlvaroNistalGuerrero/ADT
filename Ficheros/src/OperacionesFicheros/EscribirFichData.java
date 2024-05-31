package OperacionesFicheros;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFichData {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p3.dat");

			DataOutputStream dataOS = new DataOutputStream(new FileOutputStream(f));
			
			String [] nombres = {"Pedro","Juan","Diana"};
			
			int [] edades = {23,98,20};
			
			for (int i = 0; i < edades.length; i++) {
				dataOS.writeUTF(nombres[i]);
				dataOS.writeInt(edades[i]);
				
			}
			dataOS.close();
		}catch (FileNotFoundException e) {
			System.out.println("No se encontro ningun fichero");
		} catch (IOException e) {
			System.out.println("ERROR ");
		}
	}

}
