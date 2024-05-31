package OperacionesFicheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroDe30en30caracteres {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p2.txt");
		FileReader fr = new FileReader(f);
		char b[] = new char[2];
		int i;
		while((i = fr.read(b)) != -1) {
			System.out.println(b);
		}fr.close();
		
	}

}
