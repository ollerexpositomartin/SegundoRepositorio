package ejercicio31;

import java.io.Serializable;

import Utilidades.Validacion;

@SuppressWarnings("serial")
public class Persona implements Serializable {
	public String nombre,direccion,nif;

	public Persona(String nombre, String direccion, String nif) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNif(String nif) {
		if(Validacion.validarNIF(nif))
			this.nif = nif;
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

	@Override
	public String toString() {
		return "NOMBRE:" + nombre + ", DIRECCION:" + direccion + ", NIF:" + nif ;
	}

	
	
}
