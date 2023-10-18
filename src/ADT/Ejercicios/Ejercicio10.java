package ADT.Ejercicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio10 {

        public static void main(String[] args) {
            String nombreArchivo = "alumnos.txt";

            try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                int totalCaracteres = 0;
                int totalPalabras = 0;
                int totalLineas = 0;
                /*
                While diseñado para leer todas las líneas del archivo, contar cuántas líneas hay (totalLineas)
                y calcular la cantidad total de caracteres en el archivo
                 */
                while ((linea = reader.readLine()) != null) {
                    totalLineas++;
                    totalCaracteres += linea.length();

                    /*
                    para contar las palabras separadas por espacios
                     */
                    String[] palabras = linea.split(" ");
                    totalPalabras += palabras.length;

                    System.out.println(linea);

                    if (totalLineas % 20 == 0) {
                        System.out.println("Presiona Enter para continuar");
                        System.in.read(); // Esperar a que el usuario presione Enter
                    }
                }
                /*
                MOstrar los resultados
                 */
                System.out.println("Total de líneas: " + totalLineas);
                System.out.println("Total de caracteres: " + totalCaracteres);
                System.out.println("Total de palabras: " + totalPalabras);

            } catch (IOException e) { //Ver si lee el archivo
                System.err.println("Error lectura del archivo : " + e.getMessage());
            }
        }
    }

