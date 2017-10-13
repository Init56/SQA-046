package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    WebDriver driver;

    public void login(String login, String pass) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.cssSelector("input[type=\"Submit\"]")).click();
    }

    public void logout(){
        driver.findElement(By.linkText("Logout"));
    }
}
