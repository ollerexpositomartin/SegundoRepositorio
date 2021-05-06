package ejercicio31;

import Utilidades.Entrada;

public class Empleados extends Persona {
	private double sueldo;
	private char categoria;//A|B|C|D
	
	public Empleados(String nombre, String direccion, String nif,double sueldo, char categoria) {
		super(nombre, direccion, nif);
		setSueldo(sueldo);
		setCategoria(categoria);
	}

	public void setSueldo(double sueldo) {//Validar
		while(sueldo <= 0) {
			System.out.println("Sueldo no valido");
			System.out.println("Ingresa un sueldo valido");
			sueldo = Entrada.realDoble();
		}
		this.sueldo = sueldo;
	}

	public void setCategoria(char categoria) {//Validar
		while(categoria < 'A' || categoria > 'D') {
			System.out.println("Categoria no valida");
			System.out.println("Ingresa una categoria valida");
			categoria = Entrada.caracter();
		}
		this.categoria = categoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public char getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return super.toString()+" SUELDO:" + sueldo + ",CATEGORIA:" + categoria;
	}
	
	

}
