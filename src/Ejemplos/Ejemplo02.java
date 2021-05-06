package Ejemplos;

import java.io.File;

public class Ejemplo02 {

	public static void main(String[] args) {
		File directorio = new File("C:"+File.separator+"Users"+File.separator+"Martín"+File.separator+"Pictures");
        String[] contenido = directorio.list();
        
        for (String c : contenido)
        	System.out.println(c);
	}

}
