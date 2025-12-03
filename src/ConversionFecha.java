import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversionFecha {
    public static String convertirFecha(String fechaTexto) {
        LocalDate fecha = LocalDate.parse(fechaTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return fecha.format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy"));
    }
}
