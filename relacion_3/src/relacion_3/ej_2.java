package relacion_3;

import java.util.Scanner;

public class ej_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		int i = 1;
		while(i < 11) {
			System.out.println(num+"*"+i+"= "+num*i);
			i++;
		}
		teclado.close();
	}

}
