package co.edu.udea.iw.DTO;




public class Roles {

	
	private String codigo;
	private String nombre;
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void  setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void  SetCodigo(String codigo){
		this.codigo = codigo;
	}
	
}
