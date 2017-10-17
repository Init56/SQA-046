package com.luxoft.sqa.webtest;

import com.luxoft.sqa.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class GroupDeletionTest extends TestBase{

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test", "test", "test"));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        int index = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup(index -1);
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();

        before.remove(before.size()-1);
        Assert.assertEquals(before, after);
    }


}