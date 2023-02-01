package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
				
				
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-02-01");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-01T14:25:30");
		Instant d06 = Instant.parse("2023-02-01T00:10:30Z");
		Instant d07 = Instant.parse("2023-02-01T14:25:30-03:00");
		
		LocalDate d08 = LocalDate.parse("01/02/2023",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("01/02/2023 14:25:20",fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 02, 01);
		LocalDateTime d11 = LocalDateTime.of(2023, 02, 01, 14, 30, 27);
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
		System.out.println();
		
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));
		System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d06: " + fmt3.format(d06));
		System.out.println("d04: " + d04.format(fmt4));
		System.out.println("d06: " + fmt5.format(d06));
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
		System.out.println();
		
		System.out.println("d04 dia: " + d04.getDayOfMonth());
		System.out.println("d04 mes: " + d04.getMonthValue());
		System.out.println("d04 ano: " + d04.getYear());
		System.out.println();
		
		System.out.println("d05 hora: " + d05.getHour());
		System.out.println("d05 minuto: " + d05.getMinute());
		System.out.println("d05 segundo: " + d05.getSecond());
		
		
	}

}
