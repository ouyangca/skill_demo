import static org.junit.Assert.*;
import org.junit.*;

public class IncrementTest {
    @Test
    public void Incrementation() {
        assertEquals(2, Increment.increment(1));
    }
}
