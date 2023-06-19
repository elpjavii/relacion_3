package relacion_3;

import java.util.Scanner;

public class ej_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		int x = 0;
		for (int i = 0; i <= num; i++) x = x + i;
		
		System.out.println(x);

	}

}
