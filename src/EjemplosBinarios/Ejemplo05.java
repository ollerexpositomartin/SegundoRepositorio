package EjemplosBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo05 {
	public static void main(String [] args ) {
		String directorio = "E:"+File.separator+"Ejemplos Ficheros";
		File fichero = new File(directorio,"Archivoprueba.txt");
		
		try(FileInputStream archivo = new FileInputStream(fichero)){
			
			int archivoByte = archivo.read();
			
			while(archivoByte!=-1) {
				System.out.println((char)archivo.read());
				archivoByte=archivo.read();
			}
			
		
			
		
			
		}catch(IOException ioe){
			System.out.println("no existe el archivo");
			
		}
		
	}

}
