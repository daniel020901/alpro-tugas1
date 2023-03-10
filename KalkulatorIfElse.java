package com.tutorial;

import java.util.Scanner;
public class KalkulatorIfElse {

	public static void main(String[] args) {
		
		// a operator b
		Scanner inputUser;
		float a,b,hasil;
		char operator;
		
		inputUser = new Scanner(System.in);
		
		System.out.println("nilai a = ");
		a = inputUser.nextFloat();
		System.out.println("operator = ");
		operator = inputUser.next().charAt(0);
		System.out.println("nilai b = ");
		b = inputUser.nextFloat();
		
		System.out.println("input user = " + a +" " + operator + " " + b );
		
		if (operator == '+') {
			//pertambahan
			hasil = a + b;
			System.out.println(" hasil  = " + hasil);
		}else if (operator == '-') {
			//pengurangan
			hasil = a - b;
			System.out.println("hasil = " + hasil);
		}else if (operator == '*') {
			//perkalian
			hasil = a * b;
			System.out.println("hasil = " + hasil);
		}else if (operator == '/') {
			if (b == 0) {
				System.out.println("bagi 0 tidak bisa" + b);
			}else {
				hasil = a / b;
			System.out.println("hasil = " + hasil);
			}
		}else {
			System.out.println("hasil tidak ditemukan ");
		}


		
		

	}

}
