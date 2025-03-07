package ar.edu.unju.fi.model;

public class Cliente {

	private genericodosatributos<String, String> dni;
	private String apellidoM;
	private String nombre;
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(genericodosatributos<String, String> dni, String apellidoM, String nombre) {
		this.dni = dni;
		this.apellidoM = apellidoM;
		this.nombre = nombre;
	}

	public genericodosatributos<String, String> getDni() {
		return dni;
	}

	public void setDni(genericodosatributos<String, String> dni) {
		this.dni = dni;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
