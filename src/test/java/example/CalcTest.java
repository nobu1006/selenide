package example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
    private Calc calc;

    @BeforeEach
    void setup() {
        calc = new Calc();
    }

    @Test
    void testFibo1_01() {
        assertEquals(1, calc.fibo1(1));
    }

    @Test
    void testFibo1_02() {
        assertEquals(1, calc.fibo1(2));
    }

    @Test
    void testFibo1_03() {
        assertEquals(2, calc.fibo1(3));
    }

    @Test
    void testFibo1_04() {
        assertEquals(3, calc.fibo1(4));
    }

    @Test
    void testFibo1_05() {
        assertEquals(5, calc.fibo1(5));
    }

    @Test
    void testFibo1_06() {
        assertEquals(8, calc.fibo1(6));
    }

    @Test
    void testFibo1_07() {
        assertEquals(13, calc.fibo1(7));
    }

    @Test
    void testFibo1_08() {
        assertEquals(21, calc.fibo1(8));
    }

    @Test
    void testFibo1_09() {
        assertEquals(34, calc.fibo1(9));
    }

    @Test
    void testFibo1_10() {
        assertEquals(55, calc.fibo1(10));
    }

    @Test
    void testFibo1_0() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> calc.fibo1(0));
        assertEquals("引数は1から10までの整数でお願いします", e.getMessage());
    }

    @Test
    void testFibo1_11() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> calc.fibo1(11));
        assertEquals("引数は1から10までの整数でお願いします", e.getMessage());
    }



    @Test
    void testFibo2_10() {
        List<Long> fiboList = calc.fibo2(10);
        List<Long> expected = Arrays.asList(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L);
        assertIterableEquals(expected, fiboList);
    }

    @Test
    void testFibo2_0() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> calc.fibo2(0));
        assertEquals("引数は1から10までの整数でお願いします", e.getMessage());
    }

    @Test
    void testFibo2_11() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> calc.fibo2(11));
        assertEquals("引数は1から10までの整数でお願いします", e.getMessage());
    }

}
