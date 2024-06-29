package basico1;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		double nota1, nota2;
		Scanner nota = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		nota1 = nota.nextInt();
		
		System.out.println("Digite a segunda nota:");
		nota2 = nota.nextInt();
		
		System.out.println((nota1 + nota2)/2);

	}

}
