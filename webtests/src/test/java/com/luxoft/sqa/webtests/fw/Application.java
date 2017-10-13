package com.luxoft.sqa.webtests.fw;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {
    private final SessionHelper sessionHelper = new SessionHelper();
    ContactHelper contactHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        sessionHelper.driver = new ChromeDriver();
        sessionHelper.driver.manage().window().maximize();
        sessionHelper.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        contactHelper = new ContactHelper(sessionHelper.driver);
        sessionHelper.driver.get("http://localhost:8080/addressbook/");
        sessionHelper.login("admin", "secret");
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
