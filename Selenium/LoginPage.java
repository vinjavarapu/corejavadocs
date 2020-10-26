package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By username = By.name("uid");
    By Password = By.name("password");
    By LoginButton = By.name("btnLogin");
    By ResetButton = By.name("btnReset");

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void typeUserName() {

        driver.findElement(username).sendKeys("mngr271710");
    }
    public void typePassword() {

        driver.findElement(Password).sendKeys("Uqesasy");
    }
    public void ClickLoginButton() {

        driver.findElement(LoginButton).click();
    }
    public void ClickResetBButton() {

        driver.findElement(ResetButton).click();
    }

}
