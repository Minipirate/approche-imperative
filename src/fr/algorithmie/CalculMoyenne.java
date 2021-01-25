/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class CalculMoyenne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage de la moyenne des éléments du tableau ------------- ");
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
			
			int somme = 0;
			for (int i =0; i < array.length; i++) {
				somme += array[i];
			}
			float moyArray = (float) somme / array.length;	
				
			System.out.print(moyArray);
	}
}
