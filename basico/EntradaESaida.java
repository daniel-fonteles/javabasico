package CursoJava.basico;

import java.util.Scanner;

/*
 * Classe que imprime um texto no console
 * 
 * Versao 1.0
 * 
 * autor: Daniel Fonteles
 * 
 * */
public class EntradaESaida {

	public static void main(String[] args) {
		// Criação de Variáveis
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leitor.nextLine();

		System.out.println("Digite o seu idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Digite o seu altura: ");
		altura = leitor.nextDouble();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		
		System.out.println();
		
		System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f", nome, idade, altura);
		
	}

}
