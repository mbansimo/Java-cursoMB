package mx.com.gm.sga.cliente;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
import java.util.Properties;

public class ClientePersonaServiceConIP {

    public static void main(String[] args) {
        System.out.println("Iniciando el llamado al EJB el cliente \n");
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs","com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");

            Context jndi = new InitialContext(props);
            PersonaServiceRemote personaService =
                    (PersonaServiceRemote) jndi.lookup("java:global/sga-ee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");

            List<Persona> personas = personaService.listarPersonas();
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("\n Fin de llamada al EJB desde el cliente ");
        } catch (NamingException e){
            e.printStackTrace();
        }
    }

}
