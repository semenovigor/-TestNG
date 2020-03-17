import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class TestBase {

    protected WebDriver driver;

    protected GooglePage googlePage = PageFactory.initElements(getDriver(), GooglePage.class);


    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/TestNG/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return  driver;
    }

    @AfterClass
    public void quitGoogle(){
        driver.quit();
    }
}
