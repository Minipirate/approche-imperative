/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class RechercheMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("------------- Affichage du plus grand élément du tableau ------------- ");
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
			int maxArray = array[0];
			
			for (int i =0; i < array.length; i++) {
				if (array[i] > maxArray) {
					maxArray = array[i];
				}
			}
			System.out.print(maxArray);
		}
	}