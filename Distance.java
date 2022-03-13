package day5coreJavafunctions;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the x and y co-ordinate :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			double distance=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
			System.out.println("The distance from the origin is : "+ distance);
	}

}
