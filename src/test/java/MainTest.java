import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSumOk1(){
        assertEquals(2.1, Main.sum(2.1));
    }

    @Test
    public void testSumOk2(){
        assertEquals(1.6, Main.sum(2.1, -0.5));
    }

    @Test
    public void testSumOk3(){
        assertEquals(10.0, Main.sum(1,2,3,4));
    }

}
