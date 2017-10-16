package com.luxoft.sqa.webtest;

        import com.luxoft.sqa.model.ContactData;
        import org.testng.annotations.Test;


public class AddC extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getContactHelper().fillContactForm(ContactData contactData);
        app.getContactHelper().submitContactpCreation();
        app.getSessionHelper().logout();
        //tearDown();
    }


}