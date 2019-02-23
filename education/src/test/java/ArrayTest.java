import homework6.MainClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class ArrayTest {
    private MainClass mc;
    private int[][] arrT = {{1, 2, 3, 4, 5, 6, 7},
            {5, 7, 2, 4, 5, 6, 5, 4, 3, 1},
            {3, 5, 6, 9, 0, 1, 2, 2},
            {5, 7, 8, 5, 3, 2, 4, 4, 4},
            {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4}};

    @Before
    public void startTest() {
        mc = new MainClass();
    }

    @Test
    public void testSplitByFour() {
        Assert.assertArrayEquals(new int[]{3, 5}, mc.getArr(new int[]{1, 2, 3, 4, 3, 5}));
    }

    @Test
    public void testArrOneAndFour() {
        for (int i = 0; i < arrT.length; i++) {
            Assert.assertTrue(mc.checkArrayOne(arrT[i]));
            Assert.assertTrue(mc.checkArrayFour(arrT[i]));
        }
    }

}