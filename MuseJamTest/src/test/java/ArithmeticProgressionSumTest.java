import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prabh on 05/02/17.
 */
public class ArithmeticProgressionSumTest {

    ArithmeticProgressionSum arithmeticProgressionSum = new ArithmeticProgressionSum();


    @Test
    public void Test1() {
        int sum = arithmeticProgressionSum.getAPSum(1, 1, 1);
        Assert.assertEquals(sum, 1);
    }

    @Test
    public void Test2() {
        int sum = arithmeticProgressionSum.getAPSum(1, 1, 5);
        Assert.assertEquals(sum, 15);
    }

    @Test
    public void Test3() {
        int sum = arithmeticProgressionSum.getAPSum(1, 1, 100);
        Assert.assertEquals(sum, 5050);
    }
}
