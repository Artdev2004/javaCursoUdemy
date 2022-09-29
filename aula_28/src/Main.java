
public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0; // good habits - if the number is float or double put .0
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // square root of x
		B = Math.sqrt(y); // square root
		C = Math.sqrt(25.0); // square root
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);// potentiation (where letter x is the base and letter y is the exponent)
		B = Math.pow(x, 2.0);// potentiation
		C = Math.pow(5.0, 2.0);// potentiation 
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 Elevado ao quadrado = " + C);
		
		A = Math.abs(y);//absolute value (turns the number into positive)
		B = Math.abs(z);// absolute value
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
