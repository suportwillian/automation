package practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Connection;
import utils.Elements;
import utils.Variables;

/*
 * Cria uma nova conta no site. 
 */
public class CreateAccount {
        @Test
        public void create() {
                WebDriver driver = new Connection().newConnection();

                driver.get(Variables.url);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSignin));

                driver.findElement(Elements.buttonSignin).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.presenceOfElementLocated(Elements.inputEmail));
                driver.findElement(Elements.inputEmail).sendKeys(Variables.email1);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSubmit));
                driver.findElement(Elements.buttonSubmit).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.visibilityOfElementLocated(Elements.checkText));
                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.radioGender));
                driver.findElement(Elements.radioGender).click();
                driver.findElement(Elements.inputFirstname).sendKeys(Variables.Firstname);
                driver.findElement(Elements.inputLastname).sendKeys(Variables.Lastname);
                driver.findElement(Elements.inputPassword).sendKeys(Variables.Password);
                driver.findElement(Elements.selectDays).click();
                driver.findElement(Elements.selectMonths).click();
                driver.findElement(Elements.selectYears).click();
                driver.findElement(Elements.inputCompany).sendKeys(Variables.Company);
                driver.findElement(Elements.inputAddress).sendKeys(Variables.Address);
                driver.findElement(Elements.inputCity).sendKeys(Variables.City);
                driver.findElement(Elements.selectState).click();
                driver.findElement(Elements.inputZipecode).sendKeys(Variables.Code);
                driver.findElement(Elements.inputPhone).sendKeys(Variables.Phone);
                driver.findElement(Elements.inputAlias).sendKeys(Variables.Alias);
                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonRegister));
                driver.findElement(Elements.buttonRegister).click();
                driver.quit();
        }
}
