package com.page.mail;

import com.page.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeMailPageTest extends TestBase{


    @Test(priority = 1)
    public void inputLoginTrue(){
        homeMailPage.inputLoginInTextBoxMail("kod.kryshitel");
        homeMailPage.clickLoginButton();
    }

    @Test(priority = 2)
    public void inputPasswordTrue(){
        homeMailPage.inputPasswordInTextBoxMail("q1w2e3r4t5y6");
        homeMailPage.clickLoginButton();
    }

    @Test(priority = 3)
    public void checkButtonLogout(){
        visibilityLocatedElementWaiter(By.id("PH_logoutLink"),10);
        Assert.assertTrue(homeMailPage.checkButtonLogout());
    }

    @Test(priority = 4)
    public void logoutMail(){
        homeMailPage.clickLogoutButton();

    }
    @Test(dependsOnMethods = "logoutMail")
    public void clearInputTextBoxMail(){
        homeMailPage.clearTextBox();
    }

}
