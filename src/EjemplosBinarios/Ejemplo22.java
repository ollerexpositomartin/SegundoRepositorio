package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo22 {

	public static void main(String[] args) {
		int texto=0 ;

		File ficheroOrigen = new File("E:" + File.separator + "Ejemplos Ficheros", "Blanco.txt");

		if (ficheroOrigen.exists()) {

			try (BufferedReader flujoOrigen = new BufferedReader(new FileReader(ficheroOrigen))) {
				String cadena;
				while ((cadena = flujoOrigen.readLine()) != null) 
					texto += cadena.length();
						

			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
			System.out.println(texto);
		}else
			System.out.println("El fichero de Origen no existe");

	}
}
