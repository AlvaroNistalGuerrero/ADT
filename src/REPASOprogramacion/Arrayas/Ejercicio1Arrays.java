package REPASOprogramacion.Arrayas;

import java.util.Scanner;

/*
	 * Programa que realice las tareas siguientes:
	 *   • Crear un vector de números enteros de un tamaño especificado
	 *     por el usuario entre 10 y 1.000.000 de elementos.
	 *   • Llenar el vector con números aleatorios comprendidos entre -999.999
	 *     y 1.000.000 sin repetir ninguno.
	 *   • Mostrar en la consola los datos siguientes:
	 *       o Tamaño del vector.
	 *       o Tiempo empleado en llenarlo.
	 *       o Diferencia entre el menor y el mayor de los números almacenados.
	 *       o Tiempo empleado en calcular la diferencia entre el menor y el mayor
	 *         de los números almacenados.
*/
public class Ejercicio1Arrays {

    int [] numeros ;
    //Math.random()*2000001)-1000000;
    public void crearArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un tamaño para el array entre 10 y 1 millon: ");
        int tam = sc.nextInt();
        numeros = new int[tam];
    }
    public void rellenar() {
        long t1 = System.nanoTime();
        long t2 = 0;
        int n;
        int cont = 0;
        while(cont < numeros.length){
             n = (int) (Math.random()*2000001)-1000000;
             if(!buscar(n)){
                 numeros[cont] = n;
                 cont++;
             }

        }
        t2 = System.nanoTime();
        long tiempo = t2 - t1;
        System.out.println(" El tiempo es : " + tiempo + " nanosegundos");
    }

    private boolean buscar(int n) {
        boolean result = false;
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i] == n){
                result = true;
            }
        }
        return result;
    }
    public int maximo(){
        int max = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        return max;
    }
    public int minimo(){
        int min = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        return min;
    }

    public void operacion(int min, int max){
        long t2 = 0;
        long t1 = System.nanoTime();

        int suma = max - min ;

        t2 = System.nanoTime();
        long tiempo = t2 - t1;

        System.out.println("La difreencia entre el maximo y el minimo es : " + suma +
                                        "\n y ha durado " + tiempo + "nanosegundos");
    }

    public void mostar() {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }



    public static void main(String[] args) {
        Ejercicio1Arrays e = new Ejercicio1Arrays();
        e.crearArray();
        e.rellenar();
        e.mostar();
        System.out.println(" El tamaño del vector es : "+ e.numeros.length);
        e.operacion(e.minimo(), e.maximo());
    }



}
