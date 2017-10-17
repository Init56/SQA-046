package com.luxoft.sqa.webtest;
import com.luxoft.sqa.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test", "test2", "test3"));
        }
        int index = app.getGroupHelper().getGroupCount();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(index -1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(before.get(index-1).getId(),"test-name", "test-test", "test-test");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();

        before.remove(index -1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}