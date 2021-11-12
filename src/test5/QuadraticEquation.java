package test5;

public class QuadraticEquation {
	double a,b,c;
	QuadraticEquation(){
		a=0;b=0;c=0;
	}
	public void getABC(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double der() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		if(der()<0) return 0;
		return (-b+Math.sqrt(der()))/2/a;
	}
	public double getRoot2() {
		if(der()<0) return 0;
		return (-b-Math.sqrt(der()))/2/a;
	}
}
