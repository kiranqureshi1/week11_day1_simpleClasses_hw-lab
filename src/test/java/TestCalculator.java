import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3, 2);
    }

    @Test
    public void canGetNumber1(){
        assertEquals(3, calculator.getNumber1());
    }

    @Test
    public void canGetNumber2(){
        assertEquals(2, calculator.getNumber2());
    }

    @Test
    public void canSetnumber1(){
        calculator.setNumber1(5);
        assertEquals(5, calculator.getNumber1());
    }
//
//    @Test
//    public void canSetNumber2(){
//        assertEquals(7, calculator.setNumber2());
//    }


    @Test
    public void canAddNumbers(){
        assertEquals(5, calculator.addNumbers());
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(1, calculator.subtractNumbers());
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(6, calculator.multiplyNumbers());
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(1.5, calculator.divideNumbers(), 0.001);
    }
}
