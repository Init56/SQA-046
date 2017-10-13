package com.luxoft.sqa.webtests.webtest;

        import org.testng.annotations.Test;


public class AddC extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getContactHelper().fillForm("Ivan", "Ivanov");
        app.getContactHelper().submitCreation();
        app.getSessionHelper().logout();
        //tearDown();
    }


}