package com.javaex.Practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		System.out.println(c);
		

		// 배열의 검사하여 공백이면 콤마로 변경
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}

		// 문장 출력
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("");
	
	
	sc.close();}

}
