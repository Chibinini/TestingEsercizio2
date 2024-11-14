import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //creo un offsetime e gli passo la data
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        //Formatto la data dichiarata prima in LONG
        String dataFormattata = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        //MEDIUM
        String dataFormattata2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        //SHORT
        String dataFormattata3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        //Stampo il risultato di tutte le formattazioni
        System.out.println("Data formattata in LONG: " + dataFormattata);
        System.out.println("Data formattata in MEDIUM: " + dataFormattata2);
        System.out.println("Data formattata in short: " + dataFormattata3);
    }
}

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio