package EjemplosBinarios;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Empleados implements Serializable {
	
	
	private String nombre;
	private String direccion;
	private String nif;
	private String categoria;
	
	
	public Empleados(String nombre, String direccion, String nif, String categoria) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
		this.categoria = categoria;

	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public String getNif() {
		return nif;
	}


	public String getCategoria() {
		return categoria;
	}


	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", direccion=" + direccion + ", nif=" + nif + ", categoria=" + categoria
				+ "]";
	}
	
}
