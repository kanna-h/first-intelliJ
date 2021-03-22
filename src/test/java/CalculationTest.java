import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculationTest {
    Calculation calc = mock(Calculation.class);

    @Test
    public void testAdd() {
        System.out.println("========Junit test=========");
        int a = 1; int b = 1;
        when(calc.add(a, b)).thenReturn(2);
        assertEquals(2, calc.add(a, b));
        verify(calc).add(1, 1);
    }


    @Test
    public void testSub() {
        int x = 8; int y = 3;
        when(calc.sub(x, y)).thenReturn(5);
        assertEquals(5, calc.sub(x, y));
        verify(calc).sub(8, 3);
    }
}

