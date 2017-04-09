package co.edu.udea.iw.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import co.edu.udea.iw.DAO.ClienteDAO;
import co.edu.udea.iw.DTO.Cliente;
import co.edu.udea.iw.Exception.MyException;

/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */
public class ClienteDAOImpl implements ClienteDAO {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
	/**
	 *@throws MyException
	 *Retorna una lista de clientes
	 */
	@Override
	public List<Cliente> obtener() throws MyException {
	
		List<Cliente> clientes = new ArrayList<Cliente>(); //crea una lista de tipo cliente
		Session session = null; //Se crea un arraylist de tipo Ciudad
		Criteria criteria = null; //Se crea un objetivo tipo criteria el cual permite especificar consultas programáticamente
		
		
		try{
			
			session = sessionFactory.getCurrentSession(); //Obtiene la sesión actual
			criteria = session.createCriteria(Cliente.class);
			criteria.addOrder(Order.asc("FechaCreacion")); //se ordena los clientes por fecha de creación
			clientes = criteria.list(); 
		}catch(HibernateException e){
			throw new MyException("Error consultando clientes", e);
		}
		
		return clientes; //retorna  la lista de clientes.
	}

	
	
	/**
	 *@param cliente
	 *@throws MyException
	 *Guarda un nuevo cliente en la base de datos.
	 */
	@Override
	public void agregar(Cliente cliente) throws MyException {
		

		Session session = null;  //se crea un objeto de tipo session
		try
		{   
			session = sessionFactory.openSession(); //abre la session
			session.save(cliente);  //Guarda la ciudad
			session.flush();  //Guarda los cambios en la base de datos
		}
		catch(HibernateException e)
		{
			throw new MyException("Error agregando cliente", e);
		}
	}

	

}
