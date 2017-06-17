package project1;

import java.util.Scanner;

public class sdz2 {

	public static void main(String[] args) {
		int degreF;
		int degreC;
		char rep ='O';
		while(rep =='O')
		{
			System.out.println("choisissez le mode de conversion\n");
			System.out.println("1 - Fahrenheit -> Celsius");
			System.out.println("2 - Celsius -> Fahrenheit");
			Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			while(choix != 1 && choix!=2)
			{
				System.out.println("svp tapez uen valeur entre 1 et 2\n");
				choix = sc.nextInt();
			}
			if(choix ==1){
				System.out.println("entrez votre valeur en F");
				degreF = sc.nextInt();
				degreC = ((degreF-32)*5)/9 ;
				System.out.println(degreF+"Fahrenheit correspond à "+ degreC +" degrés celcius");
			}
			if(choix ==2){
				System.out.println("entrez votre valeur en C°");
				degreC = sc.nextInt();
				degreF = (9/5)*degreC + 32;
				System.out.println(degreC +" degrés Celcius correspond à " + degreF + " degrés Fahrenheit ");
			}
			
			System.out.println("voulez vous recommencer ? (O/N)");
			sc.nextLine();
			rep = sc.nextLine().charAt(0);
			
			
		}
		System.out.println("gb my fiend");
		
	}

}
