package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Utilidades.Entrada;

public class Ejemplo27 {

	public static void fusion(File f, int o) {
		File fCiudades = new File("E:" + File.separator + "Ejemplos Ficheros", "Ciudades.txt");
		File fPaises = new File("E:" + File.separator + "Ejemplos Ficheros", "Paises.txt");

		try (BufferedReader fLecturaC = new BufferedReader(new FileReader(fCiudades));
				PrintWriter fEscritura = new PrintWriter(new FileWriter(f, true));
				BufferedReader fLecturaP = new BufferedReader(new FileReader(fPaises))) {
			String cadena;

			if (o == 1) {

				while ((cadena = fLecturaC.readLine()) != null) {
					fEscritura.println(cadena);
				}

				while ((cadena = fLecturaP.readLine()) != null) {
					fEscritura.println(cadena);
				}
			}

			if (o == 2) {

				while ((cadena = fLecturaP.readLine()) != null) {
					fEscritura.println(cadena);
				}

				while ((cadena = fLecturaC.readLine()) != null) {
					fEscritura.println(cadena);
				}

			}

		} catch (IOException ioe) {
			ioe.getMessage();

		}

	}

	public static void main(String[] args) {
		int opcion;
		System.out.println("---MENU------------");
		System.out.println("1.-PRIMERO CIUDADES");
		System.out.println("2.-PRIMERO PAISES");
		System.out.println("-------------------");

		System.out.println("\nIngresa una opcion");
		opcion = Entrada.entero();

		switch (opcion) {
		case 1: {
			File ciudadesPaises = new File("E:" + File.separator + "Ejemplos Ficheros", "Ciudades_Paises.txt");
			fusion(ciudadesPaises, opcion);

		}
			break;
		case 2: {
			File paisesCiudades = new File("E:" + File.separator + "Ejemplos Ficheros", "Paises_Ciudades.txt");
			fusion(paisesCiudades, opcion);

		}
			break;
		default:
			System.out.println("LA OPCION ELEGIDA NO ES VALIDA");
		}

	}

}
