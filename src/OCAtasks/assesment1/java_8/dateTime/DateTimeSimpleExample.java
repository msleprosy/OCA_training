package OCAtasks.assesment1.java_8.dateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by veronika on 18.04.2019.
 */
public class DateTimeSimpleExample {

    public static void main(String[] args){
        LocalTime localTime = LocalTime.of(4, 44, 44);//can't create Date/Time via calling constructor, which is private
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("LocalDate: " + LocalDate.now());//months are counting from 1
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("LocalDateTime with Formatter: " + LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("LocalDateTime with short Formatter: " + shortDateTime.format(LocalDateTime.now()));
        System.out.println("LocalDateTime with short Formatter: " + LocalDateTime.now().format(shortDateTime));
        System.out.println("ZonedDateTime: " + ZonedDateTime.now());

        /*System.out.println(LocalDate.of(3000, Month.APRIL, 18));
        System.out.println(LocalTime.of(3, 33, 33));*/
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        //System.out.println(ZonedDateTime.of(LocalDate.now(), LocalTime.now(), zoneId));
        System.out.println("Instant: " + Instant.now());


    }
}
