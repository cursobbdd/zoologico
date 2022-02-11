package es.elorrietaErrekamari.curso.gestor;

import es.elorrietaErrekamari.curso.bbdd.gestores.*;
import es.elorrietaErrekamari.curso.menu.Menu;

public class Gestor {

	private Menu menu = null;

	public Gestor() {
		menu = new Menu();
	}
	
	public void empezarGestor () {
		int opcion = 0;
		do {
			opcion=menu.mostrarMenu();
			ejecutarOpcionMenu(opcion);
		}while(opcion != 3);
	}

	private void ejecutarOpcionMenu(int opcion) {
		// TODO Auto-generated method stub
		switch (opcion)
		{
		case 1: menu.mostrarInserts();
		case 2: hacerSelects();
		case 3: System.out.println("Adios!!");
		default: System.out.println("Opcion incorrecta");
				 empezarGestor();
		}
	}
	
	
	public void elegirInsert() {
		
		int opcion = menu.mostrarInserts();
		
		switch(opcion)
		{
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: 
		default: 
			//Si no es ninguno de estos casos, haz default
		}
		
	}
	
	
}
