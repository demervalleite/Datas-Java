package modulo_datas;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-10-10"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
		
		
		
		
	
		
		
		//----------------------------------------------------------------------
		
		/*Calendar calendar = Calendar.getInstance();//Pega a data atual
		
		
		//Simular data que vem do banco de dados
		
	     calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2021"));
		
		calendar.add(calendar.DAY_OF_MONTH,0);//pegue o dia do mês e aumente 5 dias
		
		System.out.println("Somando dia do mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.MONTH,1);
		
		System.out.println("Somando 1 mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		 
        calendar.add(calendar.YEAR,1);
		
		System.out.println("Somando 1 Ano " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));*/
		 
		//----------------------------------------------------------------------------- 
		
		/*SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date datavencimentoBoleto = (Date) simpleDateFormat.parse("10/10/2021");
		
		Date dataAtualHoje = (Date) simpleDateFormat.parse("08/01/2021");
		
		if(datavencimentoBoleto.after(dataAtualHoje)) {//Se a data de hoje for inferior que a data de vencimento
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto Vencido - URGENTE");
		}*/
		
	}

}
