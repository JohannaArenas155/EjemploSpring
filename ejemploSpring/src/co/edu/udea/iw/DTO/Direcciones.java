package co.edu.udea.iw.DTO;




public class Direcciones{

	private DireccionId id;
	private String Direccion;
	private String Telefono;
	private int Ciudad;
	private boolean Preferida;
	public DireccionId getId() {
		return id;
	}
	public void setId(DireccionId id) {
		this.id = id;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public int getCiudad() {
		return Ciudad;
	}
	public void setCiudad(int ciudad) {
		Ciudad = ciudad;
	}
	public boolean getPreferida() {
		return Preferida;
	}
	public void setPreferida(boolean Preferida) {
		this.Preferida = Preferida;
	}
	
	
}
