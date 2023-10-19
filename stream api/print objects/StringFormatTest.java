import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringFormatTest {

        
    
    @Test
    public void testBasic() {
        String name = "José";
        String day = "02";
        String month = "Janeiro";
        String message = "Olá "+ name +", seu agendamento foi marcado para dia "+ day +" de "+ month +".";

        assertEquals("Olá José, seu agendamento foi marcado para dia 02 de Janeiro.", message);
    }

    @Test
    public void testStringFormat() {
        String name = "José";
            String day = "02";
            String month = "Janeiro";
            String message = String.format("Olá %s, seu agendamento foi marcado para dia %s de %s.", name, day, month);

            assertEquals("Olá José, seu agendamento foi marcado para dia 02 de Janeiro.", message);
        }
}