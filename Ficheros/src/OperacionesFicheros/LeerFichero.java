package OperacionesFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p2.txt");
		FileReader fr = new FileReader(f);
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char) i);
		}fr.close();
		
	}

}
