package es.elorrietaErrekamari.curso.menu;

import java.util.Scanner;
import es.elorrietaErrekamari.curso.bbdd.pojo.*;
import es.elorrietaErrekamari.curso.gestor.Gestor;

public class Menu {

	private Scanner teclado = null;
	
	public int tecladoInt () {
		int ret = 0;
		try {
			ret=teclado.nextInt();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			ret = -1;
		}
		return ret;
	}
	
	public float tecladoFloat () {
		float ret = 0;
		try {
			ret=teclado.nextFloat();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			ret = -1;
		}
		return ret;
	}
	
	public String tecladoString () {
		String ret = null;
		try {
			ret=teclado.nextLine();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return ret;
	}
	
	public int mostrarMenu () {
		int ret = 0;
		
		System.out.println("1. Insertar");
		System.out.println("2. Mostrar");
		System.out.println("3. Salir\n");
		System.out.println("Elige una opcion");
		ret=tecladoInt();
		return ret;
	}

	public int mostrarInserts() {

		Gestor gestor = new Gestor();
		int opcion = 0;
		System.out.println("¿En que tabla quieres insertar datos?\n");
		
		System.out.println("-----------------");
		System.out.println("| 1.   Zoo       |");
		System.out.println("------------------");
		
		System.out.println("-----------------");
		System.out.println("| 2.   Animal    |");
		System.out.println("------------------");
		
		System.out.println("-----------------");
		System.out.println("| 3.   Especie   |");
		System.out.println("------------------");
		
		System.out.println("-----------------");
		System.out.println("| 4.   Familia   |");
		System.out.println("------------------");
		
		System.out.println("-----------------");
		System.out.println("| 5.   Ciudad    |");
		System.out.println("------------------");
		
		System.out.println("-----------------");
		System.out.println("| 6.   Pais       |");
		System.out.println("------------------\n");
		
		opcion=tecladoInt();
		return opcion;
	}
	
	public void datosZoo() {
		
		Zoo zoo = null;
		
		System.out.println("Introduzca nombre del Zoo.");
		String nombre = tecladoString();
		zoo.setNombre(nombre);
		System.out.println("Introduzca el tamaño (en m2) que tendra el zoo");
		int tamaño = tecladoInt();
		zoo.setTamaño(tamaño);
		System.out.println("Introduzca el presupuesto anual con el que contara el zoo: " +zoo.getNombre());
		float presupuesto = tecladoFloat();
		zoo.setPresupuesto(presupuesto);
		System.out.println();
		
	}
}
