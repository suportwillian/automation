package practice;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Connection;
import utils.Elements;
import utils.Variables;

public class Authenticate {
    @Test
    public WebDriver authenticate() {
        WebDriver driver = new Connection().newConnection();
        driver.get(Variables.url);
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSignin));

        driver.findElement(Elements.buttonSignin).click();

        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(Elements.inputEmail2));
        driver.findElement(Elements.inputEmail2).sendKeys(Variables.email);
        driver.findElement(Elements.inputPassword).sendKeys(Variables.Password);
        driver.findElement(Elements.buttonLogin).click();
        return driver;
    }
}
