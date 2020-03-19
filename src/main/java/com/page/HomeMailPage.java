package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMailPage extends BasePage{

    WebDriver driver;

    @FindBy(name = "login")
    protected WebElement loginMail;
    @FindBy(xpath = "//input[@class = \"o-control\"]")
    protected WebElement buttonLogin;
    @FindBy(name = "password")
    protected WebElement passwordMail;
    @FindBy(id = "mailbox:error")
    protected WebElement errorMessage;
    @FindBy(id = "PH_logoutLink")
    protected WebElement buttonLogout;


    public void inputLoginInTextBoxMail(String strLogin)
    {
        loginMail.sendKeys(strLogin);
    }

    public void clickLoginButton()
    {
        buttonLogin.click();
    }

    public void inputPasswordInTextBoxMail(String strPassword)
    {
        passwordMail.sendKeys(strPassword);
    }

    public void clickLogoutButton()
    {
        buttonLogout.click();
    }

    public boolean isError()
    {
        return errorMessage.isDisplayed();
    }

    public boolean checkButtonLogout()
    {
        return buttonLogout.isDisplayed();
    }

}
