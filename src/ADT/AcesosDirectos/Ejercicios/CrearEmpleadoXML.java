package ADT.AcesosDirectos.Ejercicios;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class CrearEmpleadoXML {
    public static void main(String args[]) throws IOException, ParserConfigurationException {
        File fichero = new File(" I: C:\\Users\\Alvaro\\AlvaroNistal\\src\\ADT\\Empleados.xml");
        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        int id, dep, posicion = 0; //para situacnos al principio del fichero
        Double salario;
        char apellido[] = new char[10], aux;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        // Creamos una instancia de DocumentBuilderFactory para creac el parser. fotce try-catch
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
        //Sceamos un documento vacio de nombre document, con el nodo caiz de nombre Empleados y asisnamos. La version XML (1.0)
        //la intecfaz DOMImplementation permite crea objetos Document con nodo raiz
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document =  implementation.createDocument(null, "Empleados", null);
            document.setXmlVersion("1.0");

            for (;;) {
                file.seek(posicion); //nos posisionamos.
                id = file.readInt(); // obtengo id de empleado

                for (int i = 0; i < apellido.length; i++) {
                    aux = file.readChar();
                    apellido[i] = aux;
                }
                String apellidos = new String(apellido);
                dep = file.readInt();
                salario = file.readDouble();

                if (id > 0) { //id validos a partir de 1
                    Element raiz = document.createElement("empleado"); //Creamos nodo empleado
                    document.getDocumentElement().appendChild(raiz);

                    CrearElemento("id",Integer.toString(id), raiz, document); //añadir ID
                    CrearElemento("apellido",apellidos.trim(), raiz, document); //añadir APELLIDO
                    CrearElemento("dep",Integer.toString(dep), raiz, document);//añadir DEP
                    CrearElemento("salario",Double.toString(salario), raiz, document); //añadir SALARIO

                }
                posicion = posicion + 36;//psosiono en el siguiente empleado
                if(file.getFilePointer() == file.length())break;
            }//cierra for recorre fichero
            //Crear XML a partir del documento
            Source source = new DOMSource(document);
            //Crear el resultado en e fichero Empleados.xml
            Result result = new StreamResult(new java.io.File("Empleados.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        }catch(Exception e){
            System.err.println("Error: "+e);
        }
        file.close();
    }

     static void CrearElemento(String datoEmple, String valor, Element raiz, Document document) {
        Element elem = document.createElement(datoEmple); //Creamos un hijo
        Text text = document.createTextNode(valor); //damos valor
        raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
        elem.appendChild(text); //pegamos el valor al elemento

    }
}//fin
