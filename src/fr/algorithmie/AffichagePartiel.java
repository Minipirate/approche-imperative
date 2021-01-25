/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class AffichagePartiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("------------- Affichage des entiers supérieurs à 3 uniquement ------------- ");
			
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] > 3) {
					
				System.out.print(array[i] + " ");
				}
			}
			System.out.println("\n------------- Affichage des entiers pairs uniquement ------------- ");
			
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] %2 == 0) {
					System.out.print(array[i] + " ");
				}
			}
			System.out.println("\n------------- Affichage des valeurs correspondantes aux index pairs uniquement ------------- ");

			for (int i = 0; i < array.length; i++) {
				if (i %2 == 0) {
					System.out.print(array[i] + " ");
				}
			}
			System.out.println("\n------------- Affichage des valeurs correspondantes aux entiers impairs uniquement ------------- ");
			
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] %2 == 1 || array[i] %2 == -1) {
					System.out.print(array[i] + " ");
				}
			}
	}		
}
