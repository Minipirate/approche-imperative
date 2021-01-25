/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class RechercheMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage du plus petit élément du tableau ------------- ");
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
			int minArray = array[0];
			
			for (int i =0; i < array.length; i++) {
				if (array[i] < minArray) {
					minArray = array[i];
				}
			}
			System.out.print(minArray);
		}
	}