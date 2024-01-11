import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//        Verificare che la prima data è precedente alla seconda
//        Verificare che la seconda data è successiva alla prima
//        Verificare che le due date sono uguali ad ora
//        Stampa il risultato
public class Main {
    public static void main(String[] args) {

        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        String primaStringa = "2023-03-01T13:00:00Z";
        ZonedDateTime firstDate = OffsetDateTime.parse(primaStringa).toZonedDateTime();

        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        String secondaStringa = "2024-03-01T13:00:00Z";
        ZonedDateTime secondDate = OffsetDateTime.parse(secondaStringa).toZonedDateTime();

        //Verificare che la prima data è precedente alla seconda,
        //Verificare che la seconda data è successiva alla prima e
        //Verificare che le due date sono uguali ad ora
        boolean isBefore = firstDate.isBefore(secondDate);
        boolean isAfter = firstDate.isAfter(secondDate);
        boolean isEqual = firstDate.isEqual(secondDate);

        // Stampa i risultati
        System.out.println("La prima data è precedente alla seconda: " + isBefore);
        System.out.println("La seconda data è successiva alla prima: " + isAfter);
        System.out.println("Le due date sono uguali: " + isEqual);

    }
}
