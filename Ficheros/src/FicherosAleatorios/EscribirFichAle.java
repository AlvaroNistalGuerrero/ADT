package FicherosAleatorios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFichAle {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p6Aleatorio.dat");
		
		RandomAccessFile file = new RandomAccessFile(f, "rw");
		
		String apellido[] = {"Gerez","Alvarez","Lopez"};
		
		int dep[] = {1,2,1};
		Double sueldo[] = {1200.50,2780.00,2000.42};
		
		StringBuffer buffer = null; //almacena apellido
		int n= apellido.length;
		
		for (int i = 0; i < n; i++) {
			file.writeInt(i+1);
			buffer = new StringBuffer(apellido[i]);
			buffer.setLength(10);
			file.writeChars(buffer.toString());
			file.writeInt(dep[i]);
			file.writeDouble(sueldo[i]);
			
			
		}
		file.close();

	}
	
	
}
