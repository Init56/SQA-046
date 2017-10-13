
package com.luxoft.sqa.webtests;

import org.testng.annotations.Test;



public class DellC extends TestBase{

    @Test
    public void contactDell() {
        app.getContactHelper().dell();
        tearDown();
    }


}