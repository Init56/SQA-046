package com.luxoft.sqa.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Application {
    WebDriver driver;
    ContactHelper contactHelper;
    GroupHelper groupHelper;
    NavigationHelper navigationHelper;
    SessionHelper sessionHelper;
    String browser;

    public Application(String browser) {
        this.browser = browser;
    }

    public void init() {
        if((browser.equals(BrowserType.CHROME))){
            driver = new ChromeDriver();
        }else if(browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }else if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        navigationHelper.goToLoginPage(this);
        sessionHelper.login("admin", "secret");
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void stop() {
        driver.quit();
    }
}
