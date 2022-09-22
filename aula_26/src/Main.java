import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		String x;
		int b;
		double c;
		char d;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//Locale.setDefault(Locale.US); get the location if use dot or comma
		
		
		
		System.out.println("Digite seu nome: ");
		
		x = sc.next();
		
		System.out.println("Voce digitou: " + x);
		
		System.out.println("Digite um numero: ");
		b = sc.nextInt();
		
		System.out.println("O numero digitado foi: " + b );
		
		System.out.println("Digite um numero com ponto flutuante: ");
		c = sc.nextDouble();
		
		System.out.println("O numero com ponto é: " + c);
		System.out.printf("O numero digitado foi: %.2f%n", c);// put the number with a comma 
		                                                      // choose the number of decimal places 
		System.out.println("Digite seu sexo Masculino/Feminino: ");
		d = sc.next().charAt(0);
		
		System.out.println("Seu sexo é: " + d);
		sc.close(); 
		*/
		x = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		d = sc.next().charAt(0);
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//reading data and showing in sequence
	}

}
