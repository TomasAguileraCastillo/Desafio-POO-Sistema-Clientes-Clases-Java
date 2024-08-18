package cl.praxis;

import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.modelo.Cliente;
import cl.praxis.servicio.ClienteServicio;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteServicioTester {

    private final static Logger logger = Logger.getLogger(ClienteServicioTester.class.getName());
    private final ClienteServicio clienteServicio = new ClienteServicio();

    @BeforeAll
    public static void init(){
        logger.warning("-> Lo que va al inicio de los test de la clase");
    }

    @BeforeEach
    public void initEach(){
        logger.info("-> Inicio del testeo");
    }

    @AfterEach
    public void closeEach(){
        logger.info("-> Fin del testeo");
    }

    @AfterAll
    public static void close(){
        logger.warning("-> Fin de los test Realizados");

    }
    @Test
    public void testAgregarCliente() {
        logger.info("Agregar un cliente");
        Cliente cliente = new Cliente("14093470-4", "raul", "Dominguez", "5", CategoriaEnum.Activo);
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente);
        clienteServicio.setListaClientes(listaClientes);
        logger.info("El test para agregar un cliente funciona correctamente");
    }

   @Test
    public void testAgregarClienteNulo() {
        logger.info("Agregar un cliente nulo");
        Cliente cliente = new Cliente();
        List<Cliente> listaClientes = new ArrayList<>();
        clienteServicio.agregarCliente();
        logger.info("El test para agregar un cliente nulo funciona correctamente");
    }
}
