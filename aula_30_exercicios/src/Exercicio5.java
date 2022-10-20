import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		int num1, num2, qtd1, qtd2;
		float sal, uni1, uni2, valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("NÚMERO DA PEÇA 1 e PEÇA 2: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("QUANTIDADE PEÇA 1 e PEÇA 2: ");
		qtd1 = sc.nextInt();
		qtd2 = sc.nextInt();
		System.out.println("VALOR UNITÁRIO DA PEÇA 1 e PEÇA 2: ");
		uni1 = sc.nextFloat();
		uni2 = sc.nextFloat();
		
		valor = (uni1 * qtd1) + (uni2 * qtd2);
		
		
		System.out.printf("VALOR A SER PAGO: U$%.2f", valor);
		
		sc.close();

	}

}
