package basico1;

import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {
		char opcao;
		Scanner input = new Scanner(System.in);
		System.out.println("Qual a sua opção F ou M?");
		opcao = input.next().charAt(0);
		
		if ((opcao == 'F') || (opcao == 'f')) {
			System.out.println("Feminino");
		}
		else if ((opcao == 'M') || (opcao == 'm')) {
			System.out.println("Masculino");
		}
		else {
			System.out.println("Character inválido ");
		}
	}
}
