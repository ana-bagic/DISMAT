package hr.fer.dismat.lab2;

import java.util.LinkedList;
import java.util.Queue;

public class Graf {

	private final int n;
	private final int[][] MS;
	
	Graf(int n, int[][] MS) {
		this.n = n;
		this.MS = MS;
	}
	
	int strukGrafa() {
		int minCycle = Integer.MAX_VALUE;

	    for(int i = 0; i < n; ++i) {
	      
	    	int[] lengths = new int[n];
	    	for (int j = 0; j < n; ++j) {
	        	lengths[j] = Integer.MAX_VALUE;
	        }
	        lengths[i] = 0;
	        
	        // posjeceni vrhovi
	        int[] parents = new int[n];
	        for (int j = 0; j < n; ++j) {
	        	parents[j] = -1;
	        }
	        
	        // susjedstvo od trenutne tocke
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(i);

	        while(!queue.isEmpty()) {
	            int current = queue.remove();

	            // svi susjedi trenutne tocke
	            for(int j = 0; j < n; ++j) {
	                // trenutna tocka i tocka su susjedi
	                if(MS[j][current] == 1) {
	                    if(lengths[j] == Integer.MAX_VALUE) {
	                        // duljina od pocetne tocke do susjedne tocke
	                        lengths[j] = lengths[current] + 1;
	                        // susjedne tocke u red
	                        queue.add(j);
	                        parents[j] = current;
	                    }

	                    else if (parents[j] != current && parents[current] != j) {
	                        minCycle = Math.min(minCycle, lengths[j] + lengths[current] + 1);
	                    }
	                }
	            }
	        }
	    }

	    if (minCycle == Integer.MAX_VALUE) return -1;
	    return minCycle;
	}
}
