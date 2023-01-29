import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x  = sc.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha inválida");
			x = sc.nextInt();

		}
		System.out.println("Acesso permitido");

	}

}
