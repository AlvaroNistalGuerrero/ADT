package ADT.Ejercicios;

        import java.io.DataOutputStream;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.util.Scanner;


public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un double: ");
        double numero = scanner.nextDouble(); // Lee el número double ingresado por el usuario y lo almacena en la variable "numero".

        try {


            /*
             Se crea un flujo de salida de datos que es capaz de escribir
             en un archivo binario llamado "NumerosBinarios(ejer13).bin".
             */
            FileOutputStream fileOutputStream = new FileOutputStream("NumerosBinarios(ejer13).bin");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeDouble(numero); // Escribe el número double en el archivo binario.

            dataOutputStream.close(); // Cierra el flujo de salida de datos.
            fileOutputStream.close(); // Cierra el flujo de salida de archivos.

            System.out.println("Numero guadado en 'NumerosBinarios(ejer13).bin' con exito"); // Muestra un mensaje de confirmación.

        } catch (IOException e) { // Captura y maneja una posible excepción de tipo IOException.
            e.printStackTrace(); // Imprime el rastreo de la excepción.
        }
    }
}