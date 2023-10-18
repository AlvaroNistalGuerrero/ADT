package REPASOprogramacion;

import java.util.Scanner;

/*
1- Programa que pide numero por teclado para con un numero negativo y calcula la media de los numero introducidos
2- Pedir lado del cuadrado por teclado y dibujarlo con asteriscos

 */
public class Prueba {

    public float mediaArit () {
        float suma = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        int num = 0;
        float media = 0;
        while (num >= 0) {
            System.out.println("Intoduzca un numero ");
            num = sc.nextInt();
            if (num >= 0){
                suma += num;
                cont++;

            }
        }
        media = suma / cont;
        System.out.println("La media artimetica es: ");
        return media;
    }
    public void cuadradoAsteriscos(int lado){
        for (int i = 0;i<lado; i++){

                for (int j = 0;j<lado; j++){
                    System.out.print(" * ");
                }
            System.out.println();
            }

        }
    public long aleatorio(int n1, int n2){
        long ale = (long) ((Math.random() * n2 - n1) + n1);  //Asi seria con la clase Math()
        //Random r = new Random();
        return ale;
                //r.nextInt(n2 - n1) + n1;
    }
    public boolean gustar(int n){ //Ejercicio 1 Examen Programacion  (1 Eva)
        int sumaP = 0;
        int sumaT = 0;
        boolean gustar = false;
        int sumaI = 0;
        int digito = 0;
        while (n>0){
            digito = n % 10;
            n = n /10;
            sumaP += digito % 2 == 0?digito:0;
            sumaI += digito % 2 == 0?0:digito;
            sumaT += digito;

        }
        gustar = sumaI>sumaP?true:n%2==0?true:sumaT%2==0?false:true;

        return gustar;
    }
    public void creaArray(int n){ //Ejercicio 1, apartado dos, Examen Programacion  (1 Eva)
        int[] caracteres = new int[20];
        int cont = 0;
        int digito = 0;
        while (n>0){
            digito = n % 10;
            n = n /10;
            caracteres[cont] =  digito;
            cont++;

        }
        for (int i = 0; i<cont; i++){                           // se le pasa com limite (i<cont) el contador para que solo se muestren
            System.out.print(caracteres[i] + " ");            //los espacios del array donde hemos almacenado un dato y no todos los espacios disponibles
        }                                                       // , asi en este caso en vez de retornar las 20 posiciones, retorna las posiciones no vacias
    }

    public static void main(String[] args) {
        //System.out.println("Introduce los limites");
        //Scanner sc = new Scanner(System.in);
        //int n1 = sc.nextInt();
        //int n2 = sc.nextInt();
        Prueba p = new Prueba();
        // System.out.println(p.mediaArit());
        //int lado = sc.nextInt();
        // p.cuadradoAsteris;
        //System.out.println(p.aleatorio(n1,n2));
        //p.aleatorio(n1,n2);
        //System.out.println(p.gustar(23545));
        p.creaArray(5464457);
    }
}

