package mx.com.gm.sga.servicio;

import mx.com.gm.sga.domain.Persona;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface PersonaServiceRemote {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);


}
