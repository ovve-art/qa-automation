import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstSeleniumTest extends BaseTest {

    @Test
    void successfulLogin() {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("tomsmith", "SuperSecretPassword!");

        String actualMessage = loginPage.getFlashMessage();

        assertTrue(actualMessage.contains("You logged into a secure area"));
    }

    @Test
    void unsuccessfulLogin() {

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("wrongUser", "wrongPassword");

        String actualMessage = loginPage.getFlashMessage();

        assertTrue(actualMessage.contains("Your username is invalid!"));
    }

    @Test
    void successfulLogout(){

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("tomsmith", "SuperSecretPassword!");

        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

        secureAreaPage.logout();

        String actualMessage = secureAreaPage.getFlashMessage();

        assertTrue(actualMessage.contains("You logged out of the secure area!"));
    }

}
//    @Test
//    void openBrowser(){
//
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//
////        WebElement textInput = driver.findElement(By.name("my-text"));
//
////        textInput.sendKeys("Hello Selenium");
////
////
////
//        WebElement button = driver.findElement(By.cssSelector("button"));
//
//        button.click();
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//
//        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
//
//        String actual = message.getText();
//
//        assertEquals("Received!", actual);





//
//        String actual = message.getText();
//
//        assertEquals("Received!", actual);


//        WebElement textInput = driver.findElement(By.name("my-text"));
//
//        boolean displayed = textInput.isDisplayed();
//        assertTrue(displayed);
//
//        boolean enabled = textInput.isEnabled();
//        assertTrue(enabled);
//
//        textInput.sendKeys("Hello");
//
//        textInput.clear();
//
//        String type = textInput.getAttribute("type");
//
//        System.out.println(type);


//        List<WebElement> inputs = driver.findElements(By.tagName("input"));
//
//        System.out.println(inputs.size());
//
//        for(WebElement input : inputs){
//
//            System.out.println(input.getAttribute("type"));
//        }






//        String title = driver.getTitle();
//
//        assertEquals("Example Domain", title);
//
//        String url = driver.getCurrentUrl();
//
//        System.out.println(title);
//
//        System.out.println(url);
//
//        driver.navigate().to("https://google.com");
//
//        driver.navigate().back();
//
//        driver.navigate().refresh();
//
//        driver.quit();




