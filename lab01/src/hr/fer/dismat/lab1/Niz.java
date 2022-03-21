package hr.fer.dismat.lab1;

public class Niz {

	private double x0, x1, a0, a1;
	
	Niz(double x0, double x1, double a0, double a1) {
		this.x0 = x0;
		this.x1 = x1;
		this.a0 = a0;
		this.a1 = a1;
	}

	public double nClanFormula(int n) {
		double p0, p1;
		double nClan = a0;
		
		p1 = (a1 - a0*x0)/(x1 - x0);
		p0 = a0 - p1;
		nClan = p0*Math.pow(x0, n) + p1*Math.pow(x1, n);
		
		return nClan;
	}

	public double nClanRekurzija(int n) {
		double p0 = - (x0 + x1);
		double p1 = x0*x1;
		double nClan = a0;
		
		for (int i = 2; i <= n; ++i) {
			nClan = - p0*a1 - p1*a0;
			a0 = a1;
			a1 = nClan;
		}
		
		return nClan;
	}
}
