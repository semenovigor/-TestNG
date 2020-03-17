import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest extends TestBase {

    @Test
    public void checkIsGoogleLogo() {
        driver.get("https://www.google.by/");
        Assert.assertTrue(googlePage.googleLogo.isDisplayed());
    }

    @Test
    public void checkLinkSelenium(){
        googlePage.searchGoogle(GooglePage.SELENIUM);
        googlePage.submitText();

        Assert.assertTrue(googlePage.searchSelenium.isDisplayed());
        Assert.assertEquals(googlePage.searchSelenium.getText(), GooglePage.SELENIUM);
    }

    @Test
    public void checkLinksOnGoogle() throws InterruptedException {
        googlePage.countLink();
        Assert.assertEquals(googlePage.countLink(), 10);
    }
}
