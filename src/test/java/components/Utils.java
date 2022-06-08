package components;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

        /*
         * Método que realiza conexão com o GoogleChrome utilizando o driver chromedriver.
         */
        @Test
        public WebDriver newConnection() {
                System.setProperty("webdriver.chrome.driver", Variables.dirDriver);
                WebDriver driver = new ChromeDriver();
                driver.get(Variables.url);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                return (driver);
        }

        /*
         * Método para realizar autenticação no site.
         */
        @Test
        public WebDriver authenticate() {
                WebDriver driver = new Utils().newConnection();
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

        /*
         * Método responsável pela criação do usuário.
         */
        @Test
        public WebDriver createAccount() {
                WebDriver driver = new Utils().newConnection();

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
                new WebDriverWait(driver, Duration.ofSeconds(4))
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
                return (driver);
        }
}