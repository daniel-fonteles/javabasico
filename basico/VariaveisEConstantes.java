package CursoJava.basico;
/*
 * Classe que imprime um texto no console
 * 
 * Versao 1.0
 * 
 * autor: Daniel Fonteles
 * 
 * */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		// Cria��o de constantes 
		final double ACELERA��O_GRAVIDADE_TERRA = 9.80665;
		
		// Cria��o de vari�veis	
		String nome = "Daniel";
		
		int idade = 22;
		
		double peso = 75, altura = 1.85;
		
		char sexo = 'M', cnh = 'A';
		
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("Sexo: "+sexo);
		System.out.println("Habilita��o: "+cnh);
		System.out.println("Doador de Org�os: "+doadorOrgaos);
		System.out.println("Gravidade na Terra �: "+ACELERA��O_GRAVIDADE_TERRA+" m/s�");
		
		

	}

}
