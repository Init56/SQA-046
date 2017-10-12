package com.luxoft.sqa.webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AddC {
    WebDriver driver;

    @Test
    public void testGroupCreation() {
        fillForm("Ivan", "Ivanov");
        submitCreation();
        tearDown();
    }

    @BeforeMethod
    private void setup() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/addressbook/");
        login("admin", "secret");


    }
    private void login(String login, String pass) {
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.cssSelector("input[type=\"Submit\"]")).click();
    }

    private void fillForm(String firstname, String middlename) {
        driver.findElement(By.linkText("add new")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys(middlename);

    }

    private void submitCreation() {
        driver.findElement(By.name("submit")).click();
    }
    @AfterMethod
    public void tearDown(){

        driver.quit();
    }


}