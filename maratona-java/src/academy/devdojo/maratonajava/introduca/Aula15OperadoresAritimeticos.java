package academy.devdojo.maratonajava.introduca;

public class Aula15OperadoresAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numerador =  10;
		int denominador = 20;
		
		double divisao = numerador / (double) denominador;
		
		int resto = 21 % 2;
		
		System.out.println(resto);
		
		boolean isDezMaiorQueVinte = 10 > 20;
		
		System.out.println(isDezMaiorQueVinte);

		int idade = 35;
		float salario = 5000F;
		
		boolean isElegivel = idade > 30 && salario < 4000;
		boolean isNotElegivel = idade > 30 && salario > 400;
		

		System.out.println("isElegivel " + isElegivel);
		System.out.println("isElegivel " + isNotElegivel);
	}

}
