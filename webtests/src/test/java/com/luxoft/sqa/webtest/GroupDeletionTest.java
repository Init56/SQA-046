package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().creteGroup(new GroupData("Test1","Test2", "Test3"));

        };
        app.getGroupHelper().selectFirstGroup();
        app.getGroupHelper().deleteGroup();
    }

}