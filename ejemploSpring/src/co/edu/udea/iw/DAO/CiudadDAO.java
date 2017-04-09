package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.Exception.MyException;

/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */


public interface  CiudadDAO {

	public List<Ciudad> obtener() throws MyException; //Retorna un lista de las ciudades
	public Ciudad obtener(Long codigo) throws MyException; //Retorna un ciudad con en codigo que se le entre
	public void guardar(Ciudad ciudad) throws MyException; //Guarda un objeto de tipo ciudad
	
	
	
	
	
}
