package pl.camp.it;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println(dayOfWeek);

        System.out.println(localDate.getEra());

        LocalDate innaData = LocalDate.of(1999, 10, 6);

        System.out.println(innaData);

        LocalDate przesunietaData = innaData.plusDays(10);

        System.out.println(przesunietaData);

        LocalTime czas = LocalTime.of(15,35, 45, 334);

        System.out.println(czas);

        LocalDateTime czasIData = LocalDateTime.now();

        System.out.println(czasIData);

        ZonedDateTime dataICzasZeStrefa = ZonedDateTime.now();

        System.out.println(dataICzasZeStrefa);

        System.out.println(dataICzasZeStrefa
                .withZoneSameInstant(ZoneId.of("Australia/Sydney")));

        Instant instant = Instant.now();

        System.out.println(instant);

        LocalDateTime czas1 = LocalDateTime.of(2020, 1, 19, 12, 00,00);
        LocalDateTime czas2 = LocalDateTime.of(2021, 4, 11, 14, 35,00);

        Duration duration = Duration.between(czas1, czas2);

        System.out.println(duration);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");



        LocalDate ld = LocalDate.parse("2017/03/13", dateTimeFormatter);

        System.out.println(ld);
    }
}
