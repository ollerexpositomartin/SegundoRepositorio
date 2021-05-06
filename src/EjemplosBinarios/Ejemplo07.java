package EjemplosBinarios;

import java.io.File;
import java.io.FileInputStream;
import Utilidades.Entrada;

public class Ejemplo07 {

	public static void main(String[] args) {
		System.out.println("Ingresa el directorio");
		String directorio = Entrada.cadena();

		System.out.println("Ingresa el nombre del archivo");
		String archivo = Entrada.cadena();

		File ruta = new File(directorio + File.separator + archivo);

		if (ruta.exists()) {

			try (FileInputStream FlujoLectura = new FileInputStream(ruta)) {
				int leido = FlujoLectura.read();
				
				while (leido != -1) {
					System.out.println(leido);
					leido = FlujoLectura.read();

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}else
			System.out.println("Ruta no encontrada");
	}

}
