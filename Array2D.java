package day5coreJavafunctions;

import java.util.Random;
import java.util.Scanner;

public class Array2D {
	public void setArray(int[][] array) {
	    	Random randomInt=new Random();
	    	for(int r=0;r<array.length;r++) {
	    		for(int c=0;c<array[r].length;c++) {
	    			array[r][c]=randomInt.nextInt(100);   ////array will show only element within 100 
	    		}
	    	}
	    }
	    
	 public   void getArray(int[][] array) {
	    	
	    	for(int r=0;r<array.length;r++) {
	    		for(int c=0;c<array[r].length;c++) {
	    			System.out.printf("%d \t",array[r][c]);
	    		}
	    		System.out.println();
	    	}
	    }
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the dimension of array");
		        int m=sc.nextInt();
		        int n=sc.nextInt();
		        int[][] array=new int [m][n];
		        Array2D obj=new  Array2D ();
		        obj.setArray(array);
		        obj.getArray(array);
			

		
	}

}
