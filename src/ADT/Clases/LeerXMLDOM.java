package ADT.Clases;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

/*
Objetivo de cargar y leer el fichero xml
 */
public class LeerXMLDOM {

    ArrayList<Empleado> lista = new ArrayList<>();

    public void LeerXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document =  builder.parse(new File("file/Empleados.xml"));  // El metodo parse cooge el fichero y lo mete en una estructura de listas
            document.getDocumentElement().normalize();
            /*
            A partir de aqui extraemos la informacion
             */
            System.out.printf("Elemento raiz: %s %n", document.getDocumentElement().getNodeName());
            //crea lista con todos los nodos empleados
            NodeList empleados = document.getElementsByTagName("empleado");

            //recorrer lista
            for (int i = 0; i < empleados.getLength(); i++) {
                Node emple = empleados.item(i); // obtener un nodo empleado  / item(i) equivale al get del ArrayList
                if (emple.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) emple;
                    int id = Integer.parseInt(elemento.getElementsByTagName("id").item(0).getTextContent());
                    String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                    int dep = Integer.parseInt((elemento.getElementsByTagName("dep").item(0).getTextContent()));
                    float salario = Float.parseFloat((elemento.getElementsByTagName("salario").item(0).getTextContent()));
                    Empleado e = new Empleado(salario,id,apellido,dep);
                    lista.add(e);

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void mostrarLista(){
        StringBuilder empleados = new StringBuilder();
        for (Empleado l:lista) {
            empleados.append(l.toString());
        }
        System.out.println(empleados);
    }

    public static void main(String[] args) {
        LeerXMLDOM l = new LeerXMLDOM();
        l.LeerXml();
        l.mostrarLista();
    }
}


