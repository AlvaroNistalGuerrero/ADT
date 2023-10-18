package ADT.Ejercicios;


import java.io.*;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        /*
        Variables a utilizar
         */
        String str, num;
        String sal = "";
        double x;
        /*
        Llamo a la clase BufferedReader y le paso mi fichero,con lo que empezare a leer el mismo
         */
        BufferedReader ent = new BufferedReader(new FileReader("C:\\Users\\Alvaro\\Desktop\\PruebasADT\\p1.txt"));
        String texto = "";
        String linea = ent.readLine();
        /*
        Con el siguiente while pretendo ir añadiendo a mi variable texto lo que se encuentre en el fichero
         */
        while (linea != null) {
            texto = texto + linea + "\n";
            linea = ent.readLine();

        }
        System.out.println(texto); //Muestro el texto que se econtraba en el fichero
        /*
        El siguiente tramo de codigo me srive para añadir texto al fichero
         */
        FileWriter fichero = new FileWriter("C:\\Users\\Alvaro\\Desktop\\PruebasADT\\p1.txt");
        PrintWriter pw = new PrintWriter(fichero);
        Scanner entradaEscaner = new Scanner (System.in);
        String entradaTeclado = entradaEscaner.nextLine();
        pw.append(" "+entradaTeclado);
        for (int i = 0; i < 10; i++)
            pw.println("Linea " + i);


        ent.close();//cerrar
    } // main
}// close

