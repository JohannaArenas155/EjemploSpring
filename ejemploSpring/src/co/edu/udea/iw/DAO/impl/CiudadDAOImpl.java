package co.edu.udea.iw.DAO.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.edu.udea.iw.DAO.CiudadDAO;
import co.edu.udea.iw.DTO.Ciudad;
import co.edu.udea.iw.Exception.MyException;


/**
 * @author Leydy Johanna Arenas Monsalve
 *
 */
public class CiudadDAOImpl implements CiudadDAO{

	SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	/**
	 *@throws MyException
	 *Retorna una lista de ciudades
	 */
	@Override
	public List<Ciudad> obtener() throws MyException {
		
		List<Ciudad> ciudades = new ArrayList<>(); //Se crea un arraylist de tipo Ciudad
		Session session = null;
		Criteria criteria  =null; //Se crea un objetivo tipo criteria el cual permite especificar consultas programáticamente
		
	try {
		session = sessionFactory.getCurrentSession();  //Obtiene la sesión actual
		criteria = session.createCriteria(Ciudad.class);
		ciudades = criteria.list();
	} 
	catch (HibernateException e) {
		throw new MyException("Error consultando ciudades", e);
		}
	
	return ciudades;
	}

	/**
	 * @param codigo
	 * @throws MyException
	 * Retorna la ciudad con el codigo ingresado 
	 */
	@Override
	public Ciudad obtener(Long codigo) throws MyException {
		
		Ciudad ciudad= new Ciudad(); // se crea un objeto de tipo ciudad
		Session session = null;    //se crea un objeto de tipo session
		try{
			session = sessionFactory.getCurrentSession();   //Obtiene la sesión actual
			ciudad = (Ciudad) session.get(Ciudad.class,codigo); //guarda en la variable ciudad el resultado de la consulta.
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
		return ciudad;
	}
	
	/**
	 * 
	 * @param ciudad
	 * @throws MyException
	 * Guarda una ciudad en la base de datos 
	 */
	@Override
	public void guardar(Ciudad ciudad) throws MyException
	{
		Session session = null;  //se crea un objeto de tipo session
		try
		{
			session = sessionFactory.openSession(); //Obtiene la sesión actual.
			session.save(ciudad);  //Guarda la ciudad
			session.flush(); //Guarda los cambios en la base de datos
		}
		catch(HibernateException e)
		{
			throw new MyException("Error guardando la ciudad", e);
		}
		
	}
}
