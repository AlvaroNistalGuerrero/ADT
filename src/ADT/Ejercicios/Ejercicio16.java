package ADT.Ejercicios;


import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio16 {

        public static void main(String[] args) {
            List<Double> numeros = new ArrayList<>();

            try {
                FileInputStream fileInputStream = new FileInputStream("NumerosBinarios(ejer13).bin");
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);

                while (true) {
                    try {
                        double numero = dataInputStream.readDouble();
                        numeros.add(numero);
                    } catch (EOFException e) {
                        break; // Fin del archivo
                    }
                }

                // Cerrar flujos
                dataInputStream.close();
                fileInputStream.close();

                // Mostrar los números
                if (numeros.isEmpty()) {
                    System.out.println("No hay números almacenados.");
                } else {
                    System.out.println("Números almacenados:");
                    for (double numero : numeros) {
                        System.out.println(numero);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

