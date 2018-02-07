import org.junit.Test;

import static org.junit.Assert.*;

public class calculateTest {
    @Test
    public void isMultiple()
    {
        Calculate m = new Calculate();

        assertEquals(true, m.isMultiple(3));
        assertEquals(true, m.isMultiple(6));
        assertEquals(false, m.isMultiple(88));
        assertEquals(true, m.isMultiple(63));

        assertEquals(true, m.isMultiple(5));

    }

    @Test
    public void sum() {
        Calculate calculate = new Calculate();
        assertEquals(1, calculate.getSumOfMultiples(0,1));
        assertEquals(2, calculate.getSumOfMultiples(1,1));
        assertEquals(3, calculate.getSumOfMultiples(2,1));
    }

    @Test
    public void getSumOfMultiples(){
        Calculate calculate = new Calculate();
            assertEquals(0, calculate.getSumOfMultiples(1));
            assertEquals(23, calculate.getSumOfMultiples(10));
            assertEquals(233168, calculate.getSumOfMultiples(1000));
    }

}