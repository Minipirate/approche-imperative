/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifPlusGrand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme qui demande à l'utilisateur dix nombres puis affiche le plus grand de ces nombres ------------- ");
		System.out.println(" ");
		
		int number;
		int max = 0;
		
		System.out.println("Veuillez saisir dix nombres svp !");
		Scanner scan = new Scanner(System.in);
	
		
		for (int i = 1; i<=10; i++) {
			number = scan.nextInt();
			if (number > max) {
				max = number;
			}
			if (i < 10) {
				System.out.println("Merci d'avoir entré un nombre, veuillez en saisir un nouveau !");
			} else {
				System.out.println("Merci d'avoir entré les dix valeurs !");
			}
		}
		System.out.println("Voici la valeur maximale des dix nombres saisis : " + max);
	}
}
