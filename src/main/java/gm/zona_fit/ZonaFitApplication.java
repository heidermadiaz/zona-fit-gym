package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner{
    
    @Autowired
    private IClienteServicio clienteServicio;
    
    private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);
    
    String nl = System.lineSeparator();


	public static void main(String[] args) {
            logger.info("Iniciando la aplicacion");
            //levantar la fabrica de Spring.
		SpringApplication.run(ZonaFitApplication.class, args);
                logger.info("Aplicacion Finalizada");
	}

    @Override
    public void run(String... args) throws Exception {
       
        zonaFitApp();
      
    }
    
    private void zonaFitApp(){
        
         var salir = false;
         var consola = new Scanner(System.in);
         while (!salir) {
             var opcion = mostrarMenu(consola);
             salir = ejecutarOpciones(consola, opcion);
             logger.info(nl);
            
            
        }
    }
    
    private int mostrarMenu(Scanner consola){
        logger.info("""
        \n*** Aplicacion Zona Fit GYM ***
            1. Listar Clientes
            2. Buscar Cliente
            3. Agregar Clinte
            4. Modificar Cliente
            5. Eliminar CLiente
            6. Salir
            Elige una opcion:\s""");
        return  Integer.parseInt(consola.nextLine());
       
        
    }
    
    private boolean ejecutarOpciones(Scanner consola, int opcion){
        var salir = false;
        switch (opcion) {
            case 1->{
                logger.info(nl + "--- Listado de clientes ---" + nl);
                List<Cliente> clientes = clienteServicio.listarClientes();
                clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
            }
            case 2->{
                logger.info(nl + "--- Buscar cliente por ID ---" + nl);
                var idCliente = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if(cliente != null)
                    logger.info("CLiente encontrado: " +cliente + nl);
                else
                    logger.info("El Cliente NO ha sido encontrado: " + cliente + nl);
                
            }
            case 3->{
                logger.info(nl +"--- Agregar Cliente ---" + nl);
                logger.info("Nombre: ");
                var nombre = consola.nextLine();
                 logger.info("Apellido: ");
                 var apellido = consola.nextLine();
                  logger.info("Membresia: ");
                  var membresia = Integer.parseInt(consola.nextLine());
                  var cliente = new Cliente();
                  cliente.setNombre(nombre);
                  cliente.setApellido(apellido);
                  cliente.setMembresia(membresia);
                  clienteServicio.guardarCliente(cliente);
                  logger.info( "Cliente Guardado " + cliente);
                          
                  
            }
            
            case 4->{
                logger.info("--- Modificar CLiente ---" +nl);
                logger.info("Id CLiente : " );
                var idCliente = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null) {
                    logger.info("Nombre: ");
                    var nombre = consola.nextLine();
                      logger.info("Apellido: ");
                 var apellido = consola.nextLine();
                  logger.info("Membresia: ");
                   var membresia = Integer.parseInt(consola.nextLine());
                    cliente.setNombre(nombre);
                  cliente.setApellido(apellido);
                  cliente.setMembresia(membresia);
                  clienteServicio.guardarCliente(cliente);
                  logger.info( "Cliente Modificado: " + cliente);
                    
                }
                else
                    logger.info("Cliente no encontrado: " + cliente + nl);
                
            }
            case 5->{
                logger.info("--- Eliminar CLiente ---" + nl);
                logger.info("Id CLiente : " );
                var idCliente = Integer.parseInt(consola.nextLine());
                Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
                if (cliente != null) {
                    clienteServicio.eliminarCliente(cliente);
                    logger.info("Cliente eliminado: " + cliente + nl);
                    
                }
                else
                    logger.info("Cliente NO Encontrado: " + cliente +nl);
            }
            case 6 ->{
                logger.info("hasta pronto!" + nl + nl);
                salir = true;
            }
            default -> logger.info("Opcion no reconocida: " + opcion + nl);
                
           
        }
        return salir;
        
    }

}
