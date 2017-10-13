package com.luxoft.sqa.webtests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactHelper {

    private WebDriver driver;

    public ContactHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm(String firstname, String middlename) {
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middlename);

    }

    public void submitCreation() {

        driver.findElement(By.name("submit")).click();
    }

    public void dell() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.cssSelector("input[type=\"Button\"]")).click();
        driver.switchTo().alert().accept();
    }

    public void edit() {
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.linkText("Edit")).click();
    }

    public void stop() {
        driver.quit();
    }

}