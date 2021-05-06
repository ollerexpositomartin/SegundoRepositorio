package ejercicio35;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import Utilidades.Entrada;


public class PrincipalPublicaciones {
	
	public static Libros creaLibros() {
		String titulo,editor,isbn,autor;
		int anyo;
		
		System.out.println("Introduce titulo");
		titulo = Entrada.cadena();
		
		System.out.println("Introduce editor");
		editor = Entrada.cadena();
		
		System.out.println("Introduce año");
		anyo = Entrada.entero();
		
		System.out.println("Introduce isbn");
		isbn = Entrada.cadena();
		
		System.out.println("Introduce autor");
		autor = Entrada.cadena();
		
		return new Libros(titulo,editor,anyo,isbn,autor);
		
	}
	
	public static Revistas creaRevistas() {
		String titulo,editor;
		int anyo,nAnyo;
		long circulacion;
		
		System.out.println("Introduce titulo");
		titulo = Entrada.cadena();
		
		System.out.println("Introduce editor");
		editor = Entrada.cadena();
		
		System.out.println("Introduce año");
		anyo = Entrada.entero();
		
		System.out.println("Introduce numero de revistas por año");
		nAnyo = Entrada.entero();
		
		System.out.println("Introduce numeros en circulacion");
		circulacion = Entrada.enteroLargo();
		
		return new Revistas(titulo,editor,anyo,nAnyo,circulacion);
		
	}
	
	
	
	
	
	
	public static void  crearFichero(File f) {
		String res;
		try(ObjectOutputStream fEscritura = new ObjectOutputStream(new FileOutputStream(f))){
			
			System.out.println("Que tipo de objeto quieres añadir libros o revistas (L|R)");
			res = Entrada.cadena();
			
			if(res.equalsIgnoreCase("L"))
				fEscritura.writeObject(creaLibros());
			if(res.equalsIgnoreCase("R"))
				fEscritura.writeObject(creaRevistas());
				
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("1º Crear Fichero (Revistas y Libros)");
		System.out.println("2º Añadir publicaciones (Libros y Revistas)");
		System.out.println("3º Mostrar datos");
		System.out.println("4º Salir del programa");
		System.out.println("\n Elige una opcion (1|2|3|4)");
		
		int res = Entrada.entero();
		
		File librosRevistas = new File("E:"+File.separator+"Ejemplos Fichero","ejercicio35.dat");
		
		
		switch (res) {
		case 1: {
			if(!librosRevistas.exists())
				crearFichero(librosRevistas);
				
				
		}
	
		}

	}

}
