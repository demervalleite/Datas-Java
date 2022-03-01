package modulo_datas;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasNovaApi8 {
	
	public static void main(String[] args) {
		
		// Nova API Aparti do Java 8
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual :" + horaAtual.format(DateTimeFormatter.ofPattern(" HH:mm:ss")));
		
		LocalDateTime DataHora = LocalDateTime.now();
		System.out.println("Hora e data atual :" + DataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		
		
		
		
		
	}
	
	
	

}
