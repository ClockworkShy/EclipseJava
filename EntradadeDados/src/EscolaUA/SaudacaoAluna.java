package EscolaUA;

import java.util.Scanner;

public class SaudacaoAluna {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nome da Aluna: ");
		String nome = teclado.nextLine();
		
		System.out.print("Quantos projetos você já criou ?");
		int quantidade = teclado.nextInt();
		
		System.out.print("✨ Bem-vinda, " + nome + "! Já criou " + quantidade + " projetos brilhantes!");
		
		teclado.close();
	}
}
