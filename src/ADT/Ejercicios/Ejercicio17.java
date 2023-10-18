package ADT.Ejercicios;


import java.io.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            /*
            Registro la frase
             */
            System.out.print("Escribe una frase: ");
            String frase = reader.readLine();

            FileOutputStream fileOutputStream = new FileOutputStream("f.bin");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeUTF(frase);
            /*
            Cierro los fluijos

             */
            dataOutputStream.close();
            fileOutputStream.close();

            System.out.println("Frase guardada en el archivo 'f.bin'.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        Realizo el siguiente try/catch para comprobar la frase guardada y mostrarla por pantalla
         */
        try {
            FileInputStream fileInputStream = new FileInputStream("f.bin");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            String frase = dataInputStream.readUTF();

            dataInputStream.close();
            fileInputStream.close();

            System.out.println("La frase guardada es: " + frase);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
