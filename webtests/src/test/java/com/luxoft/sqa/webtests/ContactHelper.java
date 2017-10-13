package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactHelper {

    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void fillForm(String firstname, String middlename) {
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middlename);

    }

    protected void submitCreation() {

        driver.findElement(By.name("submit")).click();
    }

    protected void dell() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.cssSelector("input[type=\"Button\"]")).click();
        driver.switchTo().alert().accept();
    }

    protected void edit() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.linkText("Edit")).click();
    }

    protected void stop() {
        driver.quit();
    }

}