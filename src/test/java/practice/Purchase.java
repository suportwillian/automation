package practice;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Elements;
import utils.Variables;

/*
 * Realiza a autenticação no site  http://automationpractice.com/;
 * Adiciona os produtos: 
 *   -Printed Chiffon Dress na cor verde e tamanho "M";
 *   -Faded Short Sleeve T-shirts na cor azul;
 *   -Blouse na quantidade 2;
 *   -Printed Dress;
 * Finaliza o fluxo de compra até o pagamento.
 */
public class Purchase {
        @Test
        public void purchase() {
                WebDriver driver = new Authenticate().authenticate();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.elementToBeClickable(Elements.inputSearch));
                driver.findElement(Elements.inputSearch).sendKeys(Variables.dressPrinted);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSearch));
                driver.findElement(Elements.buttonSearch).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.textToBePresentInElementLocated(Elements.product,
                                                "Printed Chiffon Dress"));
                driver.findElement(Elements.product).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.colorProduct));
                driver.findElement(Elements.colorProduct).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.selectSize));
                driver.findElement(Elements.selectSize).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttoAddCart));
                driver.findElement(Elements.buttoAddCart).click();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonAdd));
                driver.findElement(Elements.buttonAdd).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.inputSearch));
                driver.findElement(Elements.inputSearch).clear();
                driver.findElement(Elements.inputSearch).sendKeys(Variables.shirt);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSearch));
                driver.findElement(Elements.buttonSearch).click();

                new WebDriverWait(driver, Duration.ofSeconds(3)).until(
                                ExpectedConditions.textToBePresentInElementLocated(Elements.product1,
                                                "Faded Short Sleeve T-shirts"));
                driver.findElement(Elements.product1).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.colorProduct1));
                driver.findElement(Elements.colorProduct1).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttoAddCart));
                driver.findElement(Elements.buttoAddCart).click();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonAdd2));
                driver.findElement(Elements.buttonAdd2).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.inputSearch));
                driver.findElement(Elements.inputSearch).clear();
                driver.findElement(Elements.inputSearch).sendKeys(Variables.blouse);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSearch));
                driver.findElement(Elements.buttonSearch).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.textToBePresentInElementLocated(Elements.product2, "Blouse"));
                driver.findElement(Elements.product2).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonPlus));
                driver.findElement(Elements.buttonPlus).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttoAddCart));
                driver.findElement(Elements.buttoAddCart).click();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonAdd2));
                driver.findElement(Elements.buttonAdd2).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.inputSearch));
                driver.findElement(Elements.inputSearch).clear();
                driver.findElement(Elements.inputSearch).sendKeys(Variables.dress);

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonSearch));
                driver.findElement(Elements.buttonSearch).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.textToBePresentInElementLocated(Elements.product3,
                                                "Printed Dress"));
                driver.findElement(Elements.product3).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttoAddCart));
                driver.findElement(Elements.buttoAddCart).click();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonCheckout));
                driver.findElement(Elements.buttonCheckout).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonCheckoutDefault));
                driver.findElement(Elements.buttonCheckoutDefault).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonCheckoutDefault1));
                driver.findElement(Elements.buttonCheckoutDefault1).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonTerms));
                driver.findElement(Elements.buttonTerms).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonCheckoutDefault2));
                driver.findElement(Elements.buttonCheckoutDefault2).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonPayBank));
                driver.findElement(Elements.buttonPayBank).click();

                new WebDriverWait(driver, Duration.ofSeconds(3))
                                .until(ExpectedConditions.elementToBeClickable(Elements.buttonConfirmOrder));
                driver.findElement(Elements.buttonConfirmOrder).click();

                new WebDriverWait(driver, Duration.ofSeconds(5))
                                .until(ExpectedConditions.textToBePresentInElementLocated(Elements.checkOrderComplete,
                                                "Your order on My Store is complete."));
                driver.quit();
        }
}
