import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    //Nome del test parlante
    void testControllaCheLaDataNonSiaNull() {
        //oggetto che va sempre passato per renderlo indipendente
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //verifica che l'oggetto non sia null
        assertNotNull(data, "L'oggetto creato non è null");

    }

    @Test
    void testControllaCheIcampiSianoValidi() {
        //Oggetto
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //Verifica che i campi siano corretti
        assertEquals(2002, data.getYear(), "L'anno dovrebbe essere 2002");
        assertEquals(3, data.getMonthValue(), "Il mese dovrebbe essere marzo");
        assertEquals(1, data.getDayOfMonth(), "Il giorno dovrebbe essere 1");
        assertEquals(13, data.getHour(), "L'ora dovrebbe essere 13");
    }

    @Test
    void testDataInvalida() {

        String invalidDate = "invalid-date-format";

        //controllo che lancia un eccezione se il formato della data non è valido
        assertThrows(DateTimeParseException.class, () -> {
            OffsetDateTime.parse(invalidDate);
        }, "Formato della data non valido");
    }
}


