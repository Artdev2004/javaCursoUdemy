import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(y < x) {
			if(x % y == 0) {
				System.out.println("MÚLTIPLOS");
			}
			else {
				System.out.println("NÃO SÃO MULTIPLOS");
			}
		}
		else if(y % x == 0) {
			System.out.println("MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		sc.close();
		
	}

	}


