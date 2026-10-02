import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavaScriptAlertsPage extends BasePage {

    private static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";

    private By jsConfirmButton = By.cssSelector("button[onclick='jsConfirm()']");
    private By jsPromptButton = By.cssSelector("button[onclick='jsPrompt()']");
    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);
        wait.until(ExpectedConditions.elementToBeClickable(jsConfirmButton));
    }

    public void clickJsConfirm() {
        driver.findElement(jsConfirmButton).click();
    }

    public void clickJsPrompt() {
        driver.findElement(jsPromptButton).click();
    }

    public String getAlertText() {
        return waitForAlert().getText();
    }

    public void dismissAlert() {
        waitForAlert().dismiss();
    }

    public void typeInPromptAndAccept(String text) {
        Alert alert = waitForAlert();

        alert.sendKeys(text);
        alert.accept();
    }

    public String getResult() {
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(result)
        );

        return message.getText();
    }

    private Alert waitForAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }
}
