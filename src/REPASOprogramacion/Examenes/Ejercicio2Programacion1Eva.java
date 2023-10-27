package REPASOprogramacion.Examenes;

import java.text.DecimalFormat;

public class Ejercicio2Programacion1Eva {
    private float[] numeros;


    public void crearArray() {
        int tamaño = (int) ((Math.random() * 41) + 10);
        numeros = new float[tamaño];

    }

    public void rellenar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (float) ((Math.random() * 2001) - 1000);

        }
    }

    public void mostar() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    private float numMax() {
        float max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > max) {
                max = numeros[i];
            }

        }
        return max;
    }


    public float sumaNumeros() {

        float suma = 0;
        float max = numMax();

        for (int i = 0; i < numeros.length; i++) {

            suma += numeros[i];
            if (suma > (max / 2)) {
                suma = (suma * 0.3333f);
                return suma;
            }
        }
        //System.out.print("La suma de los todos los valores del array es: ");
        return (suma * 0.6666f);
    }
    public String convertidor(float n){     //Metodo con Decimal format que sirve para elegir el numero de decimales que queremos que se muestren (devuelve String)
        DecimalFormat nformat = new DecimalFormat("#.##");      // Al poner . las dos almohadillas, le digo que me lo guarde en memoria como un float con dos decimales
        String cadena = nformat.format(n);
        System.out.print("El valor de la suma con dos decimales : ");
        return cadena; //Si le hacemos ParseFloat en caso de que nos pida un float con exactamente dos decimales
    }


    public static void main(String[] args) {
        Ejercicio2Programacion1Eva e = new Ejercicio2Programacion1Eva();
        e.crearArray();
        e.rellenar();
        e.mostar();
        System.out.println("");
        //System.out.print(e.sumaNumeros());
        System.out.println(e.convertidor(e.sumaNumeros()));
        //e.sumaNumeros();

    }

}
