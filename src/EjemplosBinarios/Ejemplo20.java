package EjemplosBinarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import Utilidades.Entrada;


public class Ejemplo20 {

		public static void main(String[] args) {	
			
			System.out.println("Ingresa la ruta del fichero");
			String ruta=Entrada.cadena();
			System.out.println("Ingresa el nombre del fichero ");
			
			File ficheroOrigen = new File("E:" + File.separator + "Ejemplos Ficheros", Entrada.cadena());

			String palabra = "das";

			if (ficheroOrigen.exists()) {

				try (BufferedReader flujoOrigen = new BufferedReader(new FileReader(ficheroOrigen))) {
					String cadena;
					while ((cadena = flujoOrigen.readLine()) != null) {
							if(cadena.contains(palabra))
								System.out.println(cadena); 
						
					
					
					}

				} catch (IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			}else
				System.out.println("El fichero de Origen no existe");


		

	}

}
