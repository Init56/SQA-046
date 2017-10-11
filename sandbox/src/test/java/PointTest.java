import com.luxoft.sqa.Point;



        import org.testng.Assert;
        import org.testng.annotations.Test;


public class PointTest {

    @Test
    public void testAreaPoint() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Assert.assertEquals(p1.sayAreaPoint(p2), 0.0);
    }
}
