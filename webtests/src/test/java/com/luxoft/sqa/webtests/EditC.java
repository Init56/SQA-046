
package com.luxoft.sqa.webtests;

import org.testng.annotations.Test;



public class EditC extends TestBase{

    @Test
    public void contactDell() {
        app.getContactHelper().edit();
        //tearDown();
    }


}