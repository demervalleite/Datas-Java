package modulo_datas;

import java.time.LocalDate;
import java.text.ParseException;

public class DatasEmJava6 {
	
	public static void main(String[] args)throws ParseException, InterruptedException  {
		
		LocalDate dataBase = LocalDate.parse("2021-10-11");
		
		System.out.println("Mais 5 dias : " + (dataBase.plusDays(5)));
		
		System.out.println("Mais 5 Semanas : " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos : " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 2 meses :" + (dataBase = dataBase.plusMonths(2)));
		
	}

}
