package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;


public class TestBase {

    protected static WebDriver driver;


    protected GooglePage googlePage = PageFactory.initElements(getDriver(), GooglePage.class);

    protected HomeMailPage homeMailPage = PageFactory.initElements(getDriver(), HomeMailPage.class);


    public WebDriver getDriver() {
        if(driver==null){

            System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/TestNG/src/main/resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return  driver;
    }

    protected void visibilityLocatedElementWaiter(By by, Integer time) {
        new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    @AfterSuite
    public void quitGoogle(){
        driver.quit();
    }
}
