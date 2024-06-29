package basico1;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		int n;
		Scanner dia = new Scanner(System.in);
		System.out.println("Digite um número:");
		n = dia.nextInt();
		
		if (n == 1) {
			System.out.println("Domingo");
		}
		else if (n == 2) {
			System.out.println("Segunda");
		}
		else if (n == 3) {
			System.out.println("Terça");
		}
		else if (n == 4) {
			System.out.println("Quarta");
		}
		else if (n == 5) {
			System.out.println("Quinta");
		}
		else if (n == 6) {
			System.out.println("Sexta");
		}
		else if (n == 7) {
			System.out.println("Sábado");
		}
		else {
			System.out.println("Valor inválido");
		}

	}

}
