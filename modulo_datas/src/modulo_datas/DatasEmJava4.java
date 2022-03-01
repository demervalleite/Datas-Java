package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); 
		
		Instant ifinal = Instant.now();
		
		
		
		Duration duration = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos " + duration.toNanos());
		
		System.out.println("Duração em minutos " + duration.toMinutes());
		
		System.out.println("Duração em nano segundos "+ duration.toHours());
		
		System.out.println("Duração em milissegundos  " + duration.toMillis());
		
		System.out.println("Duração em dias " + duration.toDays());
		
		
		
		
		
	}

}
