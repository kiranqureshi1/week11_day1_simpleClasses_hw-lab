import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWaterBottle {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }


    @Test
    public void EmptyBottle(){
        waterBottle.emptyBottle();
        assertEquals(90, waterBottle.getVolume() );
    }

    @Test
    public void EmptybottleCompletely(){
        waterBottle.emptyBottleCompletely();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void FillBottleToTheTop(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}
