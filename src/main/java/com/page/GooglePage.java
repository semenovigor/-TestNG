package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class GooglePage extends BasePage{

     WebDriver driver;

     public final  static String MAIL = "Mail.ru: почта, поиск в интернете, новости, игры";

@FindBy(id = "hplogo")
    protected WebElement googleLogo;
@FindBy(name = "q")
    protected WebElement inputTextGoogle;
@FindBy(xpath = "//h3[text()=\"Mail.ru: почта, поиск в интернете, новости, игры\"]")
    public WebElement mailRU;
@FindBy(xpath = "//div[@class='g']")
    protected List <WebElement> countLinksOnGoogle;


public void searchGoogle(String strGoogle)
{
    inputTextGoogle.sendKeys(strGoogle);
}

public void submitText()
{
    inputTextGoogle.submit();

}

public boolean checkLogoGoogle()
{
    return googleLogo.isDisplayed();
}

public boolean checkTextMail()
{
    return mailRU.isDisplayed();
}

public String getTextMail()
{
    return mailRU.getText();
}

public void clickLinkMail()
{
    mailRU.click();
}

public int countLink()
{
    int countLink = countLinksOnGoogle.size();
    System.out.println("Count link " + countLink);
    return countLink;
}

}

