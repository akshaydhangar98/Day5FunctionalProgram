package day5coreJavafunctions;

import java.util.Scanner;

public class OuadraticRoot {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value a,b,c :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int delta=b*b-4*a*c;
		if(delta>=0) {
			double rootX=(-b+Math.sqrt(delta))/(2*a);
			double rootY=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("The roots are "+rootX+" "+rootY);
		}
		else {
			System.out.println("Roots are imaginary");
			scan.close();
		}
	}
	}
