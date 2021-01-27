/**
 * 
 */
package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifPlusMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme sous forme de jeu ------------- ");
		System.out.println(" ");
		
		Random r = new Random();
		int essai = 0; 
		int numberOkay = r.nextInt(100)+1; 
		int number; 
		
		System.out.println("Entrez un num�ro entre 1 et 100"); 
		
		Scanner scan = new Scanner(System.in); 
		number = scan.nextInt();
		essai++;
		
		while(numberOkay != number) { 
				
			if(numberOkay > number) {
				System.out.println("C'est plus !");
			} else {
				System.out.println("C'est moins !");
			}
			
			number = scan.nextInt();
			essai++; //r�cup�ration du nombre d'essai
		}
		
		System.out.println("Bravo ! Vous avez trouv� en : " + essai + " coup(s)");
	}
}
