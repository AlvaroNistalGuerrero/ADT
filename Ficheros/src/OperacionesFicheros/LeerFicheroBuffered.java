package OperacionesFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroBuffered {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p2.txt");

			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			String linea;
			while((linea = bf.readLine())!=null) {
				System.out.println(linea);
			}
			bf.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encontro ningun fichero");
		} catch (IOException e) {
			System.out.println("ERROR de E/S");
		}

	}

}
