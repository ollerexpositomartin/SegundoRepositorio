package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Utilidades.Entrada;

public class Ejemplo24 {

	public static void main(String[] args) {
		String nombres;
		char respuesta;
		File ficheroOrigen = new File("E:" + File.separator + "Ejemplos Ficheros", "Blanco.txt");
	do {
			System.out.println("Ingresa un nombre");
			nombres = Entrada.cadena();

			if (ficheroOrigen.exists() && nombres!="0") {

				try (PrintWriter flujoOrigen = new PrintWriter(new FileWriter(ficheroOrigen,true))) {
					flujoOrigen.println(nombres);

				} catch (IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			} else
				System.out.println("El fichero de Origen no existe");
			
			System.out.println("Quiere introducir mas nombres S/N");
			 respuesta = Entrada.caracter();
		} while (respuesta == 'S');
	}

}
