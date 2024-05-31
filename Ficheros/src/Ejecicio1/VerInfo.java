package Ejecicio1;

import java.io.File;

public class VerInfo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p1.txt");
		if(f.exists()) {
			System.out.println("Nombre :" + f.getName());
			System.out.println("Ruta :" + f.getPath());
			System.out.println("Ruta :" + f.getAbsolutePath());
			System.out.println("Se puede leer:" + f.canRead());
			System.out.println("Se puede ecribir :" + f.canWrite());
			System.out.println("Tamaño :" + f.length());
			System.out.println("Es un dir :" + f.isDirectory());
			System.out.println("Es un fich :" + f.isFile());
			System.out.println("Nombre dir padre :" + f.getParent());
			
			
			
		}
	}
}