package aula_57;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//operadores bitwise == bit a bit
		// & bit a bit
		// | ou bit a bit
		// ^ ou bit exclusivo == se os dois dão verdadeiros então é falso
		
		int numero1 = 89;
		int numero2 = 60;
		
		System.out.println(numero1 & numero2);
		System.out.println(numero1 | numero2);
		System.out.println(numero1 ^ numero2);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// int mask = 0b100000;
		if ((n & 32) != 0) {
			System.out.println("6th bit is true");
			
		}else {
			System.out.println("6th bit is false");
		}
		sc.close();
	}

}
