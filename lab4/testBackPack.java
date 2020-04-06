import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class testBackPack {
    private BackPack c;
 
    @Before
    public void setUp() throws Exception {
        // setUp()用于测试前的初始化
        c = new BackPack();
    }
    @Test
    public void test2() {
    int m = 10;
        int n = 3;
    int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int a[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4},
            {0, 0, 0, 4, 5, 5, 5, 9, 9, 9, 9},
            {0, 0, 0, 4, 5, 6, 6, 9, 10, 11, 11}};
        Assert.assertArrayEquals(a,c.BackPack_Solution(m, n, w, p));     
    }
    @After
    public void tearDown() throws Exception {
        // tearDown()用于测试后的善后
        c = null;
    }
}