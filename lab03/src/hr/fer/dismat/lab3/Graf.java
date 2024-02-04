package hr.fer.dismat.lab3;

public class Graf {

	private final int n;
	private final int[][] MS;
	
	Graf(int n, int[][] MS) {
		this.n = n;
		this.MS = MS;
	}
	
	int kromBroj() {
		int kromBroj = Integer.MAX_VALUE;
		int tmp;
		
		for (int i = 0; i < n; ++i) {
			tmp = kromBrojG(i);
			if (tmp < kromBroj)
				kromBroj = tmp;
		}
		
		return kromBroj;
	}

	int kromBrojG(int pomak) {
		
		int[] vrhovi = new int[n];
		int boja;
		int krom = 1;
		
		for (int i = 0; i < n; ++i) {
			vrhovi[i] = 0;
		}
		vrhovi[pomak] = 1;
		
		for (int i = pomak + 1; i != pomak; ++i, i %= n) {
			i %= n;
			boja = 1;
			
			for (int j = pomak; j != i; ++j, j %= n) {
				if(MS[i][j] == 1 && vrhovi[j] == boja) {
					++boja;
					j = pomak;
				}		
			}
		
			if(boja > krom)
				++krom;
			
			vrhovi[i] = boja;
		}
		
		return krom;
	}
}