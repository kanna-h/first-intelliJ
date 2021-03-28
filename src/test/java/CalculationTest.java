import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculationTest {
    Calculation calc = mock(Calculation.class);

    @Test
    public void testAdd() {
        System.out.println("========Junit test=========");
        int a = 3; int b = 3;
        when(calc.add(a, b)).thenReturn(6);
        assertEquals(6, calc.add(a, b));
        verify(calc).add(3, 3);
    }


    @Test
    public void testSub() {
        int x = 6; int y = 3;
        when(calc.sub(x, y)).thenReturn(3);
        assertEquals(3, calc.sub(x, y));
        verify(calc).sub(6, 3);
    }
    @Test
    public void dummy(){
        System.out.println("**************DUMMY TEST CASE ADDED************");
        assertEquals(5, 5);
    }
}

