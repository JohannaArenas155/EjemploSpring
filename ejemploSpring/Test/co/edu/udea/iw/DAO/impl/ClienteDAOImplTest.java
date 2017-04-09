package co.edu.udea.iw.DAO.impl;


import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;
/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:springConfiguration.xml")
public class ClienteDAOImplTest {

	
	@Autowired //crea una instancia de ClienteDAO y una vez creada le inyecta la dependencia.
	ClienteDAO clienteDAO;
	
	@Test
	public void testGuardar() {
		
		Cliente cliente = null; 
		Usuario usuario= null;
		
		try{
			cliente = new Cliente(); //Crea un objeto tipo cliente
			cliente.setCedula("1r38"); 
			cliente.setNombres("Johanna");
			cliente.setApellidos("Arenas");
			cliente.setEmail("Lalala");
			
			usuario = new Usuario(); //Crea un objeto tipo usuario
			usuario.setLogin("elver");
			cliente.setUsuarioCrea(usuario);
			cliente.setFechaCreacion(new Date());
			clienteDAO.agregar(cliente); //guarda el cliente.
			
			
		}catch(MyException e){
			e.printStackTrace();
			fail(e.getMessage());
			
		}
	}
	
	
	@Test
	 public void testObtener() {
		  List<Cliente> resultado = null; //crea un lista de clientes
		  
		  try{
		   resultado = clienteDAO.obtener();
		   
		   for(Cliente cliente:resultado){
		    System.out.println(cliente.getNombres()); //imprime en consola los nombres de los cliente
		   }
		   
		   assertTrue(resultado.size()>0); //verifica que el resultado es mayor que cero
		   
		  }catch(MyException e){
		   e.printStackTrace();
		   fail(e.getMessage());
	   
	  }
	 }
	
}
