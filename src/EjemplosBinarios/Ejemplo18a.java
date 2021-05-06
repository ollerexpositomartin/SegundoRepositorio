package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Utilidades.Entrada;

public class Ejemplo18a {

	public static void main(String[] args) {
		System.out.println("Ingresa el directorio del fichero de Origen");
		String directorioOrigen = Entrada.cadena();
		System.out.println("Ingresa el nombre del fichero de Origen");
		
		File ficheroOrigen = new File(directorioOrigen, Entrada.cadena());
		
		System.out.println("Ingresa el directorio del fichero de destino");
		String directorioDestino = Entrada.cadena();
		
		System.out.println("Ingresa el nombre del fichero de destino ");
		File ficheroDestino = new File(directorioDestino, Entrada.cadena());
		
		if(ficheroOrigen.exists() && ficheroDestino.exists()) {
		try (BufferedReader flujoOrigen = new BufferedReader(new FileReader(ficheroOrigen));
				PrintWriter flujoDestino = new PrintWriter(new FileWriter(ficheroDestino))) {
			String cadena;
			while ((cadena = flujoOrigen.readLine()) != null)
				flujoDestino.print(cadena + "\n");

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		}else
			System.out.println("El fichero de origen o de destino no existe");

	}

}
