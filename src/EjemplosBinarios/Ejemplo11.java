package EjemplosBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import Utilidades.Entrada;

public class Ejemplo11 {

	public static void main(String[] args) {
		System.out.println("Ingresa el directorio");
		String directorio = Entrada.cadena();
		
		System.out.println("Ingresa el nombre del fichero");
		String fichero = Entrada.cadena();
		
		File ruta = new  File(directorio,fichero);
		
		
		 try {
			ruta.createNewFile();
		} catch (IOException ioe) {
			ioe.getMessage();
		}
		 
		 if(ruta.exists()) {
			 try(FileOutputStream flujoEscritura = new FileOutputStream(ruta,true)) {
				 System.out.println("Introduce edad");
				 flujoEscritura.write(Entrada.entero());
				 System.out.println("Introduce nombre");
				 flujoEscritura.write(Entrada.cadena().getBytes());
				 System.out.println("Introduce año de nacimiento");
				 flujoEscritura.write(Entrada.entero());
				
			} catch (IOException ioe) {
				ioe.getMessage();
				
			}
			 
			 
			 
			 try (FileInputStream flujoLectura = new FileInputStream(ruta)){
				 
				 
				 while(flujoLectura.read()!=-1) {
					 
				 }
				 
				
			} catch (IOException ioe) {
				ioe.getMessage();			}
			 
		 }
			 
		
		
	}

}
