package relacion_3;

import java.util.Scanner;

public class ej_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("pasa el numero:  ");
		int num = teclado.nextInt();
		int x = 0;
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0) x = x + i;
		}
		if(x == num) {
			System.out.println("es perfecto");
		}else {
			System.out.println("no perfecto");
		}
	}

}
