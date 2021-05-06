package Ejemplos;
import java.io.*;
public class Ejemplo01 {

	public static void main(String[] args) {
		
		File directorio = new File("C:"+File.separator+"PruebaFichero"+File.separator+"EjemplosFile");
        File directorio2 = new File("BorrarDespues");		
        File directorio3 = new File("C:"+File.separator+"Prueba");
        File directorio4 = new File(directorio3,"masPruebas");
        
        File fichero1 = new File(directorio,"fichero1.txt");
        File fichero2 = new File(directorio2,"fichero2.dll");
        File fichero3 = new File(directorio3,"fichero3.jpg");
        File fichero4 = new File("fichero.dat");
        File fichero5 = new File(directorio4,"fichero5.java");
        
        
        System.out.println("Ficheros");
        System.out.println(fichero1.getAbsolutePath()+(fichero1.exists()?" Existe":" No Existe"));
        System.out.println(fichero2.getAbsolutePath()+(fichero2.exists()?" Existe":" No Existe"));
        System.out.println(fichero3.getAbsolutePath()+(fichero3.exists()?" Existe":" No Existe"));
        System.out.println(fichero4.getAbsolutePath()+(fichero4.exists()?" Existe":" No Existe"));
        System.out.println(fichero5.getAbsolutePath()+(fichero5.exists()?" Existe":" No Existe"));
        
        System.out.println("Directorios");
        System.out.println(directorio.getAbsolutePath()+(directorio.exists()?"Existe":"No Existe"));
        System.out.println(directorio2.getAbsolutePath()+(directorio2.exists()?"Existe":"No Existe"));
        System.out.println(directorio3.getAbsolutePath()+(directorio3.exists()?"Existe":"No Existe"));
        System.out.println(directorio4.getAbsolutePath()+(directorio4.exists()?"Existe":"No Existe"));
        
        
        
        System.out.println(fichero1.isFile()?"Es un fichero":"No es un fichero");
        System.out.println(fichero2.isFile()?"Es un fichero":"No es un fichero");
        System.out.println(fichero3.isFile()?"Es un fichero":"No es un fichero");
        System.out.println(fichero4.isFile()?"Es un fichero":"No es un fichero");
        System.out.println(fichero5.isFile()?"Es un fichero":"No es un fichero");
        
        System.out.println(directorio.isDirectory()?"Es un directorio":"No es un directorio");
        System.out.println(directorio2.isDirectory()?"Es un directorio":"No es un directorio");
        System.out.println(directorio3.isDirectory()?"Es un directorio":"No es un directorio");
        System.out.println(directorio4.isDirectory()?"Es un directorio":"No es un directorio");
        
        
        directorio.mkdirs();
        directorio2.mkdirs();
        directorio3.mkdirs();
        directorio4.mkdirs();
        
        try {
        	fichero1.createNewFile();
        	System.out.println("Fichero Creado");
		} catch (IOException ioe ) {
			System.out.println("No se ha podido crear el fichero");
		}
        
        
        try {
        	fichero2.createNewFile();
        	System.out.println("Fichero Creado");
		} catch (IOException ioe ) {
			System.out.println("No se ha podido crear el fichero");
		}
        
        
        try {
        	fichero3.createNewFile();
        	System.out.println("Fichero Creado");
		} catch (IOException ioe ) {
			System.out.println("No se ha podido crear el fichero");
		}
        
        try {
        	fichero4.createNewFile();
        	System.out.println("Fichero Creado");
		} catch (IOException ioe ) {
			System.out.println("No se ha podido crear el fichero");
		}
        
        
        try {
        	fichero5.createNewFile();
        	System.out.println("Fichero Creado");
		} catch (IOException ioe ) {
			System.out.println("No se ha podido crear el fichero");
		}
        
        
      
        System.out.println(fichero1.getAbsolutePath()+(fichero1.canRead()?" Se puede leer":" No se puede leer"));
        System.out.println(fichero2.getAbsolutePath()+(fichero2.canRead()?" Se puede leer":" No se puede leer"));
        System.out.println(fichero3.getAbsolutePath()+(fichero3.canRead()?" Se puede leer":" No se puede leer"));
        System.out.println(fichero4.getAbsolutePath()+(fichero4.canRead()?" Se puede leer":" No se puede leer"));
        System.out.println(fichero5.getAbsolutePath()+(fichero5.canRead()?" Se puede leer":" No se puede leer"));
        
        
        

        System.out.println(fichero1.getAbsolutePath()+(fichero1.canWrite()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero2.getAbsolutePath()+(fichero2.canWrite()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero3.getAbsolutePath()+(fichero3.canWrite()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero4.getAbsolutePath()+(fichero4.canWrite()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero5.getAbsolutePath()+(fichero5.canWrite()?" Se puede escribir":" No se puede escribir"));
        
        
        
        System.out.println(fichero1.getAbsolutePath()+(fichero1.canExecute()?" Se puede ejecutar":" No se puede escribir"));
        System.out.println(fichero2.getAbsolutePath()+(fichero2.canExecute()?" Se puede ejecutar":" No se puede escribir"));
        System.out.println(fichero3.getAbsolutePath()+(fichero3.canExecute()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero4.getAbsolutePath()+(fichero4.canExecute()?" Se puede escribir":" No se puede escribir"));
        System.out.println(fichero5.getAbsolutePath()+(fichero5.canExecute()?" Se puede escribir":" No se puede escribir"));
        
   
		
	}

}
