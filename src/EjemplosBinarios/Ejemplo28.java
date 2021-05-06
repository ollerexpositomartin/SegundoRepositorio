package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Utilidades.Entrada;
import Utilidades.Validacion;

public class Ejemplo28 {

	public static void fusionFichero(File f1, File f2, File fd) {
		try (BufferedReader flujoL1 = new BufferedReader(new FileReader(f1));
				BufferedReader flujoL2 = new BufferedReader(new FileReader(f2));
				PrintWriter flujoD = new PrintWriter(new FileWriter(fd))) {

			String cadena;

			while ((cadena = flujoL1.readLine()) != null) {
				flujoD.println(cadena);
			}

			while ((cadena = flujoL2.readLine()) != null) {
				flujoD.println(cadena);
			}

		} catch (IOException ioe) {
			ioe.getMessage();
		}
		System.out.println("Contenido del fichero Fusionado: ");
		MostrarFichero(fd);

	}

	public static void MostrarFichero(File fd) {

		try (BufferedReader flujoL = new BufferedReader(new FileReader(fd))) {
			String cadena;

			while ((cadena = flujoL.readLine()) != null) {
				System.out.println(cadena);
			}

		} catch (IOException ioe) {
			ioe.getMessage();
		}
	}

	public static String nombreLimpio(File f) {
		String nombre = f.getName();

		String[] parteNombre = nombre.split("\\.");

		return parteNombre[0];

	}

	public static void main(String[] args) {
		String directorio1;
		String directorio2;
		String directorioD;

		do {
			System.out.println("Ingresa la ruta del fichero de origen 1");
			directorio1 = Entrada.cadena();
		} while (Validacion.validarRuta(directorio1) == false);

		System.out.println("Ingresa el nombre del fichero de origen 1");
		File ficheroO1 = new File(directorio1, Entrada.cadena());

		do {
			System.out.println("Ingresa la ruta del fichero de origen 2");
			directorio2 = Entrada.cadena();
		} while (Validacion.validarRuta(directorio2) == false);

		System.out.println("Ingresa el nombre del fichero de origen 2");
		File ficheroO2 = new File(directorio2, Entrada.cadena());

		do {
			System.out.println("Ingresa la ruta de destino de la fusion de los ficheros");
			directorioD = Entrada.cadena();
		} while (Validacion.validarRuta(directorioD) == false);
		File ruta = new File(directorioD);

		if (!ruta.exists())
			ruta.mkdirs();

		File ficheroD = new File(ruta, nombreLimpio(ficheroO1) + "_" + nombreLimpio(ficheroO2) + ".txt");

		fusionFichero(ficheroO1, ficheroO2, ficheroD);

	}

}
