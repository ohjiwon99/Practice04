package com.javaex.Practice;

public class Ex03 {

	public static void main(String[] args) {
	     /*[문제] Ex03 아래코드의 출력값을 예상하고 코드로 확인해 보세요.*/
	      
	      int[] intA = {3,6,9};
	      
	      int[] intB;
	      intB = intA;
	      intB[0] = 20;
	      intB[2] = 10;
	      
	      for (int i = 0; i < intA.length; i++) {
	         System.out.println(intA[i]);
	         
	      }
	      

	}

}
