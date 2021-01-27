/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifChiffresSuivants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme qui demande à l'utilisateur un nombre puis affiche les 10 nombres suivants ------------- ");
		System.out.println(" ");
		
		int number;
		
			System.out.println("Veuillez saisir un nombre svp !");
			Scanner scan = new Scanner(System.in);
			number = scan.nextInt();
			System.out.println("Les dix nombres suivants de : " + number + " sont : ");
			
			for (int i = number+1; i < number+11; i++) {
				System.out.print(i + "-");
			}
	}
}

	
