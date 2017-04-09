package co.edu.udea.iw.DAO.impl;



import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;


/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:springConfiguration.xml")
public class UsuarioDAOImplTest{

	@Autowired
	UsuarioDAO usuarioDAO; //crea una instancia de UsuarioDAO y una vez creada le inyecta la dependencia.
	
	@Test
	public void ObtenerUsuario() {
		Usuario usuario= null; //crea un objeto de tipo usuario
		try
		{

			usuario = usuarioDAO.obtener("elver"); //consulta el usuario "elver"
			assertEquals(usuario.getNombres(),"Elver"); //verifica el nombre del  usuario que se retorno
			
			System.out.println(usuario.getRol()); //imprime en consola el rol de usuario
	        
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
