package REPASOprogramacion.ArrayList.Agenda;

public class Contacto {

    private String nombre;
    private String correo;
    private int edad;
    private String dni;

    /*
    Contructores
     */
    public Contacto() {
        this.nombre = "Saul";
        this.correo = "saulcorre@gmail.com";
        this.edad = 33;
        this.dni = "44444444A";
    }

    public Contacto(String nombre, String correo, int edad, String dni) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {       //Tener en cuenta que es util
            this.nombre = nombre;
        }

    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    @Override       //Estamos redefiniendo el metodo toString de la clase java.lang.Object, que es la clase padre de java
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public String getNombre() {

        return nombre;
    }

    public String getCorreo() {

        return correo;
    }

    public int getEdad() {

        return edad;
    }

    public String getDni() {

        return dni;
    }

}
