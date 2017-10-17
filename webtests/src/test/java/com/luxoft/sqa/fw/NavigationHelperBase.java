package com.luxoft.sqa.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelperBase extends HelperBase {


    NavigationHelperBase(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    public void goToLoginPage() {
        driver.get("http://localhost:8080/addressbook/");
    }


    public void gotoHomePage(){
        if(isElementPresent(By.id("maintable"))){
            return;
        }click(By.linkText("home"));
    }
}