package OperacionesFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFichBytes {
	public static void main(String[] args) {

		try {

			File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p3.dat");

			FileOutputStream fout = new FileOutputStream(f, true);
			FileInputStream fin = new FileInputStream(f);
			
			int i;
			for (i=1; i < 100; i++) {
				fout.write(i);
			}
			fout.close();
			
			while((i = fin.read())!= 1 ) {
				System.out.println(i);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro ningun fichero");
		} catch (IOException e) {
			System.out.println("ERROR ");
		}

	}

}
