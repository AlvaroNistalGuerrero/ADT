package ADT.FicherosXML;

import org.xml.sax.SAXException;

import java.util.jar.Attributes;

public class PersonaTlfnoHandler {
    private final StringBuilder value;

    public PersonaTlfnoHandler(){
        this.value = new StringBuilder();
    }
    public void startDocument(){
        System.out.println("Comienzo de Personas Tlfno.XML");
    }
    public void endDocument(){
        System.out.println("Final PersonasTlfno.XML");
    }
    public void starElement(String uri, String localName, String qname, Attributes attributes) throws SAXException {
        this.value.setLength(0);
        if (qname.equals("persona")){
            String tfno = attributes.getValue("telefono");
            System.out.println("Atributo telefono: " + tfno);
        }
    }
    public void characters(char ch[], int start, int length) throws SAXException{
        this.value.append(ch, start, length);
    }
    public void endElements(String uri, String localName, String qName) throws SAXException{
        switch (qName){
            case"persona":
                System.out.println("");
                break;
            case "nombre":
                System.out.println("Nombre: " + this.value.toString());
                break;
            case "edad":
                System.out.println("Edad: " + this.value.toString());
        }
    }
}
