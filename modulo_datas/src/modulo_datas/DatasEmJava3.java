package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava3 {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana :" + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do mes  :" + localDate.getDayOfMonth());
		
		System.out.println("Dia do Ano :" + localDate.getDayOfYear());
		
		System.out.println("Dia do Ano :" + localDate.getMonthValue());
		
		System.out.println("Mes do Ano : " + localDate.getMonth());
		
		System.out.println("Ano :" + localDate.getYear());
		
		
		
		
		
	}

}
