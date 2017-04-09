package co.edu.udea.iw.DTO;

import java.util.Date;
import java.util.Set;


import co.edu.udea.iw.DTO.Direcciones;


public class Cliente {
	  
	   private String Cedula;
	   private String Nombres;
	   private String Apellidos;
	   private String Email;
	   private Date FechaCreacion;
	   private Usuario UsuarioCrea;
	   Set<Direcciones> direcciones;
	   private Usuario UsuarioModifica;
	   private Date FechaModificacion;
	   private boolean Eliminado;
	   private Usuario UsuarioElimina;
	   private Date FechaEliminacion;
	
	   
	   public Set<Direcciones> getDirecciones() {
			return direcciones;
		}
		public void setDirecciones(Set<Direcciones> direcciones) {
			this.direcciones = direcciones;
		}
		
	   public Usuario getUsuarioCrea() {
			return UsuarioCrea;
		}
		public void setUsuarioCrea(Usuario usuarioCrea) {
			UsuarioCrea = usuarioCrea;
		}
		
    public Date getFechaEliminacion() {
		return FechaEliminacion;
	}
	public void setFechaEliminacion(Date fechaEliminacion) {
		FechaEliminacion = fechaEliminacion;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date date) {
		FechaCreacion = date;
	}
	public Usuario getUsuarioModifica() {
		return UsuarioModifica;
	}
	public void setUsuarioModifica(Usuario usuarioModifica) {
		UsuarioModifica = usuarioModifica;
	}
	public Date getFechaModificacion() {
		return FechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}
	public boolean isEliminado() {
		return Eliminado;
	}
	public void setEliminado(boolean eliminado) {
		Eliminado = eliminado;
	}
	public Usuario getUsuarioElimina() {
		return UsuarioElimina;
	}
	public void setUsuarioElimina(Usuario usuarioElimina) {
		UsuarioElimina = usuarioElimina;
	}
	   
	

	
	
	
}
