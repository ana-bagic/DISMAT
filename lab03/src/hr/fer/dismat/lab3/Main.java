package hr.fer.dismat.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime datoteke:");
		Scanner graf = new Scanner(new File(sc.nextLine()));
		
		int n = graf.nextInt();
		int[][] MS = new int[n][n];
		
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				MS[i][j] = graf.nextInt();
			}
		}
		
		Graf gf = new Graf(n, MS);
		int kromBroj = gf.kromBroj();
		if (kromBroj == 0)
			System.out.println("Zadani graf nema kromatski broj.");
		else
			System.out.println("Kromatski broj zadanog grafa je " + kromBroj);
		
		graf.close();
		sc.close();
	}
}
