package co.edu.udea.iw.DAO.impl;



import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.Exception.MyException;


/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(locations = "classpath:springConfiguration.xml")
public class CiudadDAOImplTest{

	
	
	
	@Autowired  //crea una instancia de CiudadDAO y una vez creada le inyecta la dependencia.
	CiudadDAO ciudadDAO;
	
	@Test
	public void testObtener() {
		List <Ciudad> ciudades = null; //Crea un lista de tipo Ciudad
		try{
			
			ciudades = ciudadDAO.obtener();
			assertTrue(ciudades.size()>0);  //verifica que la lista de ciudades 
											//obtenidas es mayor que 0
			
		}
		catch(MyException e)
		{
			fail(e.getMessage());
		}
	}

	@Test
	public void testObtenerLong() {
		Ciudad ciudad = null;
		try
		{
			
			ciudad = ciudadDAO.obtener(1l); //Obtiene la ciudad con codigo "1"
			assertEquals(ciudad.getNombre(),"Medellin"); //Verifica que el nombre de la ciudad es "Medellin"
		}
		catch(MyException e)
		{
			fail(e.getMessage());
		}
	}
	

}