package Ejecicio1;

import java.io.File;

public class Modificacion1 {
	public static void main(String[] args) {
		
			String dir = args[0];
			File f = new File(dir);
			if(f.exists()) {
				String[] archivos = f.list();
				System.out.println("ficheros en el dir actual: " + archivos.length);
				for (int i = 0; i < archivos.length; i++) {
					File f2 = new File(f,archivos[i]);
					System.out.println("Nombre: " + archivos[i] + "\n es fichero? : " + f2.isFile() + "\n es directorio? :" + f2.isDirectory());
				
			}
			}else {
				System.out.println("El archivo no existe");
			
		}
		
		
		

	}

}
