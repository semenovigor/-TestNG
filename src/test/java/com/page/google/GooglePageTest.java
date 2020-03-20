package com.page.google;


import com.page.GooglePage;
import com.page.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest extends TestBase {


    @Test(priority = 1)
    public void checkIsGoogleLogo() {
        driver.get("https://www.google.by/");
        Assert.assertTrue(googlePage.checkLogoGoogle());
    }

    @Test(priority = 2)
    public void checkLinkMail(){
        googlePage.searchGoogle(GooglePage.MAIL);
        googlePage.submitText();

        Assert.assertTrue(googlePage.checkTextMail());
        Assert.assertEquals(googlePage.getTextMail(), GooglePage.MAIL);
    }

    @Test(priority = 3)
    public void checkLinksOnGoogle() {
        googlePage.countLink();
        Assert.assertEquals(googlePage.countLink(), 7);
    }

    @Test(priority = 4)
    public void clickLink() throws InterruptedException {
        visibilityLocatedElementWaiter(By.xpath("//h3[text()=\"Mail.ru: почта, поиск в интернете, новости, игры\"]"), 10);
        googlePage.clickLinkMail();

    }

}
