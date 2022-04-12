package academy.devdojo.maratonajava.introduca;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 17;
		String categoria = "olha";
		
		
		if(idade < 15) {
			System.out.println("não obrigatorio");
			categoria ="infantil";
		
		}else if(idade > 16 && idade < 21) {
			
			System.out.println("Tirar titulo - não obrigatorio");
			categoria ="adolescente";
			
		}else if (idade > 21){
			System.out.println("Tirar titulo - obrigatorio");
			categoria ="adulto";
		}
		
		System.out.println(categoria);
		
	}

}
