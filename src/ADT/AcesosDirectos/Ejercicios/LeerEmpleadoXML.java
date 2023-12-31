package ADT.AcesosDirectos.Ejercicios;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.plugin.dom.core.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LeerEmpleadoXML {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document  document = (Document) builder.parse(new File("Empleados.xml"));  // El metodo parse cooge el fichero y lo mete en una estructura de listas
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
                if(emple.getNodeType() == Node.ELEMENT_NODE){
                    Element elemento = (Element) emple;
                    System.out.printf("ID = %s &n ", elemento.getElementsByTagName("id").item(0).getTextContent() );
                    System.out.printf("* Apellido = %s &n ", elemento.getElementsByTagName("apellido").item(0).getTextContent() );
                    System.out.printf("* Departamento = %s &n ", elemento.getElementsByTagName("dep").item(0).getTextContent() );
                    System.out.printf("* Salario = %s &n ", elemento.getElementsByTagName("salario").item(0).getTextContent() );
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
