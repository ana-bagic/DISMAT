package hr.fer.dismat.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Unesite ime datoteke:");
		Scanner graf = new Scanner(new File(sc.nextLine()));
		
		n = graf.nextInt();
		int[][] MS = new int[n][n];
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				MS[i][j] = graf.nextInt();
			}
		}
		
		Graf gf = new Graf(n, MS);
		int struk = gf.strukGrafa();
		if (struk < 0)
			System.out.println("Zadani graf nema struka/ciklusa.");
		else
			System.out.println("Struk zadanog grafa je " + struk);
		
		graf.close();
		sc.close();
		
		return;
	}
}
