package org.generation;

import java.util.*; 
/*Hacía falta importar la librería para el scanner, 
 * pero decidií usar el * para importar todo
 */

public class Codigo4 {
	public static void main(String[] args) { 
		// Hacía falta el método public static void main para que pueda ejecutarse el código
		Scanner s = new Scanner(System.in);
		// Hacía falta el System.in para que el constructor de scanner pueda
		// leer la entrada de texto a través del teclado

	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	        	  // Cambié la comparación de cadenas, ya que lo hacía con ==
	        	  // y lo correcto es que sea con equals
	            g = 1;
	          }

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("Hubo un error");
	        	return;
	        	// Quize complementar el default para que se vea mejor 
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	
	}
}
