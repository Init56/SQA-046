package com.luxoft.sqa.webtests.fw;

import org.omg.CORBA.ValueBaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactHelper extends BaseHelper{

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstname, String middlename) {
        click(By.linkText("add new"));
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middlename);

    }

    public void submitCreation() {

        click(By.name("submit"));
    }

    public void dell() {
        click(By.name("selected[]"));
        click(By.cssSelector("input[type=\"Button\"]"));
        driver.switchTo().alert().accept();
    }

    public void edit() {
        click(By.name("selected[]"));
        click(By.linkText("Edit"));
    }

    public void stop() {
        driver.quit();
    }

}