/**
 * 
 */
package fr.algorithmie;
import java.util.Arrays;

/**
 * @author Ness'ti
 */
public class AffichageInverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("------------- Affichage de l'ensemble des éléments via une boucle -------------");
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("------------- Affichage de l'ensemble des éléments dans l'ordre inverse -------------");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("------------- Tableau arrayCopy ------------- ");
		int[] arrayCopy = new int [array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		System.out.println(Arrays.toString(arrayCopy));
	}
}

