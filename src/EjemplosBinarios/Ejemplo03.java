package EjemplosBinarios;

import java.io.*;

import Utilidades.Entrada;

/*****************************
 * Copiar un fichero en otro
 *****************************/

public class Ejemplo03 {

	public static void main(String[] args) {
		String directorio = "E:" + File.separator + "Ejemplos Ficheros";
		String archivoOrigen="Espronceda.txt";
		String archivoDestino = "FicheroBinario04.txt";
		
		File ruta = new File(directorio);
		
		
		//Comprobar existencia y crear si no existe
		
		if (!ruta.exists()) {
			System.out.println("NO EXISTE EL DIRECTORIO");
			ruta.mkdirs();
		}else
			System.out.println("EXISTE EL DIRECTORIO");
		
		//FILE AL FICHERO
		
		File ficheroOrigen = new File(ruta,archivoOrigen);
		
		//FILE AL FICHERO DESTINO 
		File ficheroDestino = new File(ruta,archivoDestino);
		
		try (FileInputStream flujoOrigen= new FileInputStream(ficheroOrigen);
				FileOutputStream flujoDestino = new FileOutputStream(archivoDestino)){
			
		int valor = flujoOrigen.read();
		
		while(valor!=-1) {
			flujoDestino.write(valor);
			valor = flujoOrigen.read();
		}
			
			
		}catch(IOException ioe) {
			System.out.println("Error E/S");
		}
		
		
		
		

	
	}

}
