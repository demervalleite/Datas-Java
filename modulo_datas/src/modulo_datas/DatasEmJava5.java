package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava5 {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		LocalDate dataAntiga = LocalDate.of(2021, 10, 11);
		
		LocalDate dataNova = LocalDate.of(2021, 12,31 );
		
		        
		System.out.println("Data antiga é maior que data nova " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a data nova " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais ? " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println(" falta " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias " + " para o fim do Ano ");
	}

}
