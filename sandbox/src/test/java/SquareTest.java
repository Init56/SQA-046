package com.luxoft.sqa;


import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTest {

    @Test
    public void testAreaSquare(){
        Square s = new Square(5);
        Assert.assertEquals(s.sayArea(), 25.0);
    }

    @Test
    public void testAreaRectangle(){
        Rectangle r = new Rectangle(2, 2);
        assert r.sayArea() == 4;
    }
}