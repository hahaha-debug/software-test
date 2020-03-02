package lab1;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestGet {
	private int input1;
	private int input2;
	private boolean expected;
	private getMoney cal = null;
	
	public TestGet(int input1,int input2,boolean expected){
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		cal = new getMoney();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
		return Arrays.asList(new Object[][]{
			{100,0,false},
			{93,0,true},
			{0,0,true},
			{49,0,false},
			{53,0,true},
			{70,0,true},
			{-1,0,false},
			});
	}
	
	@Test
	public void testAdd() {
		assertEquals(this.expected,cal.judge(input1, input2));
	}
}
