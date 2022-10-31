import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, tot, res;
		System.out.println("HORA INICIAL DO JOGO: ");
		hi = sc.nextInt();
		System.out.println("HORA FINAL: ");
		hf = sc.nextInt();
		
		if(hi == hf) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if(hi > hf) {
			tot= hi - hf;
			res = 24 - tot;
			System.out.println("O JOGO DUROU " + res + " HORA(S)");
		}
		else {
			tot = hf - hi;
			System.out.println("O JOGO DUROU " + tot + " HORA(S)");
		}
		sc.close();
	}

}
