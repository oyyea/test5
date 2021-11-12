package test5;

import java.util.Scanner;

public class LinearEquationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("«Î ‰»Îa,b,c,d,e,fµƒ÷µ£∫ ");
		Scanner sc=new Scanner(System.in);
		double a,b,c,d,e,f;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		e=sc.nextDouble();
		f=sc.nextDouble();
		LinearEquation x=new LinearEquation();
		x.getNum(a, b, c, d, e, f);
		if(x.isSolvable()) {
			System.out.println(x.getX()+","+x.getY());
		}else {
			System.out.println("The equation has no solution");
		}
	}

}
