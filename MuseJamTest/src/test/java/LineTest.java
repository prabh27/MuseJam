import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prabh on 05/02/17.
 */
public class LineTest {
    private Line line1;
    private Line line2;

    @Test
    public void Test1() {
        line1 = new Line(1, 11);
        line2 = new Line(1, 10);

        Assert.assertEquals(Line.intersect(line1, line2), false);
    }

    @Test
    public void Test2() {
        line1 = new Line(1, 10);
        line2 = new Line(5, 10);

        Assert.assertEquals(Line.intersect(line1, line2), true);
    }
}
