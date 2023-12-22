package java.implement;

import java.interfaces.PersonEvents;
import java.models.Person;


public class PersonaImplement implements PersonEvents {
    @Override
    public void presentarse() {
        System.out.println("mi nombre es JOSE IMBACUAN");
    }

    @Override
    public void crearUsuario() {
        Person persona1 = new Person();
        persona1.setNombres("Jose Armando");
        persona1.setApellidos("Imbacuan Morillo");
        persona1.setTelefono("3152000252");
        persona1.setCorreo("jose@gmail.com");
        System.out.println("nuevo usuario es: " + persona1.toString());
    }

    @Override
    public String crearCuenta() {
        String cuenta = "he creado cuenta";
        return cuenta;
    }

    public PersonaImplement() {
    }
}
