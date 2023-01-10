import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double prc = 0.0;
		System.out.println("DIGITE O CÓDIGO DO PRODUTO: ");
		cod = sc.nextInt();
		System.out.println("DIGITE A QUANTIDADE DO PRODUTO");
		qtd = sc.nextInt();
		
		if(cod == 1) {
			prc = qtd * 4.0;
		} 
		else if (cod == 2) {
			prc = qtd * 4.5;
		}
		else if (cod == 3) {
			prc = qtd * 5.0;
		}
		else if (cod == 4) {
			prc = qtd * 2.0;
		}
		else if (cod == 5) {
			prc = qtd * 1.5;
		}
		
		System.out.printf("TOTAL: R$ %.2f", prc);
		sc.close();
		
	}

}
