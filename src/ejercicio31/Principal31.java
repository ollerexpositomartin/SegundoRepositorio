package ejercicio31;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Utilidades.Entrada;


public class Principal31 {
	
	//Lee los datos de un empleado
	public static Empleados leeEmpleado() {
		String nombre,direccion,nif;
		double sueldo;
		char categoria;
		
		System.out.print("Nombre? ");
		nombre = Entrada.cadena();
		System.out.print("Direccion? ");
		direccion = Entrada.cadena();
		System.out.print("Nif? ");
		nif = Entrada.cadena();
		System.out.print("Sueldo? ");
		sueldo = Entrada.realDoble();
		System.out.print("Categoria? ");
		categoria = Entrada.caracter();
		
		
		return new Empleados(nombre, direccion, nif, sueldo, categoria); 
		
	}
	
	public static void creaFichero(File f) {
		char seguir;
		try(ObjectOutputStream fSalida = new ObjectOutputStream(new FileOutputStream(f))){
			do {
				fSalida.writeObject(leeEmpleado());
				System.out.println("\nQuiere seguir introduciendo empleaos (S para seguir)");
				seguir = Entrada.caracter();
			}while(seguir == 'S');
		} catch (IOException ioe) {
			ioe.getMessage();
		}
		
	}
	
	public static void mostrarFichero(File f) {
		Empleados empleado;
		try(ObjectInputStream fLectura = new ObjectInputStream(new FileInputStream(f))){
			while(true) {
				 empleado = (Empleados) fLectura.readObject();
				 System.out.println(empleado.toString());
			}
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("Fichero no encontrado");
		}catch (ClassNotFoundException cnfe) {
			System.out.println("No existe la clase");
		}catch (EOFException eofe) {
			System.out.println("Fin Fichero");
		}catch(IOException ioe){
			System.out.println("Erro E/S");
		}
		
	}
	

	//metodo de Creacion ,leer , añadir
	public static void main(String[] args) {
		
		
		File fichero = new File("E:"+File.separator+"Ejemplos Ficheros","Personal.dat");
		
		creaFichero(fichero);
		mostrarFichero(fichero);
		

	}

}
