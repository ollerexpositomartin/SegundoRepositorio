package EjemplosBinarios;

import java.io.*;

import Utilidades.Entrada;

public class Ejemplo13 {
	public static int menu() {
		System.out.println("----Menu----");
		System.out.println("1.-Crear Fichero");
		System.out.println("2.-Mostrar Fichero");
		System.out.println("3.-Fin del proceso");
		System.out.println("\nIntroduce una opcion");

		int opcion = Entrada.entero();
		while (opcion < 1 || opcion > 3) {
			System.out.println("Opcion no valida");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	
public static void creaFichero(File f) {
	//si existe decidir si sobreescribe o si añade
	char sobreEscribir;
	try {
		f.createNewFile();
	}catch (IOException ioe) {
		System.out.println(" menuda tonta");
	}
	if(f.exists()) {
		System.out.println("Sobreescribir o añadir ");
		sobreEscribir = Character.toUpperCase(Entrada.caracter());
		if(sobreEscribir=='S')
			System.out.println("sobreescribiremos");
		else
			System.out.println("añadiremos");
	}
	
}

public static void muestraFichero(File f ) {
	try(DataInputStream flujoEntrada = new DataInputStream(new FileInputStream(f))){
		while(true) {
			System.out.println("NOMBRE "+flujoEntrada.readUTF());
			System.out.println("\tEDAD "+ flujoEntrada.readInt());
			System.out.println("Lugar de nacimiento "+flujoEntrada.readUTF());
			
		}
		
	}catch(IOException ioe){
		
	}
	
}

	public static void main(String[] args) {

		String directorio, archivo;

		// Leer el directorio
		System.out.println(" SOBRE QUE DIRECTORIO VAMOS A TRABAJAR");
		directorio = Entrada.cadena();

		// Creamos el objeto file al directorio
		File ruta = new File(directorio);

		if (!ruta.exists())
			ruta.mkdirs();

		// Leer fichero

		System.out.println("Introduce nombre del fichero");
		archivo = Entrada.cadena();

		File fichero = new File(ruta, archivo);
		int opcion;
		do {
		opcion = menu();
		
			switch (opcion) {
			case 1: {
				System.out.println("Crear fichero");
				creaFichero(fichero);

			}
				break;
			case 2: {
				System.out.println("mostrar fichero");
				
			}
				break;
			case 3: {
				System.out.println("Proceso Terminado");

			}
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (opcion != 3);

	}

}
