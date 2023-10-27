package ADT.Clases;

public class Empleado {

    float salario;
    int id;
    String apellido;



    int dep;

    public Empleado() {

    }

    public Empleado(float salario, int id, String apellido, int dep) {
        this.salario = salario;
        this.id = id;
        this.apellido = apellido;
        this.dep = dep;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", id=" + id +
                ", apellido='" + apellido + '\'' +
                ", dep=" + dep +
                '}';
    }

}
