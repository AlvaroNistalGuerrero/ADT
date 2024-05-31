package OperacionesFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirEnUnFichero {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Tarde\\Desktop\\PruebaFicheros\\p2.txt");
			FileWriter fr = new FileWriter(f,true);	//El true es para no machacar
			System.out.println("Inserte las modificaciones del fichero : ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			char[] c = str.toCharArray();
			fr.append("\n");
			for (int i = 0; i < c.length; i++) {
				fr.write(c[i]);
			}
		
			fr.append("*");
			
			//Añade otra línea al fichero de modo que se escriba todo el array (utiliza fic.write(cad))
			/*
			 * 	fr.write("\n");
			 *	fr.write(c);
			 *  String end ="\n *esto es lo ultimo*";
			 *	fr.write(end);
			 */
			
			
			//Añade el contenido de un array de String (utiliza fic.write (nombarray[i]))
			/*
			 * String prov[] = {"Leon","Huelva"};
			 *  fr.write("\n");
			 *
			 *	for (int i = 0; i < prov.length; i++) {
			 *	 fr.write(prov[i]);
			 *	 fr.write("\n");
				}
			 */
			
			
			fr.close();
				
			}catch (IOException e) {
				System.out.println("Hubo un error");
			}
		
		}

		}
			
		
		

