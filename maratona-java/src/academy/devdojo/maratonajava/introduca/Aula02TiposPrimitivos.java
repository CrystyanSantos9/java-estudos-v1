package academy.devdojo.maratonajava.introduca;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = (int) 100000000000L;
		
		
		long numeroGrande = 1000L;
		
		long numeroGrande2 = 1000L;
		
		double salarioDouble = 2000.00D;
		
		float salarioFloat = 2500.0F; 
		
		short idadeShort = (short) 32769;
		
		Date dataNascimento = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = dateFormat.format(dataNascimento);
		
		
		
		var numero = 10;
		var nome = "string";
		var Double = 10000D;
		
		System.out.println(formattedDate);

		
	}
}
