package relacion_3;

import java.util.Scanner;

public class ej_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		boolean primo=true;
		for(int i = 2; i <= Math.sqrt(num) && primo; i++) {
			if (num % i == 0) {
				System.out.println("no es primo");
				primo=false;
				return;
			}
		}
		System.out.println("es primo");
		teclado.close();
	}

}
