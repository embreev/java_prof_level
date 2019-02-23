import homework6.MainClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 2, 5, 6, 7}},
                {new int[]{5, 7, 2, 4, 5, 6, 5, 4, 3, 1}},
                {new int[]{3, 5, 6, 9, 0, 4, 2, 1}},
                {new int[]{1, 7, 8, 5, 3, 2, 4, 4, 1}},
                {new int[]{1, 1, 1, 2, 2, 4, 3, 3, 3, 8, 5}},
        });
    }

    private int[] a;
    MainClass mc;

    public ArrayTest(int[] a) {
        this.a = a;
    }

    @Before
    public void startTest() {
        mc = new MainClass();
    }

    @Test
    public void checkOneAndFour() {
        Assert.assertTrue(mc.checkArrayOne(a) & mc.checkArrayFour(a));
    }

    @Test
    public void splitArray() {
        Assert.assertTrue(mc.checkArrayFour(a) & mc.splitArrByFour(a).length >= 0);
    }

}