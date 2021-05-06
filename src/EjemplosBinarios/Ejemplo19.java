package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Ejemplo19 {

	public static void main(String[] args) {		
		File ficheroOrigen = new File("E:" + File.separator + "Ejemplos Ficheros", "Blanco.txt");
		File ficheroDestino = new File("E:" + File.separator + "Ejemplos Ficheros", "prueba.txt");
		
		String palabra = "das";

		if (ficheroOrigen.exists()) {

			try (BufferedReader flujoOrigen = new BufferedReader(new FileReader(ficheroOrigen));
					PrintWriter flujoDestino = new PrintWriter(new FileWriter(ficheroDestino))) {
				String cadena;
				while ((cadena = flujoOrigen.readLine()) != null) {
						if(cadena.contains(palabra))
							flujoDestino.print(cadena + "\n");
					
				
				
				}

			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		}else
			System.out.println("El fichero de Origen no existe");


	}

}
