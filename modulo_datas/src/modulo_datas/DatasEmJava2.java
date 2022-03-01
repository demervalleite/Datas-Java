package modulo_datas;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DatasEmJava2 {
	
	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/10/2021");//A pessoa comprando hoje
		
		Calendar calendar = Calendar.getInstance(); //estancia calendar
		calendar.setTime(dataInicial);// seta a data inicial
		
        for(int parcela = 1; parcela <= 6; parcela ++) {// serão 12 parcelas
        	calendar.add(Calendar.MONTH, 1);//um boleto a cada 30 dias ou seja 01 mes e depois adiciona +1 mes
        	
        	System.out.println("Parcela de numero : " + parcela + "  Vencimento será em " 
        	+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        	
        }
		
		
	}

}
