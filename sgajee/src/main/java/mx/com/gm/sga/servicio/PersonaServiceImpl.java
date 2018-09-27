package mx.com.gm.sga.servicio;

import mx.com.gm.sga.domain.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaServiceImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Perez", "Suarez", "jperez@gmail.com", "55668795"));
        personas.add(new Persona(2, "Martha", "Suarez", "Jimenez", "msuarez@gmail.com", "566998811"));
        return personas;

    }

    @Override
    public Persona encontraPersonaPorId (Persona persona) {
        return null;
    }

    @Override
    public Persona encontraPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona){

    }

    @Override
    public void modificarPersona(Persona persona){

    }

    @Override
    public void eliminarPersona(Persona persona){
         
    }


}
