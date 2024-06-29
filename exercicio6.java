package basico1;

import java.util.Scanner;

public class exercicio06_em_casa {

	public static void main(String[] args) {
		
		Scanner interrogacao = new Scanner(System.in);

		char Perg1, Perg2, Perg3, Perg4, Perg5;
		int resp_sim = 0;
		
		System.out.println("Telefonou para a vítima?\nDigite 1 'sim' e 2 para 'não'");
		Perg1 = interrogacao.next().charAt(0);
		System.out.println("Esteve no local do crime?\nDigite 1 'sim' e 2 para 'não'");
		Perg2 = interrogacao.next().charAt(0);
		System.out.println("Mora perto da vítima?\nDigite 1 'sim' e 2 para 'não'");
		Perg3 = interrogacao.next().charAt(0);
		System.out.println("Devia para a vítima?\nDigite 1 'sim' e 2 para 'não'");
		Perg4 = interrogacao.next().charAt(0);
		System.out.println("Já trabalhou com a vítima?\nDigite 1 'sim' e 2 para 'não'");
		Perg5 = interrogacao.next().charAt(0);
		
        	if ((Perg1 == 'S') || (Perg1 == 's')) {
        		resp_sim++;
        	}
        	if ((Perg2 == 'S') || (Perg2 == 's')) {
        	resp_sim++;
        	}
        	if ((Perg3 == 'S') || (Perg3 == 's')) {
        		resp_sim++;
        	}
        	if ((Perg4 == 'S') || (Perg4 == 's')) {
        		resp_sim++;
        	}
        	if ((Perg5 == 'S') || (Perg5 == 's')) {
        		resp_sim++;
        	}
        
        	if ((resp_sim == 0) || (resp_sim == 1)) {
        		System.out.println("Inocente");
        	}else if (resp_sim == 2) {
	        	System.out.println("Suspeito");
        	}else if ((resp_sim == 3) || (resp_sim == 4)) {
        		System.out.println("Cúmplice");
	        }else if (resp_sim == 5) {
        		System.out.println("Assassino");
        	}

		
	}

}
