package REPASOprogramacion.Arrayas;

/*
	 * Programa que cree dos vectores de números enteros, cada uno de ellos de una longitud aleatoria
	 * entre 10 y 100, los rellene con valores aleatorios entre 0 y 100, los ordene, los mezcle en un tercer vector
	 * manteniendo la ordenación y finalmente muestre el contenido de los tres vectores.
	 * Hacer un metodo que retorne la suma de todos los valores de del vector resultado
*/

import java.util.Arrays;

public class Ejercicio2Arrays {

    int [] n1 ;
    int [] n2;
    int [] result;
    public void crearArray(){
        int tam = (int) ((Math.random()*100-10)+10);
        int tam2 = (int) ((Math.random()*100-10)+10);
        int tamResult = tam + tam2;
        n1 = new int[tam];
        n2 = new int[tam2];
        result = new int[tamResult];
    }
    public void rellenar(){
        for (int i = 0; i < n1.length; i++) {
             n1[i] = (int) (Math.random()*100)+1; //si quiero que me llegue a 100 no le puedo restar 1
        }
        for (int i = 0; i < n2.length; i++) {
            n2[i] = (int) (Math.random()*100)+1; //si quiero que me llegue a 100 no le puedo restar 1
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random()*100)+1; //si quiero que me llegue a 100 no le puedo restar 1
        }
        System.out.println("vector 1: " + Arrays.toString(n1));
        System.out.println("vector 2: " + Arrays.toString(n2));
    }
    public void ordenar(){

        for (int i = 0; i < n1.length; i++) {
            result[i] = n1[i];
        }
        int aux = n1.length;
        for (int j = 0; j < n2.length; j++) {
            result[aux] = n2[j];
            aux++;
        }
        Arrays.sort(result);
        System.out.println("El array final ordenado es: " + Arrays.toString(result));
    }
    public int sumaArrayResultado(){
        int suma = 0;
        for (int i = 0; i < result.length; i++) {
            suma += result[i];
        }

        return suma;
    }



    public static void main(String[] args) {
        Ejercicio2Arrays e = new Ejercicio2Arrays();
        e.crearArray();
        e.rellenar();
        e.ordenar();
        System.out.println("El resultado de la suma de los valores del vector final (result) = " + e.sumaArrayResultado());

    }
}
