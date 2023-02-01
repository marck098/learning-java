package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-02-01");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-01T14:25:30");
		Instant d06 = Instant.parse("2023-02-01T00:10:30Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		
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
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between( d06, pastWeekInstant);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
		
		

	}

}
