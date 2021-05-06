package EjemplosBinarios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Utilidades.Entrada;

public class Ejemplo26 {
	
	public static void crearFichero(File f) {
		String cadena;
		
		try(PrintWriter fEntrada = new PrintWriter(new FileWriter(f,true))){
			System.out.println("INTRODUCE CADENA");
			cadena = Entrada.cadena();
			while(!cadena.equalsIgnoreCase("fin")) {
				fEntrada.println(cadena);
				System.out.println("INTRODUCE CADENA");
				cadena = Entrada.cadena();
			}
		} catch (IOException ioe) {
			ioe.getMessage();
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Ingresa la ruta de los fichero a crear");
		String directorio = Entrada.cadena();
		
		File ruta = new File(directorio);
		
		if(!ruta.exists()) 
			ruta.mkdirs();

	

		File fCiudades = new File(ruta, "Ciudades.txt");
		File fPaises = new File(ruta,"Paises.txt");
		
		System.out.println("Introduce Ciudades");
		crearFichero(fCiudades);
		System.out.println("Introduce Paises");
		crearFichero(fPaises);
		
		


	
	}

}
