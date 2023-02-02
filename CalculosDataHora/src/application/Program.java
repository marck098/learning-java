package application;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-02-01");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-01T14:25:30");
		Instant d06 = Instant.parse("2023-02-01T00:10:30Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); //ADICIONANDO
		LocalDate nextWeekLocalDate = d04.plusDays(7); // SUBTRAINDO
		
		
		System.out.println("pastWeekLocalDate : " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println();

		Instant pastWeekInstant = d06.minus(10, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(10, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nexttWeekInstant: " + nextWeekInstant);
		
		//TEMPO ENTRE DUAS DATAS
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between( d06, pastWeekInstant);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println("DATA/CALENDAR JAVA7");
		System.out.println();
		//DATA E HORA JAVA7
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//CALCULOS
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE); //OBTENDO INFORMAÇÕES DA DATA
		int month = 1 + cal.get(Calendar.MONTH); //JANEIRO É MÊS 0 POR ISSO ADICIONA 1
		
		System.out.println("Calendar 1: " + sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("MONTH: " + month);
		

	}

}
