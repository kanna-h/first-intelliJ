import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculationTest {
    Calculation calc = mock(Calculation.class);

    @Test
    public void testAdd() {
        System.out.println("========Junit test=========");
        int a = 2; int b = 4;
        when(calc.add(a, b)).thenReturn(6);
        assertEquals(6, calc.add(a, b));
        verify(calc).add(a, b);
    }
}
