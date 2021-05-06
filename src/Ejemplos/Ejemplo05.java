package Ejemplos;
import java.io.*;
public class Ejemplo05 {

	public static void main(String[] args) {
		File d = new File("C:\\Users\\Martín");
		File fichero = new File(d,"Ejemplo.txt");
		
		try {
			fichero.createNewFile();
			System.out.println("Fichero Creado");
		} catch (IOException ioe) {
			System.out.println("Error Fichero no creado");
		}
		
		
	}


}
