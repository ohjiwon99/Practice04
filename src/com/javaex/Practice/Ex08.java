package com.javaex.Practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}
		int i = 0;
		for (int j = 0; j < i; j++) {
			if (lotto [i] == lotto [j]) {
				--i;
				break;
			}
		}
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + "  ");
		}

	
	
	
	
	
	sc.close();}

}
