package Ejemplos;

import java.io.File;

import Utilidades.Entrada;

public class Ejemplo03 {

	public static void main(String[] args) {
		String directorioLeido;
		
		System.out.println("Que directorio quieres mostrar");
		directorioLeido = Entrada.cadena();
		
		
		File directorio = new File(directorioLeido);
		if (directorio.exists()) {
			System.out.println(directorio.getAbsolutePath());
	        
	        
		}else {
			System.out.println("El directorio no existe");
		}
        
	}

}
