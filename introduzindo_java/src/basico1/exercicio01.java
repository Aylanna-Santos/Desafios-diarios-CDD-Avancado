package basico1;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		int valor;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Digite um número:");
		valor = num.nextInt(); 
		
		if (valor > 0) {
		System.out.println("Seu número é positivo");
		}
		else {
		System.out.println("Seu número é negativo");
		}


	}

}
