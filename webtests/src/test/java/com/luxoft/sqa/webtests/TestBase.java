package com.luxoft.sqa.webtests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final Application app = new Application();

    @BeforeMethod
    public void setup() {
        app.init();


    }

    @AfterMethod
    public void tearDown(){

        app.getContactHelper().stop();
    }

}
