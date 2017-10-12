package com.luxoft.sqa.webtests;

        import org.testng.annotations.Test;


public class AddC extends TestBase{

    @Test
    public void testGroupCreation() {
        fillForm("Ivan", "Ivanov");
        submitCreation();
        tearDown();
    }


}