package ADT.AcesosDirectos.Ejercicios;

import java.io.File;
import java.sql.SQLOutput;

public class VerInfoFichero {
    public static void main(String[] args) {
        System.out.println("INFORMACION DEL FICHERO");
        File f = new File("");
        if (f.exists()){
            System.out.println("Ruta: " + f.getPath() );
            System.out.println("Nombre: " + f.getName() );
            System.out.println("Se lee: " + f.canRead() );
            System.out.println("Se puede escribir:  " + f.canWrite() );
            System.out.println("Se puede ejecutar: " + f.canExecute());
            System.out.println("Tamaño: " + f.length());
            System.out.println(" Es un fichero: " + f.isFile() );
            System.out.println(" Es un directorio: " + f.isDirectory());
        }
    }
}
