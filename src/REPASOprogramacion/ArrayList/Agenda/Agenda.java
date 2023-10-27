package REPASOprogramacion.ArrayList.Agenda;

import java.util.ArrayList;
import java.util.Iterator;

/*
LinkedList es exactamente igual que un ArrayList
ya que es un array ordenado y un ArrayList siempre va añadiendo valores en orden
 */
public class Agenda {
    //Contacto [] contactos; si quisiesemos hacer un vector de obijetos
    //contactos = new Contacto[tam];
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<Contacto>();

    }

    public void añadirContacto(Contacto c) {

        contactos.add(c);
    }

    public String mostar() {
        /*
        1 forma de hacerlo
         */

//        String cadena ="";
//        for (int i = 0; i < contactos.size(); i++) {
//            cadena+= contactos.get(i).toString();  //  Metodo get equivale al corchete contactos[i] como si fuese un array
//
//        }
//        return cadena;

        /*
        2 forma de hacerlo
         */

//        String cadena ="";
//        for (Contacto c:contactos){
//            cadena+= c.toString();
//        }
//        return cadena;

        StringBuilder cadena = new StringBuilder();
        for (Contacto c : contactos) {
            cadena.append(c.toString());
        }
        return cadena.toString();
    }

    public String buscar(String dni) {
        String s = "No encontrado";
        for (Contacto c : contactos) {
            if (c.getDni().equals(dni)) {
                s = c.toString();
            }
        }
        return s;
    }
    public boolean eliminar(String dni){    //No recomendado usar un for each en un borrado
        Iterator it = contactos.iterator();
        while (it.hasNext()){   //HashNext para comprobar si hay mas elementos
            Contacto c = (Contacto) it.next();
            if(c.getDni().equals(dni)){
                it.remove();
                return true;
            }
        }
        return false;
        /*
        Existe un metodo de la clase Array que sirve para eliminar tambien ; remove(contactos.get(i)) o remove(i)
         */
//        for (int i = 0; i < contactos.size(); i++) {
//            if (contactos.get(i).getDni().equals(dni)){
//                remove(contactos.get(i))
//                  O de esta otra forma
//                remove(i)
//            }
        }
    }

