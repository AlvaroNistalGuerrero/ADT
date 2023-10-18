package ADT.Ejercicios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int n;

        try {
            fos = new FileOutputStream("/Users/Alvaro/Desktop/PruebasADT/p2.txt");
            salida = new DataOutputStream(fos); // Creo un flujo de salida

            System.out.print("Introduce número entero. -1 para acabar: "); // Solicito al usuario que ingrese un número entero.
            n = sc.nextInt(); // Lee el número  y lo almacena en la variable "n".
            /*
            Bucle para leer numeros y añadirlos
             */
            while (n != -1) {
                salida.writeInt(n);
                System.out.print("Introduce número entero. -1 para acabar: ");
                n = sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { // Bloque "finally" para asegurarse de que los flujos se cierren correctamente, incluso si hay excepciones.
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) { // Captura y maneja una posible excepción de tipo IOException durante el cierre de flujos.
                System.out.println(e.getMessage());
            }
        }
    }
}