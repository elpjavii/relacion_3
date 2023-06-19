package relacion_3;

import java.util.Scanner;

public class ej_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(num+"*"+i+"= "+num*i);
		}
		teclado.close();
	}

}
