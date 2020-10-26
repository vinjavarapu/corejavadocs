package TestCases;

import Pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyValidLogin {

    @Test
    public void VerifyLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();

        LoginPage login = new LoginPage(driver);

               login.typeUserName();
               login.typePassword();
               login.ClickLoginButton();
               Thread.sleep(6000);

                driver.quit();

    }

}
