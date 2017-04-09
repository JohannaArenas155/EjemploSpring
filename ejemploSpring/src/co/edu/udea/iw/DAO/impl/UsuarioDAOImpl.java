package co.edu.udea.iw.DAO.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import co.edu.udea.iw.DAO.UsuarioDAO;
import co.edu.udea.iw.DTO.Usuario;
import co.edu.udea.iw.Exception.MyException;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	
	
SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	/**
	 *@param login
	 *@throws MyException
	 *retorna el usuario del login ingresado
	 */
	@Override
	public Usuario obtener(String login) throws MyException {
		Usuario usuario= new Usuario();
		Session session = null;
		try{
			session = sessionFactory.getCurrentSession(); //obtiene la sesión actual
			session.get(Usuario.class,login);  //cosulta el usuario con un login especifico
			usuario = (Usuario) session.get(Usuario.class,login); //guarda el usuario consultado en la variable usuario
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando usuarios", e);
		}
	
		
		return usuario; //retorna un usuario
	}

}
