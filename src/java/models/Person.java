package java.models;

public class Person {

    public String nombres;
    public String apellidos;
    public String telefono;
    public String Correo;

    public Person() {
    }

    public Person(String nombres, String apellidos, String telefono, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        Correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", Correo='" + Correo + '\'' +
                '}';
    }
}


