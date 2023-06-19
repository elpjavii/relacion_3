package relacion_3;

import java.util.Scanner;

public class ej_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] num = new int[2];
		int v1 = 0; int v2 = 0;
		int aux;
		
		for (int i = 0; i<2; i++) {
			System.out.println("pasa el numero "+(i+1)+":  ");
			num[i] = teclado.nextInt();
				if (i == 0) {
					v1 = num[i];
				}else {
					v2 = num[i];
				}
		}

		if (v2 < v1) {
			aux = v1;
			v1 = v2;
			v2 = aux;
		}
		
		while (v1 < v2+1) {
			if(v1 % 2 != 0) {
				System.out.println(v1);
			}
			v1++;
		}
		
		
		
		System.out.println(v1+" "+v2);
		teclado.close();
	}

}
