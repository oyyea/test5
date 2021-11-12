package test5;

public class LinearEquation {
	double a,b,c,d,e,f;
	LinearEquation(){
		a=0;b=0;c=0;d=0;e=0;f=0;
	}
	public void getNum(double a,double b,double c,double d,double e,double f) {
		this.a=a;this.b=b;this.c=c;
		this.d=d;this.e=e;this.f=f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0) {
			return true;
		}
		return false;
	}
	public double getX() {
		if(!isSolvable()) {
			return -1;
		}
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		if(!isSolvable()) {
			return -1;
		}
		return (a*f-e*c)/(a*d-b*c);
	}
}
