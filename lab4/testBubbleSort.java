import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class testBubbleSort {
    private BubbleSort c;
 
    @Before
    public void setUp() throws Exception {
        // setUp()用于测试前的初始化
        c = new BubbleSort();
    }
    @Test
    public void test1() {
        int a[] = new int[]{1,6,2,2,5};
        int b[]=new int[]{2,2,2,1,2,13};
        int a1[] = new int[]{1,2,2,5,6};
        int b1[]=new int[]{1,2,2,2,2,13};
        assertEquals(Arrays.toString(a1), Arrays.toString(c.BubbleSort(a)));
        assertEquals(Arrays.toString(b1), Arrays.toString(c.BubbleSort(b)));      
    }
    @After
    public void tearDown() throws Exception {
        // tearDown()用于测试后的善后
        c = null;
    }
}