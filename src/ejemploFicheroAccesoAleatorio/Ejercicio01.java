package ejemploFicheroAccesoAleatorio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import Utilidades.Entrada;

public class Ejercicio01 {

	public static void main(String[] args) {
		int entero;
		File fichero = new File("E:"+File.separator+"Ejemplos Ficheros","enteros.dat");
		
		try(RandomAccessFile fLectura = new RandomAccessFile(fichero, "rw")){
			
			System.out.println("Ingresa numero entero mientra no 0 ");
			entero = Entrada.entero();
			fLectura.write(entero);
			
			while(entero!=0) {
			System.out.println("Ingresa numero entero mientra no 0 ");
			entero = Entrada.entero();
			fLectura.write(entero);
			}
			
		} catch (IOException ioe) {
			ioe.getMessage();
		}
		
		try(RandomAccessFile fLectura = new RandomAccessFile(fichero, "rw")){
			int cadena;
			
			while((cadena = fLectura.read())!=-1) {
				System.out.println(cadena);
			}
			
		} catch (IOException ioe) {
			ioe.getMessage();
		}
		
		

	}

}
