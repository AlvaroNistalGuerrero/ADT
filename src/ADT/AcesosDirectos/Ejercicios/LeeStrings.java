package ADT.AcesosDirectos.Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeeStrings {
    public static void main(String[] args) throws IOException {
        String str, num;
        String sal = "";
        double x;
        BufferedReader ent = new BufferedReader(new FileReader("C:\\Users\\Alvaro\\Desktop\\PruebasADT\\p1.txt"));
        String texto = "";
        String linea = ent.readLine();
        while (linea != null) {
            texto = texto + linea + "\n";
            linea = ent.readLine();
        }
        System.out.println(texto);
        ent.close();
    } // main
}// close