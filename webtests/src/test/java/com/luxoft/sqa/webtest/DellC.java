
package com.luxoft.sqa.webtest;

import org.testng.annotations.Test;



public class DellC extends TestBase {

    @Test(enabled = false)
    public void contactDell() {
        app.getContactHelper().dell();
        tearDown();
    }


}