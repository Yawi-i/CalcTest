package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @Test
    void testAdd() {
        assertEquals(2, myCalc.add());
    }

    @Test
    void testSubtract() {
        assertEquals(0, myCalc.subtract());
    }

    @AfterEach
    void tearDown() {
    }
}
