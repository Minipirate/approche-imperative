/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author Ness'ti
 *
 */
public class InversionContenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Tableau arrayCopy dans l'ordre inverse -------------");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayCopy = new int [array.length];
		
		for (int i = array.length-1; i >= 0; i--){
			arrayCopy[i] = array[array.length-i-1];
		}
		System.out.println(Arrays.toString(arrayCopy));
		
		System.out.println("------------- Affichage des deux tableaux -------------");
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayCopy));
	}
}

