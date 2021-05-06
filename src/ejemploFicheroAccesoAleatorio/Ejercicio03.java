package ejemploFicheroAccesoAleatorio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import EjemplosObjetos.Punto;
import Utilidades.Entrada;

public class Ejercicio03 {

	public static void main(String[] args) {
		int punto1;
		int punto2;

		File fichero = new File("E:" + File.separator + "Ejemplos Ficheros", "puntos.dat");

		try (RandomAccessFile fEscritura = new RandomAccessFile(fichero, "rw")) {
			char res;
			do {
				System.out.println("Introduce x");
				punto1 = Entrada.entero();
				System.out.println("Introduce y");
				punto2 = Entrada.entero();
				
				fEscritura.write(punto1);
				fEscritura.write(punto2);
				System.out.println("Quieres continuar S/N");
				res = Character.toUpperCase(Entrada.caracter());

			} while (res == 'S');

		} catch (IOException ioe) {
			ioe.getMessage();
		}

		try (RandomAccessFile fLectura = new RandomAccessFile(fichero, "rw")) {
			int numero;

			while ((numero = fLectura.read()) != -1) {
				System.out.println(numero);
			}

		} catch (IOException ioe) {
			ioe.getMessage();
		}

	}

}
