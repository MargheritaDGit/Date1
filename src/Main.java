//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {


        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);


        String formattedFull = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String formattedMedium = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String formattedShort = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));


        System.out.println("La versione FULL è: " + formattedFull);
        System.out.println("La versione MEDIUM è: " + formattedMedium);
        System.out.println("La versione SHORT è: " + formattedShort);
    }
}