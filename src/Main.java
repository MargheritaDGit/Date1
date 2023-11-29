//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {


        String inputString =  "2002-03-01T13:00:00Z"; /*"2002-03-01T13:00:00+00:00Z"; "2002-03-01T13:00:00Z";*/
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);
        //ZoneId zoneIdOffset = ZoneId.ofOffset("UTC", ZoneOffset.UTC);
       // ZoneId zoneIdUtc = ZoneId.of("UTC");

        String formattedFull = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String formattedMedium = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String formattedShort = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

       // ZoneId zone;
        //zone = offsetDateTime.getZone();
        ZoneId zone = offsetDateTime.getOffset();

        System.out.println("La versione FULL è: " + formattedFull);
        System.out.println("La versione MEDIUM è: " + formattedMedium);
        System.out.println("La versione SHORT è: " + formattedShort);
    }
}