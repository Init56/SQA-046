
package com.luxoft.sqa.webtests.webtest;

import org.testng.annotations.Test;



public class EditC extends TestBase {

    @Test
    public void contactDell() {
        app.getContactHelper().edit();
        //tearDown();
    }


}