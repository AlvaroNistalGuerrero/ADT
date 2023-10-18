package ADT.AcesosDirectos.Ejercicios;

import java.io.File;

public class
MostrarFicherosDirectorioActual {
    public static void main(String[] args) {
        String dir = " "; //para añadir el directorio con los ficheros que queremos que se muestren
        File f = new File(dir);//creamos el fichero
        if (dir == " ") {
            System.out.println("HAY QUE INTRODUCIR UN DIRECTORIO....");
        }
        if (f.exists()) {


            String[] archivos = f.list();
            System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
            /*
             * A continuacion realizo un bucle para ir secuenciando los archivos a mostrar
             * */
            for (int i = 0; i < archivos.length; i++) {
                File f2 = new File(f, archivos[i]);
                System.out.printf("nombre: %s, es fichero?: %b, es directotio?:");

            }

        } else {
            System.out.println("Directorio no existe");
        }
    }
}
