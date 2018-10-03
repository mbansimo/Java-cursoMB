package mx.com.gm.sga.cliente;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class ClientePersonaService {

    public static void main(String[] args) {

        System.out.println("Iniciando llamado a EJB desde el cliente \n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService =
                    (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("\n Fin de llamda al EJB desde el cliente ");
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

}
