package estudos.maratonajava.javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate data =  LocalDate.now();
        String d1 = data.format(DateTimeFormatter.BASIC_ISO_DATE);
        String d2 = data.format(DateTimeFormatter.ISO_DATE);
        String d3 = data.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDateTime.now().format(formatterBR);
        System.out.println(formatBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("24.May.2023", formatterGR);
        System.out.println(parseGR);
    }
}
