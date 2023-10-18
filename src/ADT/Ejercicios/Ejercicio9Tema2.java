package ADT.Ejercicios;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9Tema2 {
        public static void main(String[] args) {
            try {
                FileWriter fileWriter = new FileWriter("alumnos.txt"); // para escribir en el archivo "alumnos.txt".

                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // para mejorar el rendimiento de escritura.

                // Un array de strings que contiene los nombres de los compañeros.
                String[] compañeros = {
                        "Raul",
                        "María ",
                        "Luis ",
                        "Alba ",
                        "Saul ",
                        "Oscar ",
                        "Lucia ",
                        "Hugo "
                };

                /*
                Itero y escribo cada nombre en una nueva linea
                 */
                for (String c : compañeros) {
                    bufferedWriter.write(c);
                    bufferedWriter.newLine(); // Agrega una nueva línea después de cada nombre.
                }

                bufferedWriter.close(); // Cierra el BufferedWriter.
                fileWriter.close(); // Cierra el FileWriter.

                System.out.println("Archivo 'alumnos.txt' creado exitosamente."); // Muestro un mensaje de confirmación.

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

