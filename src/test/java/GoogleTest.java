import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;


public class GoogleTest {

    @Test
    public void googleTest() {
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/TestNG/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.by/");

        WebElement googleLogo = driver.findElement(By.id("hplogo"));
        System.out.println("\n" + googleLogo.isDisplayed());
        Assert.assertTrue(googleLogo.isDisplayed());
        System.out.println("Element is displayed ");
        driver.close();
    }
}
