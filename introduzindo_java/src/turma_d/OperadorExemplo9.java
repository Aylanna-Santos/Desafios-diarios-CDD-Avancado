package turma_d;

public class OperadorExemplo9 {

	public static void main(String[] args) {
		int idade = 15;
		if(idade < 18) {
			System.out.println("Ex1: Não pode entrar");
		}
		else {
			System.out.println("Ex1: Pode entrar");
		}
		
		boolean amigoDoDono = true;
		if(idade < 18 && amigoDoDono == false) {
			System.out.println("Ex2: Não pode entrar");
		}
		else {
			System.out.println("Ex2: Pode entrar");
		}
	}

}
