import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class GooglePage {

     WebDriver driver;

     protected  final  static String SELENIUM = "Selenium";

@FindBy(id = "hplogo")
    protected WebElement googleLogo;
@FindBy(name = "q")
    protected WebElement inputTextGoogle;
@FindBy(xpath = "//h3[text()=\"Selenium\"]")
    protected WebElement searchSelenium;
@FindBy(xpath = "//div[@class = 'srg']//div[@class='g']")
    protected List <WebElement> countLinksOnGoogle;



public void searchGoogle(String strGoogle){
    inputTextGoogle.sendKeys(strGoogle);

}

public void submitText(){
    inputTextGoogle.submit();
}

public int countLink(){
    int countLink = countLinksOnGoogle.size();
    System.out.println("Count link " + countLink);
    return countLink;
}

}

