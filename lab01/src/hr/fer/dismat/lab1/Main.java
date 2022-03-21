package hr.fer.dismat.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x0, x1, a0, a1;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvo rjesenje x_0 karakteristicne jednadzbe: ");
		x0 = sc.nextDouble();
		System.out.print("Unesite drugo rjesenje x_1 karakteristicne jednadzbe: ");
		x1 = sc.nextDouble();
		
		System.out.print("Unesite vrijednost nultog clana niza a_0: ");
		a0 = sc.nextDouble();
		System.out.print("Unesite vrijednost prvog clana niza a_1: ");
		a1 = sc.nextDouble();
		
		Niz niz = new Niz(x0, x1, a0, a1);
		
		System.out.print("Unesite redni broj n trazenog clana niza: ");
		n = sc.nextInt();
		
		System.out.println("Vrijednost n-tog clana niza pomocu formule: " + niz.nClanFormula(n));
		System.out.println("Vrijednost n-tog clana niza iz rekurzije: " + niz.nClanRekurzija(n));
		
		sc.close();
		
		
	}
	
}


