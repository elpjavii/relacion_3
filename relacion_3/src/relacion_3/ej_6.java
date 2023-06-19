package relacion_3;

import java.util.Scanner;

public class ej_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		for (int i = 0; i <= num; i++) System.out.println(i*num);
	}

}
