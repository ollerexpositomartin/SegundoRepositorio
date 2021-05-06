package EjemplosBinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Ejemplo29 {

	public static void main(String[] args) {
	
	File fEmpleado = new File("E:"+File.separator+"Ejemplos Ficheros","Empleados.obj");
	Empleados empleado;
	
	try(ObjectOutputStream fSalida = new ObjectOutputStream(new FileOutputStream(fEmpleado)) ){
		empleado = new Empleados("Martin", "Micasa","123456789", "laquesea");
		fSalida.writeObject(empleado);
		
	} catch (IOException ioe) {
		ioe.getMessage();
	}
	
	//30
	try(ObjectInputStream fentrada = new ObjectInputStream(new FileInputStream(fEmpleado))){
		while(true) {
			empleado = (Empleados) fentrada.readObject();
			System.out.println(empleado.toString());
		}
		
	} catch (IOException ioe) {
		ioe.getMessage();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
