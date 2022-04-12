package academy.devdojo.maratonajava.introduca;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula14TiposPrimitivosExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome ="Crystya";
		String endereco = "Rua das pitangas n 28";
		float salario = 5000.55F;
		Date data = new Date();
		ZonedDateTime now = ZonedDateTime.now();
		GregorianCalendar calendar = new GregorianCalendar();
		LocalDateTime fiveHoursBefore = LocalDateTime.now().minusHours(5);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = dateFormat.format(data);
	
		
		
	
		
		
		
		System.out.println(" Eu " + nome + ", morando no endereço" + endereco + ","
				+ "\n confirmo que eu recebi "
				+ "o salário de " + salario + " na data " + formattedDate);

	}

}
