package com.javaex.Practice;

import java.util.Scanner;

public class Ex05 {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] dArray = new int[5];
		int num;
		double sum = 0;
		
		for (int i = 0; i < dArray.length; i++) {
			num = sc.nextInt();
			dArray[i] = num;
		}
		
		for (int i = 0; i < dArray.length; i++) {
			sum+=dArray[i];
		}
		
		System.out.println("평균은"+sum/dArray.length+"입니다.");
		
		
		
		
		
	
	
	
	
	
	sc.close();}

}
