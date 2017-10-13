package com.luxoft.sqa.webtests.webtest;
import com.luxoft.sqa.webtests.fw.Application;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public Application app = new Application();

    @BeforeMethod
    public void setup() {
        app.init();


    }

    @AfterMethod
    public void tearDown(){

        app.getContactHelper().stop();
    }

}
