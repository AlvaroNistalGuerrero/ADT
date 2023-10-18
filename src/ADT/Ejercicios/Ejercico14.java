package ADT.Ejercicios;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejercico14 {
        public static void main(String[] args) {
            try {
                /*
                Pruebo a abrir el flujo y crearlo para leer tipos de datos primitivos.
                 */
                FileInputStream fileInputStream = new FileInputStream("NumerosBinarios(ejer13).bin");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);

                // Leo el double desde el archivo binario
                double numero = dataInputStream.readDouble(); //almaceno en la variable "numero".

                /*
                Cerrar flujos
                 */
                dataInputStream.close(); // entrada de datos.
                fileInputStream.close(); // entrada de archivos.

                System.out.println("Número guardado : " + numero);

            } catch (IOException e) {
                e.printStackTrace(); // Imprime el rastreo de la excepción.
            }
        }
}

