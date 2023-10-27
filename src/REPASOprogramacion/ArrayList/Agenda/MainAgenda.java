package REPASOprogramacion.ArrayList.Agenda;

public class MainAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        Contacto c = new Contacto();
        a.añadirContacto(c);
        System.out.println(a.mostar());
        //System.out.println(a.buscar("44444444A"));
        System.out.println(a.eliminar("44444444A"));
        System.out.println(a.mostar());
    }
}
