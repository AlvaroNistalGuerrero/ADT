package ADT.Clases;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.plugin.dom.core.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

/*
Objetivo de cargar y leer el fichero xml
 */
public class LeerXMLDOM {

    ArrayList<Empleado> f = new ArrayList<>();

    public void LeerXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = (Document) builder.parse(new File("Empleados.xml"));  // El metodo parse cooge el fichero y lo mete en una estructura de listas
            document.getDocumentElement().normalize();
            /*
            A partir de aqui extraemos la
             */
            System.out.printf("Elemento raiz: %s %n", document.getDocumentElement().getNodeName());
            //crea lista con todos los nodos empleados
            NodeList empleados = document.getElementsByTagName("empleado");

            //recorrer lista
            for (int i = 0; i < empleados.getLength(); i++) {
                Node emple = empleados.item(i); // obtener un nodo empleado  / item(i) equivale al get del ArrayList
                if (emple.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) emple;
                    String id = elemento.getElementsByTagName("id").item(0).getTextContent();
                    String apellido = elemento.getElementsByTagName("apellido").item(0).getTextContent();
                    int dep = Integer.parseInt(elemento.getElementsByTagName("dep").item(0).getTextContent());
                    float salario = Float.parseFloat(elemento.getElementsByTagName("salario").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}


