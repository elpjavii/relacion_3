package relacion_3;

import java.util.Scanner;

public class ej_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}

	}

}
