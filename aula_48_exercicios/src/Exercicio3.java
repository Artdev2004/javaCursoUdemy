import java.util.Scanner;

public class Exercicio3 {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all = 0, gas = 0, die = 0, cd;
		
		cd = sc.nextInt();
		
		while(cd != 4) {
		
			if(cd == 1) {
				all = all + 1;
			}
			else if(cd ==  2) {
				gas = gas + 1;
 			}
			else if(cd == 3) {
				die = die +1;
			}
			cd = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO\n Alcool: " + all + "\n Gasolina: "
				+ gas + "\n Diesel: " + die);
		
		

	}

}
