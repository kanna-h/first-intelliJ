import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculationTest {
    Calculation calc = mock(Calculation.class);

    @Test
    public void testAdd() {
        System.out.println("========Junit test=========");
        int a = 4; int b = 6;
        when(calc.add(4, 6)).thenReturn(10);
        assertEquals(10, calc.add(a, b));
        verify(calc).add(a, b);
    }


    @Test
    public void sub() {
        int x = 8; int y = 3;
        when(calc.sub(x, y)).thenReturn(5);
        assertEquals(5, calc.sub(x, y));
        verify(calc).sub(8, 3);
    }
}