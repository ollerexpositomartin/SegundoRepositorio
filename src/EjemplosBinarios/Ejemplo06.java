package EjemplosBinarios;

/**
 * @author Martin
 */

import java.io.*;

public class Ejemplo06 {

	public static void main(String[] args) {
		File directorio = new File("E:" + File.separator + "Ejemplos Ficheros");

		File fichero = new File(directorio, "ArchivoEjemplo06.txt");

		try (FileOutputStream flujoEntrada = new FileOutputStream(fichero)) {
			for (int i = 1; i <= 50; i++) {
				flujoEntrada.write(i);
			}
			System.out.println("Fichero Escrito");

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		try (FileInputStream flujoSalida = new FileInputStream(fichero)) {

			int archivo = flujoSalida.read();

			while (archivo != -1) {
				System.out.println(archivo);
				archivo = flujoSalida.read();
			}

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}

}
