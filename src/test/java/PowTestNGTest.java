import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ZV on 04.10.2018.
 */
public class PowTestNGTest {
    @DataProvider(name = "data")
    public Object[][] data() {
        return new Object[][]{
                {1, 1, 1},
                {1, 0, 1},
                {2, 0, 1},
                {0, 0, 1},
                {0, 1, 0},
                {-3, 0, 1},
                {2, 2, 4},
                {5, 3, 125},
                {-5, 3, -125},
                {2, 10, 1024},
                {-2, 10, 1024}};
    }

    @Test(dataProvider = "data")
    public void testPow(int a, int b, int expected) throws Exception {
        assertEquals(Pow.pow(a, b), expected);
    }

}