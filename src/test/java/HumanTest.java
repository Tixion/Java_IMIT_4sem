import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class HumanTest {
    @Test
    public void equalTest(){
        Human Jake = new Human("Jake", "Json", "Humanoidov", 17);
        Human Cake = new Human("Jake", "Json", "Humanoidov", 17);
        assertTrue(Jake.equals(Cake));
    }
}
