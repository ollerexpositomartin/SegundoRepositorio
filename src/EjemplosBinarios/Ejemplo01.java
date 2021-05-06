package EjemplosBinarios;

import java.io.*;

import Utilidades.Entrada;

public class Ejemplo01 {

	public static void main(String[] args) {
//Crear cadena con nombre
		String directorio = "E:" + File.separator + "Ejemplos Ficheros";
//CREAR File a directorio
		File ruta = new File(directorio);
//Comprobar existencia y crear en su caso
		if (!ruta.exists())
			ruta.mkdirs();

//Crear cadena nombre fichero
		String archivo = "fichero02.txt";
//Crear File a fichero
		File fichero = new File(archivo);
//Leer Cadena a introducir en el archivo
		String contenido;
		System.out.println("Introduce el contenido del archivo");
		contenido = Entrada.cadena();

		try (FileOutputStream flujosalida = new FileOutputStream(directorio + File.separator + archivo)) {
			for (int i = 0; i < contenido.length(); i++) 
				flujosalida.write(contenido.charAt(i));

		} catch (IOException e) {
			System.out.println("Error de entrada/salida");

		}
	}

}
