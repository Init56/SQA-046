
package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.testng.annotations.Test;



public class EditC extends TestBase {

    @Test
    public void contactDell() {
        if(! app.getContactHelper().isThereAGroup()){
            app.getContactHelper().creteGroup(new GroupData("Test1","Test2", "Test3"));
        app.getContactHelper().edit();
        //tearDown();
    }


}