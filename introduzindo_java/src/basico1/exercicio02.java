package basico1;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
int num, num2, num3;
		
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um número:");
		num = numero.nextInt();
		
		Scanner numero2 = new Scanner(System.in);
		System.out.println("Digite um número:");
		num2 = numero2.nextInt();
		
		Scanner numero3 = new Scanner(System.in);
		System.out.println("Digite um número:");
		num3 = numero3.nextInt();
		
		if ((num > num2) && (num > num3)) {
			System.out.println("O número " + num + " é o maior ");
		}
		else if ((num2 > num) && (num2 > num3)) {
			System.out.println("O número " + num2 + " é o maior ");
		}
		else if ((num3 > num2) && (num3 > num)) {
			System.out.println("O número " + num3 + " é o maior ");
		}

	}

}
