package co.edu.udea.iw.DAO;

import java.util.List;

import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.Exception.MyException;

public interface  ClienteDAO {

	
	 
	 
	public List<Cliente> obtener() throws MyException; // entrega la lista de clientes  ordenados por su fecha de creacion
	public void agregar(Cliente cliente)throws MyException; //Guarda un nuevo cliente

}
