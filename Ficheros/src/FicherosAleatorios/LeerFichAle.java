package FicherosAleatorios;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeerFichAle {
	public static void main(String[] args) throws FileNotFoundException {
	        File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p6Aleatorio.dat");

	        RandomAccessFile file = new RandomAccessFile(f, "r");
	        int id,dep,posicion;
	        char apellido[] = new char[10];
	        Double salario;
	        
	        boolean finarchivo = false;
	        char aux;
	        posicion=0;
	        
	        do {
	        	try {
	        		file.seek(posicion);//nos posicionamos en posicion
	        		id = file.readInt();
	        		
	        		for (int i = 0; i < apellido.length; i++) {
						aux = file.readChar();
						apellido[i] = aux;
					}
	        		String apellidos = new String(apellido);
	        		dep = file.readInt();
	        		salario = file.readDouble();
	        		
	        		if(id>0) {
	        			System.out.println("ID: " + id + "Apellido: " + apellidos.trim() + "Dep: " + dep + "Salario: " + salario);
	        			
	        			posicion = posicion+36; //Cada empleados ocupa 36 bytes, asi que me posiciono en el siguiente
	        		}
	        		}catch (EOFException e) {
						finarchivo = true;
						try {
							file.close();
						} catch (IOException e1) {
							System.out.println("Error de cerrado");
							e1.printStackTrace();
						}
					} catch (IOException e) {
					
						e.printStackTrace();
					}
	        		
	        	}while(!finarchivo);
	        
	            
	            
	    }

}
