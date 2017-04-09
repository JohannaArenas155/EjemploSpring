package co.edu.udea.iw.DTO;

import org.hibernate.annotations.Proxy;


public class Ciudad {

	
	public long codigo;
	public String nombre;
	public String codigoArea;
	

	public long getCodigo(){
		return this.codigo;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getCodigoArea(){
		return this.codigoArea;
	}
	
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setCodigoArea(String codigoArea){
		this.codigoArea=codigoArea;
	}
}
