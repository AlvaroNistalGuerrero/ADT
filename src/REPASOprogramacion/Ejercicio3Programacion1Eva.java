package REPASOprogramacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3Programacion1Eva {

    String [] palabras ;
    char [] vocal = {'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Í','Ó','Ú','ü','Ü'};

    public void crearArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el tamaño del vector");
        int tamaño = sc.nextInt();
        palabras = new String[tamaño];

    }
    /*
    En caso de que el enunciado se refiera a la entrada de una cadena de palabras(un String con muchas palabras,una frase)
    habria que hacerlo de la siguiente manera
     */
//    public void cadenas(){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce una secuencia de cadenas");
//        String linea = sc.nextLine();
//        //String[] cadenas = linea.split(" ");  // a este metodo split se le pasa el separador, y este, crea un vector con cada `palabra cortando los espacios    }
//        Arrays.sort(cadenas);
    //}
    public void rellenar() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Añade palabras al vector : ");
            String words = sc.nextLine();
            palabras[i] = words;

        }
    }

    public void mostarOrdenAlfabetico() {
        Arrays.sort(palabras); //Tiene que hacerlo fuera del for ya que si no me iria ordenando en tiempo de ejecucion.
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
    public float cifrar(){
        float vocales = 1;
        float consonantes = 1;
        for (int i = 0; i < palabras.length; i++) {
            String p = palabras[i];
            for (int j = 0; j < p.length(); j++) { // length() con parentesis ya que es un String y no una cadena
                char c = p.charAt(j);
                if(buscarVocal(c) == true) {
                    vocales += vocales * ((float) p.length());
                }else {
                    consonantes += consonantes / ((float) p.length());
                }
            }
        }
        return vocales+consonantes;
    }

    private boolean buscarVocal(char c) {
        boolean result ;
        for (int i = 0; i < vocal.length ; i++) {
            if (c == vocal[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Ejercicio3Programacion1Eva ej = new Ejercicio3Programacion1Eva();
        ej.crearArray();
        ej.rellenar();
        ej.mostarOrdenAlfabetico();
        System.out.println(ej.cifrar());
    }
}
