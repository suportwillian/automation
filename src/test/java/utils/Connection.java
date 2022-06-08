package utils;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Cria uma conexão com o chromedriver passando parâmetros para o Google Chrome. 
 */
public class Connection {
    @Test
    public WebDriver newConnection() {
        System.setProperty("webdriver.chrome.driver", Variables.dirDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return (driver);
    }
}
