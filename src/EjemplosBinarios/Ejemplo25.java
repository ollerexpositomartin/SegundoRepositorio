package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ejemplo25 {

	public static void main(String[] args) {
		File fichero = new File("E:" + File.separator + "Ejemplos Ficheros", "Blanco.txt");
		ArrayList<String> nombres = new ArrayList<String>();
		
		try (BufferedReader flujoLectura = new BufferedReader(new FileReader(fichero))){
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		File fNuevo = new File("E:" + File.separator + "Ejemplos Ficheros", "CompasOrdenado.txt");
		
		try(PrintWriter fEntrada = new PrintWriter(new FileWriter(fNuevo))){
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
